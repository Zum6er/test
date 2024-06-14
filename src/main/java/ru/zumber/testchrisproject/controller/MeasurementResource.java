package ru.zumber.testchrisproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.zumber.testchrisproject.measurement.MeasurementDTO;
import ru.zumber.testchrisproject.service.MeasurementService;

import java.util.List;


@RestController
@RequestMapping("test/measurement")
@RequiredArgsConstructor
public class MeasurementResource {
    private final MeasurementService measurementService;

    @GetMapping
    public List<MeasurementDTO> findAll() {
        return this.measurementService.findAll();
    }

    @PostMapping
    public ResponseEntity<MeasurementDTO> crateMeasurement(@RequestBody MeasurementDTO measurementDTO,
                                                           UriComponentsBuilder uriComponentsBuilder) {
        MeasurementDTO saveDTO = this.measurementService.save(measurementDTO);
        return ResponseEntity.created(uriComponentsBuilder.replacePath("test/measurement/{measurementId")
                .buildAndExpand(saveDTO.getId()).toUri()).body(saveDTO);
    }

}
