package com.video.xiamikan.service.impl;

import com.video.xiamikan.entity.HomePageEntity;
import com.video.xiamikan.mapper.HomePageMapper;
import com.video.xiamikan.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class HomePageServiceImpl implements HomePageService {

    @Autowired
    HomePageMapper mHomePageMapper;
    @Override
    public List<HomePageEntity> getAll() {
        return mHomePageMapper.getAll();
    }

    @Override
    public HomePageEntity getOne(Long id) {
        return null;
    }

    @Override
    public void insert(HomePageEntity homepage) {

    }

    @Override
    public void update(HomePageEntity homepage) {

    }

    @Override
    public void delete(Long id) {

    }
}
