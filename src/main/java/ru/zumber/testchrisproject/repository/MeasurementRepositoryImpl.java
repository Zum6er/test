//package ru.zumber.testchrisproject.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.zumber.testchrisproject.measurement.Measurement;
import ru.zumber.testchrisproject.measurement.MeasurementDTO;
import ru.zumber.testchrisproject.measurement.MeasurementType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;
//
//@Repository
//@RequiredArgsConstructor
//public class MeasurementRepositoryImpl {
//    private final List<MeasurementDTO> measurementDTOS = new LinkedList<>();
//
//    public MeasurementRepositoryImpl() {
//        LongStream.rangeClosed(1, 4).forEach(i ->
//                this.measurementDTOS.add(new MeasurementDTO(i, "name %d".formatted(i),
//                        MeasurementType.ELECTRICITY, BigDecimal.valueOf(i), LocalDate.now(), LocalDate.now())));
//    }
//
//
//    public List<MeasurementDTO> findAll() {
//        return Collections.unmodifiableList(measurementDTOS);
//    }
//
//
//    public MeasurementDTO save(MeasurementDTO measurement) {
//        this.measurementDTOS.add(measurement);
//        return measurement;
//    }
//}
