package com.tthome.visney.controller;

import com.tthome.visney.entity.ProCondition;
import com.tthome.visney.entity.Product;
import com.tthome.visney.service.ProductService;
import com.tthome.visney.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author NBUG
 * @date 2018/5/10 11:05
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
/*查询全部*/
    @RequestMapping("/getAll")
    public List<Product> getAll(ModelMap map) {
            map.put("getAllList", productService.selectAll());
        return productService.selectAll();
    }
/*位置查询*/
    @GetMapping("/selectByPosition/{positionId}")
    public List<ProductVO> selectByPosition(@PathVariable("positionId") int positionId) {
        return productService.selectByPosition(positionId);

    }
/*通过ProCondition 分页查询*/
    @PostMapping("/selectByCondition/{page}/{size}")
    public Map selectByCondition(ProCondition proCondition, @PathVariable("page") int page, @PathVariable("size") int size) {
        return productService.selectByCondition(proCondition, page, size);
    }
/*查询单个产品*/
    @GetMapping("/detail/{productId}")
    public Product getProDetail(@PathVariable("productId") int productId) {
        return productService.getProDetail(productId);

    }
/*通过类型查询*/
    @GetMapping("/getProByTpyeId/{proTypeId}/{size}")
    public List<ProductVO> getProByTpyeId(@PathVariable("proTypeId")int proTypeId,@PathVariable("size")int size){

        return productService.getProByTpyeId(proTypeId,size);
    }
    /*通过是否上架查询 */
    @GetMapping("/getProRandom/{size}")
    public List<ProductVO> getProRandom(@PathVariable("size")int size){

        return productService.getProRandom(size);
    }
}
