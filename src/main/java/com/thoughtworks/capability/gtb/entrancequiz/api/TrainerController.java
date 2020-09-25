//package com.thoughtworks.capability.gtb.entrancequiz.api;
//
//import com.thoughtworks.capability.gtb.entrancequiz.domain.Trainer;
//import com.thoughtworks.capability.gtb.entrancequiz.service.TrainerService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/trainers")
//@CrossOrigin
//public class TrainerController {
//    private final TrainerService trainerService;
//
//    public TrainerController(TrainerService trainerService) {
//        this.trainerService = trainerService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Trainer>> getNoGroupTrainers(@RequestParam Boolean grouped){
//        return ResponseEntity.ok(trainerService.findTrainerByGrouped(grouped));
//    }
//
//    @PostMapping
//    public ResponseEntity<Trainer> addTrainer(@RequestBody Trainer trainer){
//        return ResponseEntity.status(HttpStatus.CREATED).body(trainerService.addTrainer(trainer));
//    }
//
//}