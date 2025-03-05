package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.Service.CarService;
import web.Service.CarServiseImpl;

import java.util.Arrays;
import java.util.List;

@Controller()
@RequestMapping("/cars")
public class CarController {
    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        CarService carService = new CarServiseImpl();
        List<Car> cars = Arrays.asList(
                new Car("бугати", 1, 10_000),
                new Car("жигули", 20, 100_000),
                new Car("бентли", 7, 1_000),
                new Car("мерседес", 4, 12_000),
                new Car("нива", 12, 17_000));
        if (count == null) {
            model.addAttribute("messages", cars);
        } else {
            List<Car> a = carService.carsCount(cars, count);
            model.addAttribute("messages", a);
        }
        return "cars";
    }

}

