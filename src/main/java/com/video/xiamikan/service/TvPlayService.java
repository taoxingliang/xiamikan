package com.video.xiamikan.service;

import com.video.xiamikan.entity.TvPlayEntity;

import java.util.List;

public interface TvPlayService {
    List<TvPlayEntity> getAll();
    TvPlayEntity getOne(Long id);
    void insert(TvPlayEntity homepage);
    void update(TvPlayEntity homepage);
    void delete(Long id);
}
