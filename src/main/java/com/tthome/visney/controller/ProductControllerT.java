package com.tthome.visney.controller;

import com.tthome.visney.entity.*;
import com.tthome.visney.service.*;
import com.tthome.visney.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author zcy
 * @date 2018-06-18 15:51
 */
@Controller
public class ProductControllerT {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProCategoryService proCategoryService;
    @Autowired
    private ArticleCategoryService articleCategoryService;
    @Autowired
    private NavigationMetaService navigationMetaService;
    @Autowired
    private BannerService bannerService;

/*点击产品介绍时触发的*/
    @RequestMapping("/product1.html")
    public String getAllProduct(ModelMap map, int proPosition, String where,
                                int navigationId, int bannerTypeId){
        /*根据位置查询*/
        List<ProductVO> proPositionList=productService.selectByPosition(proPosition);
        map.put("proPositionList",proPositionList);
        /*查询所有产品类别*/
        List<ProCategoryTree> proCategoryTreeList = proCategoryService.showCategory(where);
        map.put("proCategoryTreeList",proCategoryTreeList);
        /*查询文章所有的类别*/
        List<ArticleCategory> allArticleCategoryList = articleCategoryService.getAllArticleCategory();
        map.put("allArticleCategoryList",allArticleCategoryList);
        /*查询nacigationMeta对象*/
        NavigationMeta navigationMeta= navigationMetaService.getNavigationMetaByNavigationId(navigationId);
        map.put("navigationMeta",navigationMeta);
        /*根据类型查轮播图*/
        List<Banner> bannerList = bannerService.selectAllByTpye(bannerTypeId);
        map.put("bannerList",bannerList);
        return "text_product";

    }
/*点击产品介绍下的标题 分页模糊查询*/
    @RequestMapping("product.html")
    public  String getTatilProduct(ModelMap map,ProCondition proCondition,int page, int size){
        Map  selectByConditionMap= productService.selectByCondition(proCondition, page, size);
        map.put("selectByConditionMap",selectByConditionMap);
        return "text_product";
    }
/*查询一级标题*/
    @RequestMapping("")
    public String selectFirstProCategory(ModelMap map){
        List<ProCategory> firstCategoryList = proCategoryService.showFirstCategory();
            map.put("firstCategoryList",firstCategoryList);
        return "text_product";
    }
    /*二级标题*/
    public String secondProCategory(ModelMap map,int parentId){
        List<ProCategory> secondCategoryList = proCategoryService.showSecondCategory(parentId);
        map.put("secondCategoryList",secondCategoryList);
        return "text_product";
    }
}
