package com.video.xiamikan.mapper;

import com.video.xiamikan.entity.TvPlayUrlEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TvPlayUrlMapper {
    List<TvPlayUrlEntity> getUrls(long pId);
    TvPlayUrlEntity getEntity(long id);
    void insert(TvPlayUrlEntity entity);
    void update(TvPlayUrlEntity entity);
    void delete(Long id);
}
