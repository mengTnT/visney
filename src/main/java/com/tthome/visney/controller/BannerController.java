package com.tthome.visney.controller;

import com.tthome.visney.entity.Banner;
import com.tthome.visney.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/6/8 15:53
 */
@RestController
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @RequestMapping("/selectAllByTpye/{bannerTypeId}")
    public List<Banner> selectAllByTpye(@PathVariable("bannerTypeId") int bannerTypeId) {

        return bannerService.selectAllByTpye(bannerTypeId);
    }
}
