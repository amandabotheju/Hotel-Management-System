package com.fot.hotelmanagementsystem.controller;

import com.fot.hotelmanagementsystem.service.AnnualProfitService;
import com.fot.hotelmanagementsystem.service.TodayNotPaidServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todayNotPaid")
public class TodayNotPaidController {
    @Autowired
    TodayNotPaidServices todayNotPaidServices;

    @GetMapping("/all")
    public List<Object[]> getTodayNotPaidAmount(){
        return todayNotPaidServices.getTodayNotPaidAmount();
    }
}
