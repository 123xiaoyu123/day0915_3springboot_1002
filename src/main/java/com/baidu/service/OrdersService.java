package com.baidu.service;

import com.baidu.pojo.Orders;
import com.baidu.pojo.QueryVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdersService {
    /*查询所有的订单*/
    List<Orders> findOrders(QueryVo vo);

    List<Orders> findAll();

    /*根据id删除订单*/
    int delById(Integer oid);
}
