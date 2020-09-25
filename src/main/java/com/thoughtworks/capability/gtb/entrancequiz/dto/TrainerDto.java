package com.thoughtworks.capability.gtb.entrancequiz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainerDto {
    @NotNull(message = "姓名字段不能为空")
    String name;
}
