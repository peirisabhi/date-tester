package com.abhi.dateTester.service;

import com.abhi.dateTester.dto.DateTimeDto;
import com.abhi.dateTester.entity.DateTest;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 28/01/2022
 * Time: 11:58 pm
 */
public interface DateTimeService {

    DateTest saveDate(DateTimeDto dateTimeDto);

}
