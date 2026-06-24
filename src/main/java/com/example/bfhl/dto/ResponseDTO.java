package com.example.bfhl.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {

    @JsonProperty("is_success")
    private boolean success;

    private String user_id;
    private String email;
    private String roll_number;

    private List<String> odd_numbers;
    private List<String> even_numbers;
    private List<String> alphabets;
    private List<String> special_characters;

    private String sum;
    private String concat_string;
}