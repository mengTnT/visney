package com.tthome.visney.controller;

import com.tthome.visney.entity.Article;
import com.tthome.visney.service.ArticleService;
import com.tthome.visney.vo.ArticleRecomend;
import com.tthome.visney.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author NBUG
 * @date 2018/5/14 9:26
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/getRecommend/{articleCategoryId}")
    public ArticleVO getRecommend(@PathVariable("articleCategoryId") int articleCategoryId) {
        return articleService.getRecommend(articleCategoryId);
    }

    @GetMapping("/getArticleNew/{size}")
    public List<ArticleRecomend> getArticleNew(@PathVariable("size")int size) {

        return articleService.getArticleNew(size);
    }

    @GetMapping("/getRecommendsByCategoryId/{articleCategoryId}/{size}")
    public List<ArticleVO> getRecommendsByCategoryId(@PathVariable("articleCategoryId") int articleCategoryId,@PathVariable("size")int size) {
        return articleService.getRecommendsByCategoryId(articleCategoryId,size);
    }

    @GetMapping("/getArticleDetails/{articleId}")
    public Article getArticleDetails(@PathVariable("articleId") int articleId) {

        return articleService.getArticleDetails(articleId);
    }

    @GetMapping("/getArticles/{articleCategoryId}/{page}/{size}")
    public Map getArticles(@PathVariable("articleCategoryId") int articleCategoryId, @PathVariable("page")int page, @PathVariable("size")int size) {

        return articleService.getArticles(articleCategoryId,page,size);
    }

    @GetMapping("/getArticlesByLabel/{articleLabelId}")
    public Map getArticlesByLabel(@PathVariable("articleLabelId") int articleLabelId) {
        return articleService.getArticlesByLabel(articleLabelId);
    }
    @GetMapping("/getArticleCenterRecommends")
    public List<ArticleVO> getArticleCenterRecommends(){
        return articleService.getArticleCenterRecommends();
    }

    @GetMapping("/getArticleRandom")
    public List<ArticleVO> getArticleRandom(){
        return articleService.getArticleRandom();
    }
    @GetMapping("/getArticleNextAndBefore/{articleCategoryId}/{articleId}")
    public Map getArticleNextAndBefore(@PathVariable("articleCategoryId") int articleCategoryId,@PathVariable("articleId")int articleId){
        return articleService.getArticleNextAndBefore(articleCategoryId,articleId);
    }
}
