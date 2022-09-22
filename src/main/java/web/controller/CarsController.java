package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    private final CarService carsService;
    public CarsController(CarService carService) {
        this.carsService = carService;
    }


    @GetMapping(value = "/cars")
    public String outputCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {

        List<Car> listCars = carsService.carList(count);
        model.addAttribute("carsAtt", listCars);
        return "cars";
    }


}
