package com.video.xiamikan.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 对应电影表
 */
public class AnimationEntity implements Serializable {

    private Long id;
    private String am_name;//电影名称

    private String am_performer;//电影演员
    private String am_director;//电影导演

    private int am_type;//电影类型：喜剧，嫌疑
    private int am_national_area;//电影国家
    private String  file_poster_url;//电影海报url
    private int am_release_time;//'电影年份：如：2018',
    private int am_length;//'电影长度：分钟，如117',
    private String am_alias;// '电影别名'
    private String IMDb_id;//'IMDb id 或者url',
    private String douban_id;//'豆瓣id 或者url',
    private String am_introduction;// '电影简介',
    private Float douban_level;//'豆瓣评分',
    private int am_subscriber_num;//'订阅人数',
    private Timestamp am_create_time;//'电影创建时间'
    private Timestamp am_update_time;//'电影更新时间'

    public void setId(Long id) {
        this.id = id;
    }

    public void setAm_name(String am_name) {
        this.am_name = am_name;
    }

    public void setAm_performer(String am_performer) {
        this.am_performer = am_performer;
    }

    public void setAm_director(String am_director) {
        this.am_director = am_director;
    }

    public void setAm_type(int am_type) {
        this.am_type = am_type;
    }

    public void setAm_national_area(int am_national_area) {
        this.am_national_area = am_national_area;
    }

    public void setFile_poster_url(String file_poster_url) {
        this.file_poster_url = file_poster_url;
    }

    public void setAm_release_time(int am_release_time) {
        this.am_release_time = am_release_time;
    }

    public void setAm_length(int am_length) {
        this.am_length = am_length;
    }

    public void setAm_alias(String am_alias) {
        this.am_alias = am_alias;
    }

    public void setIMDb_id(String IMDb_id) {
        this.IMDb_id = IMDb_id;
    }

    public void setDouban_id(String douban_id) {
        this.douban_id = douban_id;
    }

    public void setAm_introduction(String am_introduction) {
        this.am_introduction = am_introduction;
    }

    public void setDouban_level(Float douban_level) {
        this.douban_level = douban_level;
    }

    public void setAm_subscriber_num(int am_subscriber_num) {
        this.am_subscriber_num = am_subscriber_num;
    }

    public void setAm_create_time(Timestamp am_create_time) {
        this.am_create_time = am_create_time;
    }

    public void setAm_update_time(Timestamp am_update_time) {
        this.am_update_time = am_update_time;
    }

    public Long getId() {
        return id;
    }

    public String getAm_name() {
        return am_name;
    }

    public String getAm_performer() {
        return am_performer;
    }

    public String getAm_director() {
        return am_director;
    }

    public int getAm_type() {
        return am_type;
    }

    public int getAm_national_area() {
        return am_national_area;
    }

    public String getFile_poster_url() {
        return file_poster_url;
    }

    public int getAm_release_time() {
        return am_release_time;
    }

    public int getAm_length() {
        return am_length;
    }

    public String getAm_alias() {
        return am_alias;
    }

    public String getIMDb_id() {
        return IMDb_id;
    }

    public String getDouban_id() {
        return douban_id;
    }

    public String getAm_introduction() {
        return am_introduction;
    }

    public Float getDouban_level() {
        return douban_level;
    }

    public int getAm_subscriber_num() {
        return am_subscriber_num;
    }

    public Timestamp getAm_create_time() {
        return am_create_time;
    }

    public Timestamp getAm_update_time() {
        return am_update_time;
    }

    @Override
    public String toString() {
        return "AnimationEntity{" +
                "id=" + id +
                ", am_name='" + am_name + '\'' +
                ", am_performer='" + am_performer + '\'' +
                ", am_director='" + am_director + '\'' +
                ", am_type=" + am_type +
                ", am_national_area=" + am_national_area +
                ", file_poster_url='" + file_poster_url + '\'' +
                ", am_release_time=" + am_release_time +
                ", am_length=" + am_length +
                ", am_alias='" + am_alias + '\'' +
                ", IMDb_id='" + IMDb_id + '\'' +
                ", douban_id='" + douban_id + '\'' +
                ", am_introduction='" + am_introduction + '\'' +
                ", douban_level=" + douban_level +
                ", am_subscriber_num=" + am_subscriber_num +
                ", am_create_time=" + am_create_time +
                ", am_update_time=" + am_update_time +
                '}';
    }
}
