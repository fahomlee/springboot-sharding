package com.example.sharding.mapper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sharding.entity.TOrder;
import com.example.sharding.mapper.TOrderMapper;
import com.example.sharding.mapper.service.TOrderService;

@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements TOrderService {

    @Autowired
    private TOrderMapper tOrderMapper;
    @Override
    public void insertTOrder(TOrder tOrder) {
        tOrderMapper.insert(tOrder);
    }
    
}