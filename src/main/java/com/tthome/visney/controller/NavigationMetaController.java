package com.tthome.visney.controller;

import com.tthome.visney.entity.NavigationMeta;
import com.tthome.visney.service.NavigationMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NBUG
 * @date 2018/5/22 14:48
 */
@RestController
@RequestMapping("/NavigationMeta")
public class NavigationMetaController {
    @Autowired
    private NavigationMetaService navigationMetaService;

    @GetMapping("/get/{navigationId}")
    public NavigationMeta getNavigationMetaByNavigationId(@PathVariable("navigationId") int navigationId) {

        return navigationMetaService.getNavigationMetaByNavigationId(navigationId);
    }
}
