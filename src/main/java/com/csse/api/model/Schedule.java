package com.csse.api.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scheduleId;
    private String timeOfSchedule;
    private Date dateOfSchedule;
    private int noOfTrucksNeeded;
    private String nameOfWMA;

    @ElementCollection // Store a list of cities
    private List<String> citiesIncluded;
}
