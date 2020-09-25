package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Trainee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TraineeRepository extends CrudRepository<Trainee,Long> {
    List<Trainee> findAllByGroup(Boolean grouped);
}
