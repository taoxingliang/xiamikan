package com.video.xiamikan.service;

import com.video.xiamikan.entity.FilmUrlEntity;

import java.util.List;

public interface FilmUrlService {
    List<FilmUrlEntity> getUrls(long pId);
    FilmUrlEntity getEntity(long id);
    void insert(FilmUrlEntity entity);
    void update(FilmUrlEntity entity);
    void delete(Long id);
}
