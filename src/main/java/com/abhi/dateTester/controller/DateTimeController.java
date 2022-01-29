package com.abhi.dateTester.controller;

import com.abhi.dateTester.dto.DateTimeDto;
import com.abhi.dateTester.entity.DateTest;
import com.abhi.dateTester.service.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 29/01/2022
 * Time: 12:26 am
 */
@RestController
@RequestMapping("/test-date")
public class DateTimeController {

    @Autowired
    DateTimeService dateTimeService;


    @PostMapping()
    public ResponseEntity<DateTest> saveDateTest(DateTimeDto dateTimeDto){
        DateTest dateTest = dateTimeService.saveDate(dateTimeDto);


        return new ResponseEntity<>(dateTest, HttpStatus.CREATED);
    }

}
