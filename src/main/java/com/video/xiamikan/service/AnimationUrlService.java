package com.video.xiamikan.service;

import com.video.xiamikan.entity.AnimationUrlEntity;

import java.util.List;

public interface AnimationUrlService {

    List<AnimationUrlEntity> getUrls(long pId);
    AnimationUrlEntity getEntity(long id);
    void insert(AnimationUrlEntity entity);
    void update(AnimationUrlEntity entity);
    void delete(Long id);
}
