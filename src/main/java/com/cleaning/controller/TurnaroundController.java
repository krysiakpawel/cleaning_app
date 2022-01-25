package com.cleaning.controller;


import com.cleaning.service.TurnaroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/turnaround")
public class TurnaroundController {


    @Autowired
    TurnaroundService turnaroundService;


    public void getTodayTurnarounds(){
    }


    public void findTurnaroundByFlightNumber(){

    }

}
