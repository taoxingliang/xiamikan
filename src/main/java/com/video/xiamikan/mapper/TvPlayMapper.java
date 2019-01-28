package com.video.xiamikan.mapper;

import com.video.xiamikan.entity.TvPlayEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TvPlayMapper {
    List<TvPlayEntity> getAll();
    TvPlayEntity getOne(Long id);
    void insert(TvPlayEntity homepage);
    void update(TvPlayEntity homepage);
    void delete(Long id);
}
