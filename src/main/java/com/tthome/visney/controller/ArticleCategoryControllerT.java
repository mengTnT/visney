package com.tthome.visney.controller;

import com.tthome.visney.entity.ArticleCategory;
import com.tthome.visney.service.ArticleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
/**
 * @author zcy
 * @date 2018-06-18 16:54
 */
@Controller
public class ArticleCategoryControllerT {
    @Autowired
    private ArticleCategoryService articleCategoryService;
/*获取所有的文章类别*/
    @RequestMapping("/getAllArticleCategory")
    public String getAllArticleCategory(ModelMap map){
        List<ArticleCategory> allArticleCategoryList = articleCategoryService.getAllArticleCategory();
        map.put("allArticleCategoryList",allArticleCategoryList);
        return "test_product";
    }
}
