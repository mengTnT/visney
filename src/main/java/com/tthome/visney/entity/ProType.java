package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NBUG
 * @date 2018/5/23 9:29
 */
@Data
public class ProType implements Serializable {

    private static final long serialVersionUID = -8343832929002360816L;
    private Integer proTypeId;
    private String proTypeName;
}
