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
    public Long id;
    public String userName;
    public MeasurementType measurementType;
    public BigDecimal value;
    public LocalDate startDate;
    public LocalDate endDate;
}
