package ru.zumber.testchrisproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.zumber.testchrisproject.measurement.MeasurementDTO;
import ru.zumber.testchrisproject.measurement.Measurement;
import ru.zumber.testchrisproject.repository.MeasurementRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MeasurementServiceImpl implements MeasurementService {
    private final MeasurementRepository measurementRepository;

    @Override
    public List<MeasurementDTO> findAll() {
        List<Measurement> measurements = new LinkedList<>();
        this.measurementRepository.findAll().forEach(measurements::add);

        return measurements.stream().map(measurement -> (new MeasurementDTO(measurement.getId(),
                measurement.getUserName(), measurement.getMeasurementType(), measurement.getValue(),
                measurement.getStartDate(), measurement.getEndDate()))).toList();
    }

    @Override
    public MeasurementDTO save(MeasurementDTO measurementDTO) {
        Measurement save = this.measurementRepository.save(new Measurement(null, measurementDTO.getUserName(),
                measurementDTO.getMeasurementType(), measurementDTO.getValue(), measurementDTO.getStartDate(),
                measurementDTO.getEndDate()));
        measurementDTO.setId(save.getId());
        return measurementDTO;
    }

}
