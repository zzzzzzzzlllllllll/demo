package com.demo.mapper;

import com.demo.entity.UserLeave;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserLeaveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLeave record);

    UserLeave selectByPrimaryKey(Integer id);

    List<UserLeave> selectAll();

    int updateByPrimaryKey(UserLeave record);
}