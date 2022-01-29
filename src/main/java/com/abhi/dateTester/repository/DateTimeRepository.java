package com.abhi.dateTester.repository;

import com.abhi.dateTester.entity.DateTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 28/01/2022
 * Time: 11:51 pm
 */
@Service
public interface DateTimeRepository extends JpaRepository<DateTest, Long> {
}
