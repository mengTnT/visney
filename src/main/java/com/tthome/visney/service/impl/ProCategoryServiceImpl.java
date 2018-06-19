package com.tthome.visney.service.impl;

import com.tthome.visney.dao.ProCategoryDao;
import com.tthome.visney.entity.ProCategory;
import com.tthome.visney.entity.ProCategoryTree;
import com.tthome.visney.service.ProCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/10 19:48
 */
@Service
public class ProCategoryServiceImpl implements ProCategoryService {
    @Autowired
    private ProCategoryDao categoryDao;
    @Override
    public List<ProCategoryTree> showCategory(String where) {
        return categoryDao.showCategory(where);
    }

    @Override
    public List<ProCategory> showFirstCategory() {
        return categoryDao.showFirstCategory();
    }

    @Override
    public List<ProCategory> showSecondCategory(int parentId) {
        return categoryDao.showSecondCategory(parentId);
    }
}
