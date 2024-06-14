package ru.zumber.testchrisproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.zumber.testchrisproject.measurement.Measurement;

public interface MeasurementRepository extends CrudRepository<Measurement, Long> {

}
