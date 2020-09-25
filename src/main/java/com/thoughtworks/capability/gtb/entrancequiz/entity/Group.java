package com.thoughtworks.capability.gtb.entrancequiz.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name="gtb_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;

    @OneToMany(mappedBy = "group",cascade = CascadeType.ALL,orphanRemoval = true)
    List<Trainee> trainees;

    @OneToMany(mappedBy = "group",cascade = CascadeType.ALL,orphanRemoval = true)
    List<Trainer> trainers;
}
