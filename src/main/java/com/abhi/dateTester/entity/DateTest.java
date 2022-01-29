package com.abhi.dateTester.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

/**
 * Created by Intellij.
 * Author: abhis
 * Date: 28/01/2022
 * Time: 11:47 pm
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DateTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private java.util.Date utilDate;

    private java.sql.Date sqlDate;

    @Temporal(TemporalType.DATE)
    private java.util.Date recordCreatedAt;

}
