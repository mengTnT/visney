package com.tthome.visney.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NBUG
 * @date 2018/5/23 9:31
 */
@Data
public class ProTexture implements Serializable {

    private static final long serialVersionUID = -1308678221078685251L;
    private Integer proTextureId;
    private String proTextureName;
}
