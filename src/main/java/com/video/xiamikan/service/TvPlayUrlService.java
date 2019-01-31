package com.video.xiamikan.service;

import com.video.xiamikan.entity.TvPlayUrlEntity;

import java.util.List;

public interface TvPlayUrlService {
    List<TvPlayUrlEntity> getUrls(long pId);
    TvPlayUrlEntity getEntity(long id);
    void insert(TvPlayUrlEntity entity);
    void update(TvPlayUrlEntity entity);
    void delete(Long id);
}
