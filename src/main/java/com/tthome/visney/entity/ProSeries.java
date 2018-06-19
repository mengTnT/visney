package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NBUG
 * @date 2018/5/23 9:30
 */
@Data
public class ProSeries implements Serializable {

    private static final long serialVersionUID = 3984596867588706619L;
    private Integer proSeriesId;
    private String proSeriesName;
}
