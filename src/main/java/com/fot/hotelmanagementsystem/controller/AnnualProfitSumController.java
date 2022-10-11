package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import com.fot.hotelmanagementsystem.service.AnnualProfitSumServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/annualProfitSum")
public class AnnualProfitSumController {
    @Autowired
    AnnualProfitSumServices annualProfitSumService;

    @GetMapping("/all")
    public List<Object[]> getAnnualSum(){
        return annualProfitSumService.getAnnualSum();
    }
}
