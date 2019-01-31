package com.video.xiamikan.service.impl;

import com.video.xiamikan.entity.FilmUrlEntity;
import com.video.xiamikan.mapper.FilmUrlMapper;
import com.video.xiamikan.service.FilmUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmUrlServiceImpl implements FilmUrlService {

    @Autowired
    FilmUrlMapper mFilmUrlMapper;

    @Override
    public List<FilmUrlEntity> getUrls(long pId) {
        return mFilmUrlMapper.getUrls(pId);
    }

    @Override
    public FilmUrlEntity getEntity(long id) {
        return mFilmUrlMapper.getEntity(id);
    }

    @Override
    public void insert(FilmUrlEntity entity) {
        mFilmUrlMapper.insert(entity);
    }

    @Override
    public void update(FilmUrlEntity entity) {
        mFilmUrlMapper.update(entity);
    }

    @Override
    public void delete(Long id) {
        mFilmUrlMapper.delete(id);
    }
}
