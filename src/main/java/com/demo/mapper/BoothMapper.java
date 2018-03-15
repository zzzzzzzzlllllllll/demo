package com.demo.mapper;

import com.demo.entity.Booth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BoothMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Booth record);

    Booth selectByPrimaryKey(Integer id);

    List<Booth> selectAll();

    int updateByPrimaryKey(Booth record);
}