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
    public String getNumberOfCars(@RequestParam(value = "count", required = false) Integer number, Model model) {
        if(number==null) {
            model.addAttribute("carList", carDao.getCars(0));
        } else {
            model.addAttribute("carList", carDao.getCars(number));
        }
        return "car";

    }

}
