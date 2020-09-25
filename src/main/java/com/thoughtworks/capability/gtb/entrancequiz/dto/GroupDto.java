package com.thoughtworks.capability.gtb.entrancequiz.dto;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.entity.Trainer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GroupDto {
    Long id;
    String name;
    List<Trainee> trainees;
    List<Trainer> trainers;
}
