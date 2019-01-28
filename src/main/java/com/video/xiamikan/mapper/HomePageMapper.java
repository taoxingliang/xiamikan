package com.video.xiamikan.mapper;

import com.video.xiamikan.entity.HomePageEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomePageMapper {

    List<HomePageEntity> getAll();
    HomePageEntity getOne(Long id);
    void insert(HomePageEntity homepage);
    void update(HomePageEntity homepage);
    void delete(Long id);
}
