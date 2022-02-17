package controller;

import model.Amount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CurrencyService;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyService service;

    @PostMapping("/load")
    public void load(){
        service.loadCurrensies();

    }

    @GetMapping
    public double calculate(Amount amount){
        return service.calculate(amount);
    }
}
