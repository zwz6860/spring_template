package org.java.mapper;

import java.util.List;

import org.java.entity.WinningList;

public interface WinningListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WinningList record);

    int insertSelective(WinningList record);

    WinningList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WinningList record);

    int updateByPrimaryKey(WinningList record);
    
    //查询所有中奖记录
    List<WinningList> getInfo();
}