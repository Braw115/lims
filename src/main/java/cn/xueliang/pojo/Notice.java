package cn.xueliang.pojo;

import java.util.Date;

public class Notice {
    private Integer id;

    private String title;

    private Date announceData;

    private String announceDept;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getAnnounceData() {
        return announceData;
    }

    public void setAnnounceData(Date announceData) {
        this.announceData = announceData;
    }

    public String getAnnounceDept() {
        return announceDept;
    }

    public void setAnnounceDept(String announceDept) {
        this.announceDept = announceDept == null ? null : announceDept.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}