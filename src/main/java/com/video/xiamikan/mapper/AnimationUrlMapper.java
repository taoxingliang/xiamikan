package com.video.xiamikan.mapper;

import com.video.xiamikan.entity.AnimationUrlEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimationUrlMapper {
    List<AnimationUrlEntity> getUrls(long pId);
    AnimationUrlEntity getEntity(long id);
    void insert(AnimationUrlEntity entity);
    void update(AnimationUrlEntity entity);
    void delete(Long id);

}
