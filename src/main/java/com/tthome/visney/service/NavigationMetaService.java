package com.tthome.visney.service;

import com.tthome.visney.entity.NavigationMeta;

/**
 * @author NBUG
 * @date 2018/5/22 14:29
 */
public interface NavigationMetaService {
    /**
     *根据每个导航的id去查询对应的html meta标签的属性
     * @return
     */
    public NavigationMeta getNavigationMetaByNavigationId(int navigationId);
}
