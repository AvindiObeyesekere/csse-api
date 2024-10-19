package com.csse.api.dto.schedulerequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime; // Use LocalDateTime for better date handling
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleResponseDTO {
    private long scheduleId; // Primary key
    private String timeOfSchedule;
    private LocalDateTime dateOfSchedule; // Changed to LocalDateTime
    private int noOfTrucksNeeded;
    private String nameOfWMA;
    private List<String> citiesIncluded;
}
