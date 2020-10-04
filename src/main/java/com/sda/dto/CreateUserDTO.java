package com.sda.dto;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.sda.domain.Cars;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.List;

@Data
public class CreateUserDTO {

    @NonNull
    private String name;

    @NonNull
    private String surname;

    @NonNull
    private String address;

    @NonNull
    private Integer age;







}
