package com.tthome.visney.entity;

import lombok.Data;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/10 19:25
 */
@Data
public class ProCategoryTree {
    private Integer proCategoryId;
    private String proCategoryName;
    private List<ProCategoryTree> children;
}
