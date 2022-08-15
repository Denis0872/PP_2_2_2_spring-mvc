package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {
    CarServiceImpl carsServiceImpl = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String outputCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {

        List<Car> listCars = carsServiceImpl.carList(count);
        model.addAttribute("carsAtt", listCars);
        return "cars";
    }


}
