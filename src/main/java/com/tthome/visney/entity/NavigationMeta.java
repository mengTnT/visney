package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用于网页优化seo，meta标签的内容填充
 *
 * @author NBUG
 * @date 2018/5/22 14:16
 */
@Data
public class NavigationMeta implements Serializable {

    private static final long serialVersionUID = 2195901804426459402L;

    private Integer navigationId;

    private String navigationName;

    private String navigationTitle;

    private String navigationDescription;

    private String navigationKeyword;
}
