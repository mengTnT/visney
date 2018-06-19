package com.tthome.visney.service;

import com.tthome.visney.entity.ProCategory;
import com.tthome.visney.entity.ProCategoryTree;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/10 19:46
 */
public interface ProCategoryService {
    /**
     * 首页展示产品类别
     * @return
     */
    public List<ProCategoryTree>  showCategory(String where);

    /**
     * 首页展示一级产品类别
     * @return
     */
    public List<ProCategory> showFirstCategory();

    /**
     * 产品介绍：分模块展示二级类别
     * @return
     */
    public List<ProCategory> showSecondCategory(int parentId);
}
