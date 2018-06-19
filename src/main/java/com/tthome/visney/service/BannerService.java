package com.tthome.visney.service;

import com.tthome.visney.entity.Banner;

import java.util.List;

/**
 * @author NBUG
 * @date 2018/6/8 15:45
 */
public interface BannerService {
    List<Banner> selectAllByTpye(int bannerTypeId);
}
