package com.video.xiamikan.service.impl;

import com.video.xiamikan.entity.TvPlayUrlEntity;
import com.video.xiamikan.mapper.TvPlayUrlMapper;
import com.video.xiamikan.service.TvPlayUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvPlayUrlServiceImpl implements TvPlayUrlService {

    @Autowired
    TvPlayUrlMapper mTvPlayUrlMapper;

    @Override
    public List<TvPlayUrlEntity> getUrls(long pId) {
        return mTvPlayUrlMapper.getUrls(pId);
    }

    @Override
    public TvPlayUrlEntity getEntity(long id) {
        return mTvPlayUrlMapper.getEntity(id);
    }

    @Override
    public void insert(TvPlayUrlEntity entity) {
        mTvPlayUrlMapper.insert(entity);
    }

    @Override
    public void update(TvPlayUrlEntity entity) {
        mTvPlayUrlMapper.update(entity);
    }

    @Override
    public void delete(Long id) {
        mTvPlayUrlMapper.delete(id);
    }
}
