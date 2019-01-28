package com.video.xiamikan.controller;


import com.video.xiamikan.entity.FilmEntity;
import com.video.xiamikan.entity.HomePageEntity;
import com.video.xiamikan.entity.TvPlayEntity;
import com.video.xiamikan.response.HomePageRsp;
import com.video.xiamikan.service.impl.FilmServiceImpl;
import com.video.xiamikan.service.impl.HomePageServiceImpl;
import com.video.xiamikan.service.impl.TvPlayServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@ComponentScan("com.video.xiamikan.*")
@MapperScan("com.video.xiamikan.mapper")
public class MainController {


    @Autowired
    HomePageServiceImpl mHomePageServiceImpl;

    @Autowired
    FilmServiceImpl mFilmServiceImpl;

    @Autowired
    TvPlayServiceImpl mTvPlayServiceImpl;

    @GetMapping("/")
    String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        //逻辑处理
        System.out.println("--------------------1");
        model.addAttribute("abs_path", request.getRequestURI());

        return "/index";
    }

    @ResponseBody
    @GetMapping("/getHomePageData")
    List<HomePageRsp> getHomePageData() {
        System.out.println("getHomePageData");
        List<HomePageRsp> resps = new ArrayList<>();

        List<HomePageEntity> homePageEntities = mHomePageServiceImpl.getAll();
        for (HomePageEntity entity : homePageEntities) {
            HomePageRsp rsp = new HomePageRsp();
            rsp.category = entity.getCategory();
            if (entity.getCategory() == 1) {
                FilmEntity filmEntity = mFilmServiceImpl.getOne(entity.getItem1());
                if (filmEntity != null) {
                    rsp.name1 = filmEntity.getFilm_name();
                    rsp.doubanScore1 = filmEntity.getDouban_level();
                    rsp.id1 = filmEntity.getId();
                    rsp.posterUrl1 = filmEntity.getFile_poster_url();
                }
                filmEntity = mFilmServiceImpl.getOne(entity.getItem2());
                if (filmEntity != null) {
                    rsp.name2 = filmEntity.getFilm_name();
                    rsp.doubanScore2 = filmEntity.getDouban_level();
                    rsp.id2 = filmEntity.getId();
                    rsp.posterUrl2 = filmEntity.getFile_poster_url();
                }
                filmEntity = mFilmServiceImpl.getOne(entity.getItem3());
                if (filmEntity != null) {
                    rsp.name3 = filmEntity.getFilm_name();
                    rsp.doubanScore3 = filmEntity.getDouban_level();
                    rsp.id3 = filmEntity.getId();
                    rsp.posterUrl3 = filmEntity.getFile_poster_url();
                }
                filmEntity = mFilmServiceImpl.getOne(entity.getItem4());
                if (filmEntity != null) {
                    rsp.name4 = filmEntity.getFilm_name();
                    rsp.doubanScore4 = filmEntity.getDouban_level();
                    rsp.id4 = filmEntity.getId();
                    rsp.posterUrl4 = filmEntity.getFile_poster_url();
                }
            } else if (entity.getCategory() == 2) {

                TvPlayEntity tvPlayEntity = mTvPlayServiceImpl.getOne(entity.getItem1());
                if (tvPlayEntity != null) {
                    rsp.name1 = tvPlayEntity.getTv_name();
                    rsp.doubanScore1 = tvPlayEntity.getDouban_level();
                    rsp.id1 = tvPlayEntity.getId();
                    rsp.posterUrl1 = tvPlayEntity.getTv_poster_url();
                }
                tvPlayEntity = mTvPlayServiceImpl.getOne(entity.getItem2());
                if (tvPlayEntity != null) {
                    rsp.name2 = tvPlayEntity.getTv_name();
                    rsp.doubanScore2 = tvPlayEntity.getDouban_level();
                    rsp.id2 = tvPlayEntity.getId();
                    rsp.posterUrl2 = tvPlayEntity.getTv_poster_url();
                }
                tvPlayEntity = mTvPlayServiceImpl.getOne(entity.getItem3());
                if (tvPlayEntity != null) {
                    rsp.name3 = tvPlayEntity.getTv_name();
                    rsp.doubanScore3 = tvPlayEntity.getDouban_level();
                    rsp.id3 = tvPlayEntity.getId();
                    rsp.posterUrl3 = tvPlayEntity.getTv_poster_url();
                }
                tvPlayEntity = mTvPlayServiceImpl.getOne(entity.getItem4());
                if (tvPlayEntity != null) {
                    rsp.name4 = tvPlayEntity.getTv_name();
                    rsp.doubanScore4 = tvPlayEntity.getDouban_level();
                    rsp.id4 = tvPlayEntity.getId();
                    rsp.posterUrl4 = tvPlayEntity.getTv_poster_url();
                }

            }
            resps.add(rsp);


        }

        return resps;
    }

    @GetMapping("/getDetail")
    String getDetail() {
        return "/preview";
    }
}
