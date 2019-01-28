package com.video.xiamikan.service.impl;

import com.video.xiamikan.entity.TvPlayEntity;
import com.video.xiamikan.mapper.TvPlayMapper;
import com.video.xiamikan.service.TvPlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TvPlayServiceImpl implements TvPlayService {

    @Autowired
    TvPlayMapper mTvPlayMapper;
    @Override
    public List<TvPlayEntity> getAll() {
        return mTvPlayMapper.getAll();
    }

    @Override
    public TvPlayEntity getOne(Long id) {
        return mTvPlayMapper.getOne(id);
    }

    @Override
    public void insert(TvPlayEntity homepage) {

    }

    @Override
    public void update(TvPlayEntity homepage) {

    }

    @Override
    public void delete(Long id) {

    }
}
