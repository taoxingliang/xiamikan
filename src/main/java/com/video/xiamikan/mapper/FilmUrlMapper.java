package com.video.xiamikan.mapper;

import com.video.xiamikan.entity.FilmUrlEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmUrlMapper {
    List<FilmUrlEntity> getUrls(long pId);
    FilmUrlEntity getEntity(long id);
    void insert(FilmUrlEntity entity);
    void update(FilmUrlEntity entity);
    void delete(Long id);
}
