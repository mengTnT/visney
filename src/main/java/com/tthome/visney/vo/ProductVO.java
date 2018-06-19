package com.tthome.visney.vo;

import com.tthome.visney.entity.ProImg;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**用于首页产品初步展示
 * @author NBUG
 * @date 2018/5/11 11:19
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = -5995899540171952599L;

    private Integer proId;

    private String proName;

    private BigDecimal proPrice;

    /*//图片
    private ProImg proImg;*/

    private List<ProImg> proImgs;

    private int proPositionId;
    private int proTypeId;
    private int proTextureId;
    private int proSeriesId;
    private int proStyleId;
}
