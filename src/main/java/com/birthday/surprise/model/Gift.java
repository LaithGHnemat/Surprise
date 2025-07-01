package com.birthday.surprise.model;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Gift {
    private String from;
    private String to;
    private String message;
}
