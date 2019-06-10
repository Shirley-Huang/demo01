package com.dandan.mybatis;

import com.dandan.pojo.TOrder;
import com.dandan.pojo.TOrderExample;
import com.dandan.pojo.TOrderWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderMapper {
    long countByExample(TOrderExample example);

    int deleteByExample(TOrderExample example);

    int insert(TOrderWithBLOBs record);

    int insertSelective(TOrderWithBLOBs record);

    List<TOrderWithBLOBs> selectByExampleWithBLOBs(TOrderExample example);

    List<TOrder> selectByExample(TOrderExample example);

    int updateByExampleSelective(@Param("record") TOrderWithBLOBs record, @Param("example") TOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") TOrderWithBLOBs record, @Param("example") TOrderExample example);

    int updateByExample(@Param("record") TOrder record, @Param("example") TOrderExample example);
}