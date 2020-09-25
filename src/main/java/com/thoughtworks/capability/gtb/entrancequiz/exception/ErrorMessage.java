package com.thoughtworks.capability.gtb.entrancequiz.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    String timestamp;
    Integer status;
    String error;
    String message;
}
