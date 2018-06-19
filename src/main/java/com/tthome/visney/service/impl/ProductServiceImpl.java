package com.tthome.visney.service.impl;

import com.github.pagehelper.PageHelper;
import com.tthome.visney.dao.PageViewsDao;
import com.tthome.visney.dao.ProductDao;
import com.tthome.visney.entity.ProCondition;
import com.tthome.visney.entity.Product;
import com.tthome.visney.service.ProductService;
import com.tthome.visney.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author NBUG
 * @date 2018/5/10 11:02
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private PageViewsDao pageViewsDao;

    @Override
    public List<Product> selectAll() {
        List<Product> products = productDao.selectAll();
        return products;
    }


    @Override
    public List<ProductVO> selectByPosition(int positionId) {
        return productDao.selectByPosition(positionId);
    }

    @Override
    public Map selectByCondition(ProCondition proCondition, int page, int size) {
        Map map=new HashMap();
        int total = productDao.selectByConditionCOUNT(proCondition);
        int start=(page-1)*size;
        int end=size;
        List<ProductVO> list = productDao.selectByCondition(proCondition,start,end);
        map.put("total",total);
        map.put("list",list);
        return map;

    }

    @Override
    public Product getProDetail(int productId) {
        pageViewsDao.proPageCountAdd(productId);
        Product detail = productDao.getProDetail(productId);
       if (detail!=null) {
            Map param = detail.getParam();
            param.put("品牌", detail.getBrand().getBrandName());
            param.put("位置", detail.getProPosition().getProPositionName());
            param.put("材质", detail.getProTexture().getProTextureName());
            param.put("型号", detail.getModleCode().getModelCodeName());
            param.put("类型", detail.getProType().getProTypeName());
            param.put("风格", detail.getProStyle().getProStyleName());
            param.put("系列", detail.getProSeries().getProSeriesName());
            param.put("尺寸", detail.getSize().getSiziMsg());
        }
        return detail;
    }

    @Override
    public List<ProductVO> getProByTpyeId(int proTypeId, int size) {
        return productDao.getProByTpyeId(proTypeId,size);
    }

    @Override
    public List<ProductVO> getProRandom(int size) {
        return productDao.getProRandom(size);
    }
}
