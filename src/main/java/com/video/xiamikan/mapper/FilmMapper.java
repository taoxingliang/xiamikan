package com.video.xiamikan.mapper;

import com.video.xiamikan.entity.FilmEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmMapper {
    List<FilmEntity> getAll();
    FilmEntity getOne(Long id);
    void insert(FilmEntity homepage);
    void update(FilmEntity homepage);
    void delete(Long id);
}
