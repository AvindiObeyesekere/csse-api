package com.csse.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scheduleId;

    private String timeOfSchedule;

    private LocalDateTime dateOfSchedule;

    private int noOfTrucksNeeded;

    private String nameOfWMA;

    @ElementCollection // Store a list of cities
    private List<String> citiesIncluded;
}
