package com.haydikodlayalim.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseModel {
    private Integer statusCode;
    private String message;
}
