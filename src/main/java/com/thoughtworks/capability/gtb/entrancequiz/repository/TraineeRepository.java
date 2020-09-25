package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Trainee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraineeRepository extends CrudRepository<Trainee,Long> {

    List<Trainee> findAllByGrouped(Boolean grouped);
}
