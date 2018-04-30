package com.cn.ptj.dao;

import com.cn.ptj.model.teacher;

public interface teacherMapper {
    int deleteByPrimaryKey(Long id);

    int insert(teacher record);

    int insertSelective(teacher record);

    teacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(teacher record);

    int updateByPrimaryKey(teacher record);
}