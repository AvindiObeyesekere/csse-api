package com.csse.api.dto.schedulerequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleRequestDTO {
    private String timeOfSchedule; // e.g., "10:30 AM"
    private Date dateOfSchedule; // To be chosen manually from the frontend
    private int noOfTrucksNeeded;
    private String nameOfWMA; // Waste Management Authority
    private List<String> citiesIncluded; // List of city names
}

