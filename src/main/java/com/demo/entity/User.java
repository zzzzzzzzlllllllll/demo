package com.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Integer id;

    private Integer type;

    private Integer booth;

    private String nickname;

    private String account;

    private String password;

    private Double amount;

    private Double basicWages;
}