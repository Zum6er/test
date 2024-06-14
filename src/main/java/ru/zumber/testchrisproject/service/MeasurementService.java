package ru.zumber.testchrisproject.service;

import ru.zumber.testchrisproject.measurement.MeasurementDTO;

import java.util.List;

public interface MeasurementService {
    List<MeasurementDTO> findAll();

    MeasurementDTO save(MeasurementDTO measurementDTO);
}
