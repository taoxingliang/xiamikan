package com.video.xiamikan.service.impl;

import com.video.xiamikan.entity.AnimationEntity;
import com.video.xiamikan.mapper.AnimationMapper;
import com.video.xiamikan.service.AnimationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimationServiceImpl implements AnimationService {

    @Autowired
    AnimationMapper mAnimationMapper;
    @Override
    public List<AnimationEntity> getAll() {
        return mAnimationMapper.getAll();
    }

    @Override
    public AnimationEntity getOne(Long id) {
        return mAnimationMapper.getOne(id);
    }

    @Override
    public void insert(AnimationEntity homepage) {

    }

    @Override
    public void update(AnimationEntity homepage) {

    }

    @Override
    public void delete(Long id) {

    }
}
