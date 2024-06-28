package ru.zumber.testchrisproject.measurement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementDTO {
    
    private Long id;
    private String userName;
    private MeasurementType measurementType;
    private BigDecimal value;
    private LocalDate startDate;
    private LocalDate endDate;
}
