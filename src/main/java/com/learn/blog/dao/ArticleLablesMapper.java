package com.learn.blog.dao;

import com.learn.blog.pojo.ArticleLables;
import com.learn.blog.pojo.ArticleLablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleLablesMapper {
    long countByExample(ArticleLablesExample example);

    int deleteByExample(ArticleLablesExample example);

    int insert(ArticleLables record);

    int insertSelective(ArticleLables record);

    List<ArticleLables> selectByExample(ArticleLablesExample example);

    int updateByExampleSelective(@Param("record") ArticleLables record, @Param("example") ArticleLablesExample example);

    int updateByExample(@Param("record") ArticleLables record, @Param("example") ArticleLablesExample example);
}