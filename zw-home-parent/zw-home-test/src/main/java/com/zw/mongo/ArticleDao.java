package com.zw.mongo;

import com.zw.entity.Article;
import org.springframework.stereotype.Repository;

/**
 * Created by zha on 2017/8/4.
 */
@Repository("articleDao")
public class ArticleDao extends MongodbBaseDao<Article>{

    @Override
    protected String getCollection() {
        return null;
    }
}
