package ru.zumber.testchrisproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.zumber.testchrisproject.measurement.Measurement;
import ru.zumber.testchrisproject.measurement.MeasurementDTO;
import ru.zumber.testchrisproject.repository.MeasurementRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MeasurementServiceImpl implements MeasurementService {

    private final MeasurementRepository measurementRepository;

    @Override
    public List<MeasurementDTO> findAll() {
        List<Measurement> measurements = new LinkedList<>();
        this.measurementRepository.findAll().forEach(measurements::add);
        return measurements.stream().map(this::toDTO).toList();
    }

    @Override
    public MeasurementDTO save(MeasurementDTO measurementDTO) {
        Measurement save = this.measurementRepository.save(fromDTO(measurementDTO));
        measurementDTO.setId(save.getId());
        return measurementDTO;
    }

    public MeasurementDTO findById(Long id) {
        return toDTO(this.measurementRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Measurement.error.notFound")));
    }


    private MeasurementDTO toDTO(Measurement measurement) {
        return new MeasurementDTO(measurement.getId(), measurement.getUserName(),
                measurement.getMeasurementType(), measurement.getValue(),
                measurement.getStartDate(), measurement.getEndDate());
    }

    private Measurement fromDTO(MeasurementDTO measurementDTO) {
        return new Measurement(null, measurementDTO.getUserName(),
                measurementDTO.getMeasurementType(), measurementDTO.getValue(), measurementDTO.getStartDate(),
                measurementDTO.getEndDate());
    }

}
