package com.tthome.visney.dao;

import com.tthome.visney.entity.NavigationMeta;

/**
 * @author NBUG
 * @date 2018/5/22 14:34
 */
public interface NavigationMetaDao {
    public NavigationMeta getNavigationMetaByNavigationId(int navigationId);
}
