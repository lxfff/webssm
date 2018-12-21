package com.name.web.dao;

import com.name.web.model.Demo;

public interface DemoDao {
    int deleteByPrimaryKey(Long demoId);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Long demoId);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}