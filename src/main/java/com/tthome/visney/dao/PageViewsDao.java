package com.tthome.visney.dao;

import com.tthome.visney.entity.PageViews;
import java.util.List;

public interface PageViewsDao {

    int articlePageCountAdd(int articleId);

    int proPageCountAdd(int proId);



}