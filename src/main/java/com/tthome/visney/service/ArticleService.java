package com.tthome.visney.service;

import com.tthome.visney.entity.Article;
import com.tthome.visney.vo.ArticleRecomend;
import com.tthome.visney.vo.ArticleVO;

import java.util.List;
import java.util.Map;

/**
 * @author NBUG
 * @date 2018/5/14 9:04
 */
public interface ArticleService {
    /**
     * 首页根据文章类别id获取一篇推荐文章
     * @param articleCategoryId
     * @return
     */
    public ArticleVO getRecommend(int articleCategoryId);

    /**
     * 指定获取几个最新文章 如：首页获取9个最新文章，文章详情最新文章
     * @return
     */
    public List<ArticleRecomend> getArticleNew(int size);

    /**
     * 新闻中心页，根据文章类别id获取指定数量的最新文章
     * @param articleCategoryId
     * @return
     */
    public List<ArticleVO> getRecommendsByCategoryId(int articleCategoryId,int size);

    /**
     * 获取文章详情
     * @param articleId
     * @return
     */
    public Article getArticleDetails(int articleId);

    /**
     * 新闻中心-文章列表：根据文章类别获取全部文章,有分页操作
     * @param articleCategoryId
     * @return
     */
    public Map getArticles(int articleCategoryId,int page,int size);

    /**
     * 根据标签获取文章
     * @param articleLabelId
     * @return
     */
    public Map getArticlesByLabel(int articleLabelId);

    /**
     * 新闻中心：推荐资讯 展示4个推荐新闻
     * @return
     */
    public List<ArticleVO> getArticleCenterRecommends();

    /**
     *新闻详情-猜你喜欢（随机获得几个文章）
     * @return
     */
    public List<ArticleVO> getArticleRandom();

    /**
     * 新闻详情-上一篇，下一篇
     * @return
     */
    public Map getArticleNextAndBefore( int articleCategoryId,int articleId);

}
