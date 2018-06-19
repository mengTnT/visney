package com.tthome.visney.service.impl;

import com.tthome.visney.dao.BannerDao;
import com.tthome.visney.entity.Banner;
import com.tthome.visney.entity.PageViews;
import com.tthome.visney.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/6/8 15:45
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerDao bannerDao;
    @Override
    public List<Banner> selectAllByTpye(int bannerTypeId) {
        return bannerDao.selectAllByTpye(bannerTypeId);
    }
}
