package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TrainerRepository extends JpaRepository<Trainer,Long> {
    List<Trainer> findAllByGroup(Boolean grouped);
}
