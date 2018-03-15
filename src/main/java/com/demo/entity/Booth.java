package com.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booth {
    private Integer id;

    private Byte productType;

    private Byte boothType;

    private Integer num;
}