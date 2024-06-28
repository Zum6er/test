package ru.zumber.testchrisproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ru.zumber.testchrisproject.measurement.MeasurementDTO;
import ru.zumber.testchrisproject.service.MeasurementService;

import java.net.URISyntaxException;
import java.util.List;


@RestController
@RequestMapping("test/measurements")
@RequiredArgsConstructor
public class MeasurementsResource {

    private final MeasurementService measurementService;

    @GetMapping
    public List<MeasurementDTO> findAll() {
        return this.measurementService.findAll();
    }

    @PostMapping
    public ResponseEntity<MeasurementDTO> crateMeasurement(@RequestBody MeasurementDTO measurementDTO) throws URISyntaxException {
        MeasurementDTO saveDTO = this.measurementService.save(measurementDTO);
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentContextPath().path("/test/measurements/" + saveDTO.getId()).build().toUri())
                .body(saveDTO);
    }

    @GetMapping("{id:\\d+}")
    public MeasurementDTO getMeasurement(@PathVariable Long id) {
        return this.measurementService.findById(id);
    }

}
