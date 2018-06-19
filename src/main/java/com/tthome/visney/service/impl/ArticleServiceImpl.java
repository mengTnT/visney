package com.tthome.visney.service.impl;

import com.github.pagehelper.PageHelper;
import com.tthome.visney.dao.ArticleDao;
import com.tthome.visney.dao.PageViewsDao;
import com.tthome.visney.entity.Article;
import com.tthome.visney.service.ArticleService;
import com.tthome.visney.vo.ArticleRecomend;
import com.tthome.visney.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author NBUG
 * @date 2018/5/14 9:24
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;
    @Autowired
    PageViewsDao pageViewsDao;

    @Override
    public ArticleVO getRecommend(int articleCategoryId) {


        return articleDao.getRecommend(articleCategoryId);
    }

    @Override
    public List<ArticleRecomend> getArticleNew(int size) {
        return articleDao.getArticleNew(size);
    }



    @Override
    public List<ArticleVO> getRecommendsByCategoryId(int articleCategoryId,int size) {
        return articleDao.getRecommendsByCategoryId(articleCategoryId,size);
    }

    @Override
    public Article getArticleDetails(int articleId) {
        //浏览量加1
        pageViewsDao.articlePageCountAdd(articleId);
        return articleDao.getArticleDetails(articleId);
    }

    @Override
    public Map getArticles(int articleCategoryId,int page,int size) {
        Map map=new HashMap();
        int total = articleDao.getTotalByArticleCategoryId(articleCategoryId);
        PageHelper.startPage(page,size);
        List<ArticleVO> list = articleDao.getArticles(articleCategoryId);
        map.put("total",total);
        map.put("list",list);
        return map;
    }

    @Override
    public Map getArticlesByLabel(int articleLabelId) {
        Map map=new HashMap();
        int total = articleDao.getArticlesByLabelTotal(articleLabelId);
        List<Article> list = articleDao.getArticlesByLabel(articleLabelId);
        map.put("total",total);
        map.put("list",list);
        return map;
    }

    @Override
    public List<ArticleVO> getArticleCenterRecommends() {
        return articleDao.getArticleCenterRecommends();
    }

    @Override
    public List<ArticleVO> getArticleRandom() {
        return articleDao.getArticleRandom();
    }

    @Override
    public Map getArticleNextAndBefore(int articleCategoryId,int articleId) {
        Map map=new HashMap();
        List<ArticleRecomend> list = articleDao.getArticleNextAndBefore(articleCategoryId, articleId);
        int total = articleDao.getTotalByArticleCategoryId(articleCategoryId);
        map.put("list",list);
        map.put("total",total);
        return  map;
    }


}
