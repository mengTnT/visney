package com.tthome.visney.controller;

import com.tthome.visney.entity.ArticleCategory;
import com.tthome.visney.service.ArticleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/11 17:31
 */
@RestController
@RequestMapping("/articleCategory")
public class ArticleCategoryController {
    @Autowired
    private ArticleCategoryService articleCategoryService;

    @GetMapping("/getAll")
    public List<ArticleCategory> getAllArticleCategory() {

        return articleCategoryService.getAllArticleCategory();
    }
}
