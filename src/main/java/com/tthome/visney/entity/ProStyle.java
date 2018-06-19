package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NBUG
 * @date 2018/5/23 9:27
 */
@Data
public class ProStyle implements Serializable {

    private static final long serialVersionUID = 1689067619324540106L;
    private Integer proStyleId;
    private String proStyleName;
}
