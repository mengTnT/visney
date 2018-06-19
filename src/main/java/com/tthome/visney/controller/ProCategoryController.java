package com.tthome.visney.controller;

import com.tthome.visney.entity.ProCategory;
import com.tthome.visney.entity.ProCategoryTree;
import com.tthome.visney.service.ProCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/5/11 9:11
 */
@RestController
@RequestMapping("/proCategory")
public class ProCategoryController {
    @Autowired
    private ProCategoryService proCategoryService;

    @GetMapping("/showAll/{where}")
    public List<ProCategoryTree> showCategory(@PathVariable("where")String where) {

        return proCategoryService.showCategory(where);
    }

    @GetMapping("/showFirst")
    public List<ProCategory> showFirstCategory(){

        return proCategoryService.showFirstCategory();
    }
    @GetMapping("/showSecond/{parentId}")
    public List<ProCategory> showSecondCategory(@PathVariable("parentId") int parentId){
        return proCategoryService.showSecondCategory(parentId);
    }
}
