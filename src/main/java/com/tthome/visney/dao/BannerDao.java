package com.tthome.visney.dao;

import com.tthome.visney.entity.Banner;
import java.util.List;

public interface BannerDao {
    List<Banner> selectAllByTpye(int bannerTypeId);
}