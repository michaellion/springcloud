package com.tme.Controller;


import com.tme.Service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi serviceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return serviceHi.sayHiFromClientOne();
    }


}

