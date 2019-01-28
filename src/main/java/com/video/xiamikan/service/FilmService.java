package com.video.xiamikan.service;

import com.video.xiamikan.entity.FilmEntity;

import java.util.List;

public interface FilmService {

    List<FilmEntity> getAll();
    FilmEntity getOne(Long id);
    void insert(FilmEntity homepage);
    void update(FilmEntity homepage);
    void delete(Long id);
}
