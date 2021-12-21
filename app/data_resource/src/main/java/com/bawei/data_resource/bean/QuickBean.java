package com.bawei.data_resource.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 14:28
 * 用途：
 */
class QuickBean {
    @Id(autoincrement = true)
    private long myid;
    public long getMyid() {
        return myid;
    }

    public void setMyid(long myid) {
        this.myid = myid;
    }
    private int id;
    private String authname;
    private String publishtime;
    private String caption;
    private int view_count;
    private int like_count;
    private String headpath;
    private String videopath;
    private String videomainimg;

    @Generated(hash = 624276781)
    public QuickBean(long myid, int id, String authname, String publishtime,
            String caption, int view_count, int like_count, String headpath,
            String videopath, String videomainimg) {
        this.myid = myid;
        this.id = id;
        this.authname = authname;
        this.publishtime = publishtime;
        this.caption = caption;
        this.view_count = view_count;
        this.like_count = like_count;
        this.headpath = headpath;
        this.videopath = videopath;
        this.videomainimg = videomainimg;
    }

    @Generated(hash = 578731038)
    public QuickBean() {
    }

    @Override
    public String toString() {
        return "QuickBean{" +
                "id=" + id +
                ", authname='" + authname + '\'' +
                ", publishtime='" + publishtime + '\'' +
                ", caption='" + caption + '\'' +
                ", view_count=" + view_count +
                ", like_count=" + like_count +
                ", headpath='" + headpath + '\'' +
                ", videopath='" + videopath + '\'' +
                ", videomainimg='" + videomainimg + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthname() {
        return authname;
    }

    public void setAuthname(String authname) {
        this.authname = authname;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getView_count() {
        return view_count;
    }

    public void setView_count(int view_count) {
        this.view_count = view_count;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public String getHeadpath() {
        return headpath;
    }

    public void setHeadpath(String headpath) {
        this.headpath = headpath;
    }

    public String getVideopath() {
        return videopath;
    }

    public void setVideopath(String videopath) {
        this.videopath = videopath;
    }

    public String getVideomainimg() {
        return videomainimg;
    }

    public void setVideomainimg(String videomainimg) {
        this.videomainimg = videomainimg;
    }
}
