package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeService {
   private final TraineeRepository traineeRepository;
    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

//    public Trainee addTrainee(Trainee trainee){
//        return traineeRepository.save(trainee);
//    }
//
//    public Trainee findTraineeById(Long trainee_id) throws CommunicationException {
//        Optional<Trainee> trainee = traineeRepository.findById(trainee_id);
//        if(!trainee.isPresent()){
//            throw new CommunicationException("trainee Not Found");
//        }
//        return trainee.get();
//    }
//
//    public List<Trainee> findTraineeByGrouped(Boolean grouped) {
//        return traineeRepository.findAllByGrouped(grouped);
//    }

}
