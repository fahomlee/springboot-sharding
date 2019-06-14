package com.example.sharding.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sharding.entity.TOrder;


@Mapper
public interface TOrderMapper extends BaseMapper<TOrder> {
    
    List<TOrder> selectTOrderJoinTOrderItem(@Param("orderId") Long orderId,@Param("userId") Long userId);
    
    List<TOrder> selectTOrderJoinTOrderItem1(@Param("orderId") Long orderId);
    
    List<TOrder> selectTOrderJoinTOrderItem2(@Param("userId") Long userId);
}
