package com.video.xiamikan.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 对应电视剧表
 */
public class TvPlayEntity implements Serializable {

    private Long id;
    private String tv_name;//'电视剧名称',
    private String  tv_poster_url;//电视剧海报url
    private String tv_director;//电视剧导演
    private String tv_performer;//电视剧演员
    private int tv_number;//'电视剧集数',

    private int tv_type;//电视剧类型：喜剧，嫌疑
    private int tv_national_area;//电视剧国家

    private int tv_release_time;//'电视剧年份：如：2018',
    private int tv_length;//'电影长度：分钟，如117',
    private String tv_alias;// '电影别名'
    private String IMDb_id;//'IMDb id 或者url',
    private String douban_id;//'豆瓣id 或者url',
    private String tv_introduction;// '电影简介',
    private Float douban_level;//'豆瓣评分',
    private int tv_subscriber_num;//'订阅人数',
    private Timestamp tv_create_time;//'电影创建时间'
    private Timestamp tv_update_time;//'电影更新时间'

    public void setId(Long id) {
        this.id = id;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public void setTv_poster_url(String tv_poster_url) {
        this.tv_poster_url = tv_poster_url;
    }

    public void setTv_director(String tv_director) {
        this.tv_director = tv_director;
    }

    public void setTv_performer(String tv_performer) {
        this.tv_performer = tv_performer;
    }

    public void setTv_number(int tv_number) {
        this.tv_number = tv_number;
    }

    public void setTv_type(int tv_type) {
        this.tv_type = tv_type;
    }

    public void setTv_national_area(int tv_national_area) {
        this.tv_national_area = tv_national_area;
    }

    public void setTv_release_time(int tv_release_time) {
        this.tv_release_time = tv_release_time;
    }

    public void setTv_length(int tv_length) {
        this.tv_length = tv_length;
    }

    public void setTv_alias(String tv_alias) {
        this.tv_alias = tv_alias;
    }

    public void setIMDb_id(String IMDb_id) {
        this.IMDb_id = IMDb_id;
    }

    public void setDouban_id(String douban_id) {
        this.douban_id = douban_id;
    }

    public void setTv_introduction(String tv_introduction) {
        this.tv_introduction = tv_introduction;
    }

    public void setDouban_level(Float douban_level) {
        this.douban_level = douban_level;
    }

    public void setTv_subscriber_num(int tv_subscriber_num) {
        this.tv_subscriber_num = tv_subscriber_num;
    }

    public void setTv_create_time(Timestamp tv_create_time) {
        this.tv_create_time = tv_create_time;
    }

    public void setTv_update_time(Timestamp tv_update_time) {
        this.tv_update_time = tv_update_time;
    }

    public Long getId() {
        return id;
    }

    public String getTv_name() {
        return tv_name;
    }

    public String getTv_poster_url() {
        return tv_poster_url;
    }

    public String getTv_director() {
        return tv_director;
    }

    public String getTv_performer() {
        return tv_performer;
    }

    public int getTv_number() {
        return tv_number;
    }

    public int getTv_type() {
        return tv_type;
    }

    public int getTv_national_area() {
        return tv_national_area;
    }

    public int getTv_release_time() {
        return tv_release_time;
    }

    public int getTv_length() {
        return tv_length;
    }

    public String getTv_alias() {
        return tv_alias;
    }

    public String getIMDb_id() {
        return IMDb_id;
    }

    public String getDouban_id() {
        return douban_id;
    }

    public String getTv_introduction() {
        return tv_introduction;
    }

    public Float getDouban_level() {
        return douban_level;
    }

    public int getTv_subscriber_num() {
        return tv_subscriber_num;
    }

    public Timestamp getTv_create_time() {
        return tv_create_time;
    }

    public Timestamp getTv_update_time() {
        return tv_update_time;
    }

    @Override
    public String toString() {
        return "TvPlayEntity{" +
                "id=" + id +
                ", tv_name='" + tv_name + '\'' +
                ", tv_poster_url='" + tv_poster_url + '\'' +
                ", tv_director='" + tv_director + '\'' +
                ", tv_performer='" + tv_performer + '\'' +
                ", tv_number=" + tv_number +
                ", tv_type=" + tv_type +
                ", tv_national_area=" + tv_national_area +
                ", tv_release_time=" + tv_release_time +
                ", tv_length=" + tv_length +
                ", tv_alias='" + tv_alias + '\'' +
                ", IMDb_id='" + IMDb_id + '\'' +
                ", douban_id='" + douban_id + '\'' +
                ", tv_introduction='" + tv_introduction + '\'' +
                ", douban_level=" + douban_level +
                ", tv_subscriber_num=" + tv_subscriber_num +
                ", tv_create_time=" + tv_create_time +
                ", tv_update_time=" + tv_update_time +
                '}';
    }
}
