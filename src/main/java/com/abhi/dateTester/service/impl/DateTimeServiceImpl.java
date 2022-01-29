package com.abhi.dateTester.service.impl;

import com.abhi.dateTester.dto.DateTimeDto;
import com.abhi.dateTester.entity.DateTest;
import com.abhi.dateTester.repository.DateTimeRepository;
import com.abhi.dateTester.service.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.TimeZone;


/**
 * Created by Intellij.
 * Author: abhis
 * Date: 29/01/2022
 * Time: 12:07 am
 */
@Service
public class DateTimeServiceImpl implements DateTimeService {

    @Autowired
    DateTimeRepository dateTimeRepository;

    @Override
    public DateTest saveDate(DateTimeDto dateTimeDto) {

        try{
            DateTest dateTest = new DateTest();

            Date date = new Date();

//            SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
//            isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//            Date date = isoFormat.parse("2010-05-23T09:01:02");

            TimeZone tz = TimeZone.getTimeZone("Asia/Colombo");
            TimeZone.setDefault(tz);


            System.out.println("date.getTimezoneOffset() -- " + date.getTimezoneOffset());

            dateTest.setSqlDate(new java.sql.Date(System.currentTimeMillis()));
            dateTest.setUtilDate(date);
            dateTest.setRecordCreatedAt(date);

            DateTest save = dateTimeRepository.save(dateTest);
            return save;
        }catch (Exception e){
            throw e;
        }
    }

}
