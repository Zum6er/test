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
    Long id;
    String userName;
    MeasurementType measurementType;
    BigDecimal value;
    LocalDate startDate;
    LocalDate endDate;
}
