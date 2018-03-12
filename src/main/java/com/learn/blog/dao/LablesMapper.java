package com.learn.blog.dao;

import com.learn.blog.pojo.Lables;
import com.learn.blog.pojo.LablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LablesMapper {
    long countByExample(LablesExample example);

    int deleteByExample(LablesExample example);

    int deleteByPrimaryKey(Integer lablesId);

    int insert(Lables record);

    int insertSelective(Lables record);

    List<Lables> selectByExample(LablesExample example);

    Lables selectByPrimaryKey(Integer lablesId);

    int updateByExampleSelective(@Param("record") Lables record, @Param("example") LablesExample example);

    int updateByExample(@Param("record") Lables record, @Param("example") LablesExample example);

    int updateByPrimaryKeySelective(Lables record);

    int updateByPrimaryKey(Lables record);
}