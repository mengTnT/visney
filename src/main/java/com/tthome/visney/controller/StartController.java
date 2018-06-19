package com.tthome.visney.controller;

import com.tthome.visney.entity.ArticleCategory;
import com.tthome.visney.entity.Banner;
import com.tthome.visney.entity.ProCategory;
import com.tthome.visney.entity.ProCategoryTree;
import com.tthome.visney.service.*;
import com.tthome.visney.vo.ArticleVO;
import com.tthome.visney.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author NBUG
 * @date 2018/6/15 17:10
 */
@Controller
public class StartController {

    @Autowired
    private BannerService bannerService;
    @Autowired
    private ProCategoryService proCategoryService;
    @Autowired
    private ArticleCategoryService articleCategoryService;
    @Autowired
    private ProductService productService;
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String goIndex(Map map,Integer positionId,Integer articleCategoryId,Integer size) {
        if (positionId==null){
            positionId=1;

        }
        if (articleCategoryId==null){
            articleCategoryId=1;

        }
        if (size==null){
            size=9;

        }
        List<Banner> banners = bannerService.selectAllByTpye(1);
        List<ProCategoryTree> proCategoryTreeList = proCategoryService.showCategory("main");
        List<ArticleCategory> allArticleCategory = articleCategoryService.getAllArticleCategory();
        List<ProductVO> productVOS = productService.selectByPosition(positionId);
        List<ArticleVO> recommends = articleService.getRecommendsByCategoryId(articleCategoryId, size);
        ArticleVO articleRecommend = articleService.getRecommend(articleCategoryId);
        //去掉html标签
       /* for (ArticleVO a:recommends) {
            String articleText = a.getArticleText().replaceAll("</?[^>]+>", "").replaceAll("<a>\\s*|\t|\r|\n</a>", "");
            a.setArticleText(articleText);
        }*/
        String articleText = articleRecommend.getArticleText().replaceAll("</?[^>]+>", "")
                .replaceAll("<a>\\s*|\t|\r|\n</a>", "").replaceAll("&nbsp","");
        articleRecommend.setArticleText(articleText);
        List<ProCategory> firstCategory = proCategoryService.showFirstCategory();
        map.put("proCategoryTreeList",proCategoryTreeList);
        map.put("banners", banners);
        map.put("allArticleCategory",allArticleCategory);
        map.put("productVOS",productVOS);
        map.put("recommends",recommends);
        map.put("articleRecommend",articleRecommend);
        map.put("firstCategory",firstCategory);
        return "index";
    }
}
