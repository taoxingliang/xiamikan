package com.video.xiamikan.service.impl;

import com.video.xiamikan.entity.AnimationUrlEntity;
import com.video.xiamikan.mapper.AnimationUrlMapper;
import com.video.xiamikan.service.AnimationUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimationUrlServiceImpl implements AnimationUrlService {

    @Autowired
    AnimationUrlMapper mAnimationUrlMapper;

    @Override
    public List<AnimationUrlEntity> getUrls(long pId) {
        return mAnimationUrlMapper.getUrls(pId);
    }

    @Override
    public AnimationUrlEntity getEntity(long id) {
        return mAnimationUrlMapper.getEntity(id);
    }

    @Override
    public void insert(AnimationUrlEntity entity) {
        mAnimationUrlMapper.insert(entity);
    }

    @Override
    public void update(AnimationUrlEntity entity) {

        mAnimationUrlMapper.update(entity);
    }

    @Override
    public void delete(Long id) {
        mAnimationUrlMapper.delete(id);

    }
}
