package web.Service;

import web.Car;

import java.util.List;

public interface CarService {
    List<Car> carsCount(List list, Integer count);
}
