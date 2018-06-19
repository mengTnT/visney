package com.tthome.visney.service;

import com.tthome.visney.entity.ProCondition;
import com.tthome.visney.entity.Product;
import com.tthome.visney.vo.ProductVO;

import java.util.List;
import java.util.Map;

/**
 * @author NBUG
 * @date 2018/5/10 11:01
 */
public interface ProductService {
    /**
     * 查询全部商品
     *
     * @return
     */
    public List<Product> selectAll();

    /**
     * 根据摆放位置查询只上架的产品
     *
     * @param positionId
     * @return
     */
    public List<ProductVO> selectByPosition(int positionId);

    /**
     * 条件查询上架产品,做了分页操作
     * @param proCondition
     * @return
     */
    public Map selectByCondition(ProCondition proCondition, int page, int size);

    /**
     * 查询产品详细信息
     * @param productId
     * @return
     */
    public Product getProDetail(int productId);

    /**
     * 查询相同类型的指定数量的几个产品
     * @param proTypeId
     * @return
     */
    public List<ProductVO> getProByTpyeId(int proTypeId,int size);

    public List<ProductVO> getProRandom(int size);
}
