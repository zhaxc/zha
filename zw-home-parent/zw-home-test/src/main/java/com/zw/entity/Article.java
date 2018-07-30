package com.zw.entity;

import com.zw.enums.QueryField;
import com.zw.enums.QueryType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by zha on 2017/8/4.
 */
@Document
public class Article {

    @QueryField
    @Id
    private Integer id;

    @QueryField
    private String title;

    @QueryField(type = QueryType.LIKE, attribute = "content")
    private String content;

    @QueryField(type = QueryType.IN, attribute = "title")
    private List<String> queryTitles;

    public Article() {
    }

    public Article(Integer id, String title, String content, List<String> queryTitles) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.queryTitles = queryTitles;
    }

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
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getQueryTitles() {
        return queryTitles;
    }

    public void setQueryTitles(List<String> queryTitles) {
        this.queryTitles = queryTitles;
    }


}
