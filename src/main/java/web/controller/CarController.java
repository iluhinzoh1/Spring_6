package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/cars")
public class CarController {
    @GetMapping()
    public String printCars(ModelMap model) {
        return "cars";
    }

}

