package com.tthome.visney.entity;

import lombok.Data;

/**
 * @author NBUG
 * @date 2018/5/10 18:58
 */
@Data
public class ProCategory {
    private Integer proCategoryId;
    private String proCategoryName;
    private Integer parentId;
}
