package com.video.xiamikan.service.impl;

import com.video.xiamikan.entity.FilmEntity;
import com.video.xiamikan.mapper.FilmMapper;
import com.video.xiamikan.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmMapper mFilmMapper;
    @Override
    public List<FilmEntity> getAll() {
        return mFilmMapper.getAll();
    }

    @Override
    public FilmEntity getOne(Long id) {
        return mFilmMapper.getOne(id);
    }

    @Override
    public void insert(FilmEntity homepage) {

    }

    @Override
    public void update(FilmEntity homepage) {

    }

    @Override
    public void delete(Long id) {

    }
}
