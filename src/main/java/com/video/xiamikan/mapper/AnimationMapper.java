package com.video.xiamikan.mapper;

import com.video.xiamikan.entity.AnimationEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AnimationMapper {
    List<AnimationEntity> getAll();
    AnimationEntity getOne(Long id);
    void insert(AnimationEntity homepage);
    void update(AnimationEntity homepage);
    void delete(Long id);
}
