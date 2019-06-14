package com.example.sharding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.sharding.entity.TOrder;
import com.example.sharding.entity.TUser;
import com.example.sharding.entity.User;
import com.example.sharding.mapper.TOrderMapper;
import com.example.sharding.mapper.service.TOrderService;
import com.example.sharding.mapper.service.TUserService;
import com.example.sharding.mapper.service.UserService;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringbootShardingApplicationTests {
    @Autowired
    private TOrderService tOrderService;
    @Autowired
    private TOrderMapper tOrderMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private TUserService tUserService;

    @Test
    public void testTUser() {
        // 不分库不分表
        TUser tUser = new TUser();
        tUser.setId(1L);
        tUser.setUserId("22");
        tUserService.insertTUser(tUser);
    }

    @Test
    public void testUser() {
        // 不分库分表
        User user = new User();
        user.setId(3L);
        user.setUserId(4L);
        userService.insertUser(user);

    }

    @Test
    public void testTOrder() {
        // 分库分表
        TOrder tOrder = new TOrder();
        tOrder.setOrderId(1L);// 根据orderid分表 tOrder.setUserId(2L);//根据userid分库
        tOrderService.insertTOrder(tOrder);
    }

    @Test
    public void testTOrderQuery() {
        // 分库分表查询
        // 1、先根据orderid定位表，然后往多个库中并发查询
        log.info(tOrderMapper.selectById(1L).getOrderId() + "xxxxxxxxxxxxx");

        // 2、根据orderid定位表，根据userid定位库
        Map<String, Object> map = new HashMap<>();
        map.put("order_id", 2L);
        map.put("user_id", 2L);
        List<TOrder> lOrders = tOrderMapper.selectByMap(map);
        log.info(lOrders.get(0).getOrderId() + "yyyyyyyyyyyyyyy");

        // 3、根据userid定位库，然后往多个表中并发查询
        Map<String, Object> map2 = new HashMap<>();
        map.put("user_id", 2L);
        List<TOrder> lOrders1 = tOrderMapper.selectByMap(map2);
        log.info(lOrders1.get(0).getOrderId() + "zzzzzzzzzzzzzzzz");
    }

    @Test
    public void testTOrderALLQuery() {
        // 查询全部
        List<TOrder> lOrders = tOrderMapper.selectList(null);
        for (TOrder order : lOrders) {
            log.info(lOrders.size() + "" + order.getUserId() + "CCCCCCCCCC");
        }
    }

    @Test
    public void testTOrderJoinTOrderItemQuery() {
        // 多表查询
        List<TOrder> lOrders = tOrderMapper.selectTOrderJoinTOrderItem(2L, 2L);
        log.info(lOrders.get(0).getOrderId() + "AAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void testTOrderJoinTOrderItemQuery1() {
        // 多表查询
        List<TOrder> lOrders = tOrderMapper.selectTOrderJoinTOrderItem1(2L);
        for (TOrder order : lOrders) {
            log.info(lOrders.size() + "" + order.getUserId() + "BBBBBBBBBBBBBBB");
        }
    }

    @Test
    public void testSid() {
        // sid主键  190614CYZXRGXZTC 190614CZ946P57HH 190614CZBZGWFBHH
        log.info(Sid.nextShort() + "....SID主键AAAAAAAAAAAAAAAAAAAAAAAAAAAA");

    }


}
