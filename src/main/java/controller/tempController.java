package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TempService;

@RestController
public class tempController {

    @Autowired
    TempService service;

    @GetMapping("/tmp")
    public double getTemp(String mnd){
        return service.getTemp(mnd);
    }
}
