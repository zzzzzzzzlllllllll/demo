package com.demo.mapper;

import com.demo.entity.Flow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FlowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Flow record);

    Flow selectByPrimaryKey(Integer id);

    List<Flow> selectAll();

    int updateByPrimaryKey(Flow record);
}