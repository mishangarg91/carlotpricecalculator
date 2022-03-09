package com.cars.republic;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.cars.republic.calculate.PriceCalculator;
import com.cars.republic.model.CarLot;
import com.cars.republic.model.CarLotDTO;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadFile {

  public static void main(String[] args) throws IOException, CsvException {

    String filePath = "C:\\Users\\akki\\Downloads\\car-lot.csv";

    List<String[]> readData;
    try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
      readData = reader.readAll();
    }

    List<CarLot> cars = new ArrayList<>();
    for (String[] arr : readData.subList(1, readData.size())) {
      CarLotDTO dto = new CarLotDTO(arr[0], arr[1], arr[2], arr[3], arr[4]);
      try {
        CarLot car = validateData(dto);
        PriceCalculator price = new PriceCalculator();
        car.setPrice(price.calculatePrice(car));
        cars.add(car);
      } catch (Exception e) {
        System.err.println("Invalid data found at car # : " + dto.getCarNo());
      }
    }
    System.out.println("Car #\t-\tPrice");
    cars.stream().sorted(Comparator.comparingInt(CarLot::getCarNo))
        .forEach(i -> System.out.println(i.getCarNo() + "\t-\t" + i.getPrice()));
  }

  private static CarLot validateData(CarLotDTO dto) {
    CarLot result = new CarLot();
    result.setCarNo(Integer.parseInt(dto.getCarNo()));
    result.setBasePrice(Integer.parseInt(dto.getBasePrice()));
    result.setColor(dto.getColor());
    result.setNoOfWheel(Integer.parseInt(dto.getNoOfWheel()));
    result.setAmphibious(Boolean.parseBoolean(dto.getAmphibious()));
    return result;
  }
}