package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class ModleCode implements Serializable {
    private static final long serialVersionUID = 1901748916512573602L;
    private Integer modelCodeId;
    private String modelCodeName;
}