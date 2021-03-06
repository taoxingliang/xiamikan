package com.video.xiamikan.controller;


import com.video.xiamikan.entity.*;
import com.video.xiamikan.response.HomePageRsp;
import com.video.xiamikan.service.impl.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    AnimationServiceImpl mAnimationServiceImpl;

    @Autowired
    AnimationUrlServiceImpl mAnimationUrlServiceImpl;

    @Autowired
    FilmUrlServiceImpl mFilmUrlServiceImpl;

    @Autowired
    TvPlayUrlServiceImpl mTvPlayUrlServiceImpl;

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
            rsp.categoryName = entity.getCategoryName();
            if (entity.getCategory() == 1) {
                FilmEntity filmEntity = mFilmServiceImpl.getOne(entity.getItem1());
                if (filmEntity != null) {
                    //rsp.regon1 = filmEntity.getFilm_national_area();
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
                filmEntity = mFilmServiceImpl.getOne(entity.getItem5());
                if (filmEntity != null) {
                    rsp.name5 = filmEntity.getFilm_name();
                    rsp.doubanScore5 = filmEntity.getDouban_level();
                    rsp.id5 = filmEntity.getId();
                    rsp.posterUrl5 = filmEntity.getFile_poster_url();
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
                tvPlayEntity = mTvPlayServiceImpl.getOne(entity.getItem5());
                if (tvPlayEntity != null) {
                    rsp.name5 = tvPlayEntity.getTv_name();
                    rsp.doubanScore5 = tvPlayEntity.getDouban_level();
                    rsp.id5 = tvPlayEntity.getId();
                    rsp.posterUrl5 = tvPlayEntity.getTv_poster_url();
                }

            } else if (entity.getCategory() == 3) {
                AnimationEntity animationEntity = mAnimationServiceImpl.getOne(entity.getItem1());
                if (animationEntity != null) {
                    //rsp.regon1 = filmEntity.getFilm_national_area();
                    rsp.name1 = animationEntity.getAm_name();
                    rsp.doubanScore1 = animationEntity.getDouban_level();
                    rsp.id1 = animationEntity.getId();
                    rsp.posterUrl1 = animationEntity.getFile_poster_url();
                }
                animationEntity = mAnimationServiceImpl.getOne(entity.getItem2());
                if (animationEntity != null) {
                    rsp.name2 = animationEntity.getAm_name();
                    rsp.doubanScore2 = animationEntity.getDouban_level();
                    rsp.id2 = animationEntity.getId();
                    rsp.posterUrl2 = animationEntity.getFile_poster_url();
                }
                animationEntity = mAnimationServiceImpl.getOne(entity.getItem3());
                if (animationEntity != null) {
                    rsp.name3 = animationEntity.getAm_name();
                    rsp.doubanScore3 = animationEntity.getDouban_level();
                    rsp.id3 = animationEntity.getId();
                    rsp.posterUrl3 = animationEntity.getFile_poster_url();
                }
                animationEntity = mAnimationServiceImpl.getOne(entity.getItem4());
                if (animationEntity != null) {
                    rsp.name4 = animationEntity.getAm_name();
                    rsp.doubanScore4 = animationEntity.getDouban_level();
                    rsp.id4 = animationEntity.getId();
                    rsp.posterUrl4 = animationEntity.getFile_poster_url();
                }
                animationEntity = mAnimationServiceImpl.getOne(entity.getItem5());
                if (animationEntity != null) {
                    rsp.name5 = animationEntity.getAm_name();
                    rsp.doubanScore5 = animationEntity.getDouban_level();
                    rsp.id5 = animationEntity.getId();
                    rsp.posterUrl5 = animationEntity.getFile_poster_url();
                }
            }
            resps.add(rsp);


        }

        return resps;
    }

    @GetMapping(value="/getDetail/{category}/{id}")
    String getDetail(@PathVariable("category") int category, @PathVariable("id") Long id, Model model, HttpServletRequest request) {
        System.out.println(id);
        model.addAttribute("abs_path", request.getContextPath());
        model.addAttribute("category", category);
        model.addAttribute("itemId", id);

        if (category == 1) {
            FilmEntity entity = mFilmServiceImpl.getOne(id);
            model.addAttribute("name", entity.getFilm_name());
            model.addAttribute("alias", entity.getFilm_alias());
            model.addAttribute("length", entity.getFilm_length());
            model.addAttribute("director", entity.getFilm_director());
            model.addAttribute("performer", entity.getFilm_performer());
            model.addAttribute("type", entity.getFilm_type());
            model.addAttribute("area", entity.getFilm_national_area());
            model.addAttribute("year", entity.getFilm_release_time());
            model.addAttribute("douban", entity.getDouban_level());
            model.addAttribute("introduction", entity.getFilm_introduction());
            model.addAttribute("posturl", entity.getFile_poster_url());
        } else if (category == 2) {
            TvPlayEntity entity = mTvPlayServiceImpl.getOne(id);
            model.addAttribute("name", entity.getTv_name());
            model.addAttribute("alias", entity.getTv_alias());
            model.addAttribute("length", entity.getTv_length());
            model.addAttribute("director", entity.getTv_director());
            model.addAttribute("performer", entity.getTv_performer());
            model.addAttribute("type", entity.getTv_type());
            model.addAttribute("area", entity.getTv_national_area());
            model.addAttribute("year", entity.getTv_release_time());
            model.addAttribute("douban", entity.getDouban_level());
            model.addAttribute("introduction", entity.getTv_introduction());
            model.addAttribute("posturl", entity.getTv_poster_url());
        } else  if (category == 3) {
            AnimationEntity entity = mAnimationServiceImpl.getOne(id);
            model.addAttribute("name", entity.getAm_name());
            model.addAttribute("alias", entity.getAm_alias());
            model.addAttribute("length", entity.getAm_length());
            model.addAttribute("director", entity.getAm_director());
            model.addAttribute("performer", entity.getAm_performer());
            model.addAttribute("type", entity.getAm_type());
            model.addAttribute("area", entity.getAm_national_area());
            model.addAttribute("year", entity.getAm_release_time());
            model.addAttribute("douban", entity.getDouban_level());
            model.addAttribute("introduction", entity.getAm_introduction());
            model.addAttribute("posturl", entity.getFile_poster_url());
        }

        return "/preview";
    }


    @ResponseBody
    @GetMapping("/getAnimationUrls/{id}")
    List<AnimationUrlEntity> getAnimationUrls(@PathVariable("id") Long id) {
        return mAnimationUrlServiceImpl.getUrls(id);
    }

    @ResponseBody
    @GetMapping("/getFilmUrls/{id}")
    List<FilmUrlEntity> getFilmUrls(@PathVariable("id") Long id) {
        return mFilmUrlServiceImpl.getUrls(id);
    }

    @ResponseBody
    @GetMapping("/getTvUrls/{id}")
    List<TvPlayUrlEntity> getTvUrls(@PathVariable("id") Long id) {
        return mTvPlayUrlServiceImpl.getUrls(id);
    }
}
