package com.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class UserLeave {
    private Integer id;

    private Integer userId;

    private Date leaveDate;

    private Byte type;
}