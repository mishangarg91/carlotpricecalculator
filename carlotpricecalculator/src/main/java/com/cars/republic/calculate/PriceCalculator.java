package com.cars.republic.calculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.cars.republic.model.CarLot;
import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.fathzer.soft.javaluator.StaticVariableSet;

public class PriceCalculator {

  private static final List<String> carColor =
      new ArrayList<>(Arrays.asList("METALIC", "CHROMATIC"));

  public Double calculatePrice(CarLot car) {

    DoubleEvaluator evaluator = new DoubleEvaluator();

    double basePrice = car.getBasePrice();
    String color = car.getColor();
    int noWheelDrive = car.getNoOfWheel();
    boolean amphibious = car.isAmphibious();

    String priceExpression = "";
    
    // calculating base price..
    if (basePrice > 150) {
      priceExpression = "(base_price*1.20)";
    } else {
      priceExpression = "(base_price)";
    }

    // calculating color cost..
    String colorCost = "(0)";
    if (carColor.contains(color.toUpperCase())) {
      colorCost = "(500)";
    }

    // calculating off road price..
    String offRoad = "(2000)";
    if (noWheelDrive >= 4 && amphibious) {
      offRoad = "(0)";
    }

    // calculating final price..
    String carPrice = priceExpression + "+" + colorCost + "+" + offRoad;
    final StaticVariableSet<Double> variables = new StaticVariableSet<>();
    variables.set("base_price", basePrice);

    return evaluator.evaluate(carPrice, variables);
  }
}