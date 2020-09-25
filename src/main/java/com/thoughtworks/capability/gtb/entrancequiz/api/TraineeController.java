//package com.thoughtworks.capability.gtb.entrancequiz.api;
//
//import com.thoughtworks.capability.gtb.entrancequiz.domain.Trainee;
//import com.thoughtworks.capability.gtb.entrancequiz.service.TraineeService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@Controller
//@RequestMapping("/trainees")
//@CrossOrigin
//public class TraineeController {
//    private final TraineeService traineeService;
//
//    public TraineeController(TraineeService traineeService) {
//        this.traineeService = traineeService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Trainee>> getNoGroupTrainees(@RequestParam Boolean grouped){
//        return ResponseEntity.ok(traineeService.findTraineeByGrouped(grouped));
//    }
//
//    @PostMapping
//    public ResponseEntity<Trainee> addTrainee(@RequestBody @Valid Trainee trainee){
//        return ResponseEntity.status(HttpStatus.CREATED).body(traineeService.addTrainee(trainee));
//    }
//
//
//}
