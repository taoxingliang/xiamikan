package com.video.xiamikan.service;

import com.video.xiamikan.entity.HomePageEntity;

import java.util.List;

public interface HomePageService {

    List<HomePageEntity> getAll();
    HomePageEntity getOne(Long id);
    void insert(HomePageEntity homepage);
    void update(HomePageEntity homepage);
    void delete(Long id);
}
