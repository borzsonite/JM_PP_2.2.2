package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarDao carDao;

    @GetMapping()
    public String getAllCars(Model model) {
        model.addAttribute("carList", carDao.getCars());
        System.out.println(carDao.getCars());
        return "car";
    }

    @GetMapping("/{count}")
    public String getCars(@PathVariable("count") int count, Model model) {
        System.out.println("!!!!!!!!!!  " + count);
        return null;
    }

}
