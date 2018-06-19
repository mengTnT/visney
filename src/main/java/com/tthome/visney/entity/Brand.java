package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Brand implements Serializable {
    private static final long serialVersionUID = -8404874057143649154L;

    private Short brandId;

    private String brandName;

}