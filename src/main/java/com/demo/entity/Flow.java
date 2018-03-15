package com.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flow {
    private Integer id;

    private Integer userId;

    private Integer toUserId;

    private Byte flowType;

    private Byte actionType;

    private Double amount;

    private String describe;

    private Byte saleType;

    private Byte saleBooth;

    private Byte saleProductType;

    private Byte saleNum;

}