package com.tthome.visney.dao;

import com.tthome.visney.entity.Article;
import com.tthome.visney.vo.ArticleRecomend;
import com.tthome.visney.vo.ArticleVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/14 9:25
 */
public interface ArticleDao {
    public ArticleVO getRecommend(int articleCategoryId);
    public List<ArticleVO> getRecommendsByCategoryId(@Param("articleCategoryId") int articleCategoryId, @Param("size")int size);
    public Article getArticleDetails(int articleId);
    public List<ArticleVO> getArticles(int articleCategoryId);
    public int getArticlesByLabelTotal(int articleLabelId);
    public List<Article> getArticlesByLabel(int articleLabelId);
    public List<ArticleVO> getArticleCenterRecommends();

    /**
     * 文章分类别统计总数
     * @param articleCategoryId
     * @return
     */
    public int getTotalByArticleCategoryId(int articleCategoryId);
    public List<ArticleVO> getArticleRandom();
    public List<ArticleRecomend> getArticleNew(int size);
    public List<ArticleRecomend> getArticleNextAndBefore(@Param("articleCategoryId") int articleCategoryId,@Param("articleId")int articleId);
}
