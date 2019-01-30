package com.video.xiamikan.service;

import com.video.xiamikan.entity.AnimationEntity;

import java.util.List;

public interface AnimationService {

    List<AnimationEntity> getAll();
    AnimationEntity getOne(Long id);
    void insert(AnimationEntity homepage);
    void update(AnimationEntity homepage);
    void delete(Long id);
}
