package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NBUG
 * @date 2018/5/23 9:26
 */
@Data
public class ProPosition implements Serializable {

    private static final long serialVersionUID = 5079414961099331222L;
    private Integer proPositionId;
    private String proPositionName;
}
