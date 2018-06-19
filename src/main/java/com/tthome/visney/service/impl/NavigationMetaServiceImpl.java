package com.tthome.visney.service.impl;

import com.tthome.visney.dao.NavigationMetaDao;
import com.tthome.visney.entity.NavigationMeta;
import com.tthome.visney.service.NavigationMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author NBUG
 * @date 2018/5/22 14:33
 */
@Service
public class NavigationMetaServiceImpl implements NavigationMetaService {
    @Autowired
    private NavigationMetaDao navigationMetaDao;
    @Override
    public NavigationMeta getNavigationMetaByNavigationId(int navigationId) {
        return navigationMetaDao.getNavigationMetaByNavigationId(navigationId);
    }
}
