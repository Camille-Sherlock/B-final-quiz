package com.thoughtworks.capability.gtb.entrancequiz.util;

import com.github.dozermapper.core.Mapper;
import com.thoughtworks.capability.gtb.entrancequiz.dto.GroupDto;
import com.thoughtworks.capability.gtb.entrancequiz.dto.TraineeDto;
import com.thoughtworks.capability.gtb.entrancequiz.dto.TrainerDto;
import com.thoughtworks.capability.gtb.entrancequiz.entity.Group;
import com.thoughtworks.capability.gtb.entrancequiz.entity.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.entity.Trainer;
import com.github.dozermapper.core.DozerBeanMapperBuilder;

import java.util.ArrayList;
import java.util.List;

public class ConvertUtil {
    static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    private ConvertUtil() { }

    public static Trainee convertTraineeDto2Trainee(TraineeDto traineeDto) {
        return convert(traineeDto, Trainee.class);
    }

    public static Trainer convertTrainerDto2Trainer(TrainerDto trainerDto) {
        return convert(trainerDto, Trainer.class);
    }

    public static List<GroupDto> convertTrainingGroupList2GroupDto(List<Group> groups) {
        List<GroupDto> groupDtoList = new ArrayList<>();
        for (Group group: groups) {
            groupDtoList.add(convert(group, GroupDto.class));
        }
        return groupDtoList;
    }

    private static <T> T convert(Object object, Class<T> targetClass) {
        return mapper.map(object, targetClass);
    }
}

