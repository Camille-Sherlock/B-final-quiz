package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.repository.TraineeRepository;
import org.springframework.stereotype.Service;

import javax.naming.CommunicationException;
import java.util.List;
import java.util.Optional;

@Service
public class TraineeService {
    private final TraineeRepository traineeRepository;

    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    public Trainee addTrainee(Trainee trainee){
        return traineeRepository.save(trainee);
    }
    //TODO GTB：未使用到的方法，不需要保留
    public Trainee findTraineeById(Long trainee_id) throws CommunicationException {
        Optional<Trainee> trainee = traineeRepository.findById(trainee_id);
        if(!trainee.isPresent()){
            throw new CommunicationException("trainee Not Found");
        }
        return trainee.get();
    }

    public List<Trainee> findTraineeByGrouped(Boolean grouped) {
        return traineeRepository.findAllByGrouped(grouped);
    }

}
