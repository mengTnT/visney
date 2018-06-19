package com.tthome.visney.dao;

import com.tthome.visney.entity.ProCondition;
import com.tthome.visney.entity.Product;
import com.tthome.visney.vo.ProductVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

    public List<Product> selectAll();

    public List<ProductVO> selectByPosition(int positionId);

    public List<ProductVO> selectByCondition(@Param("proCondition")ProCondition proCondition, @Param("start") int start, @Param("end")int end);

    public int selectByConditionCOUNT(ProCondition proCondition);

    public Product getProDetail(int productId);

    public List<ProductVO> getProByTpyeId(@Param("proTypeId") int proTypeId, @Param("size")int size);

    public List<ProductVO> getProRandom(int size);
}