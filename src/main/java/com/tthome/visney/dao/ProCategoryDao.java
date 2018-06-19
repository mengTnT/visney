package com.tthome.visney.dao;

import com.tthome.visney.entity.ProCategory;
import com.tthome.visney.entity.ProCategoryTree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/10 19:49
 */
public interface ProCategoryDao {
    public List<ProCategoryTree> showCategory(@Param("where") String where);
    public List<ProCategory> showFirstCategory();
    public List<ProCategory> showSecondCategory(int parentId);
}
