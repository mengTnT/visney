package com.tthome.visney.service.impl;

import com.tthome.visney.dao.ArticleCategoryDao;
import com.tthome.visney.entity.ArticleCategory;
import com.tthome.visney.service.ArticleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/11 17:12
 */
@Service
public class ArticleCategoryServiceImpl implements ArticleCategoryService {
    @Autowired
    private ArticleCategoryDao articleCategoryDao;
    @Override
    public List<ArticleCategory> getAllArticleCategory() {
        return articleCategoryDao.getAllArticleCategory();
    }
}
