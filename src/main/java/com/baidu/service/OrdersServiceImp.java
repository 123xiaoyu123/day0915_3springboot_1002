package com.baidu.service;

import com.baidu.mapper.OrdersMapper;
import com.baidu.pojo.Orders;
import com.baidu.pojo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class OrdersServiceImp implements OrdersService{
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> findOrders(QueryVo vo) {
        //通用mapper的条件查询
        Example example = new Example(Orders.class);//自定义条件搜索对象
        Example.Criteria criteria = example.createCriteria();//条件构造器
        //条件进行判断
        if (vo.getOnumber()!=null && vo.getOnumber()!=""){
            criteria.andEqualTo("vo.getOnumber()",vo.getOnumber());
        }
        else if (vo.getCreatetime()!=null ){
            criteria.andEqualTo("vo.getCreatetime()",vo.getCreatetime());
        }
        else if (vo.getPrice()!=null && vo.getPrice()!=0){
            criteria.andEqualTo("vo.getPrice()",vo.getPrice());
        }

        return ordersMapper.selectByExample(example);
    }

    @Override
    public List<Orders> findAll() {
        return ordersMapper.selectAll();
    }


    @Override
    public int delById(Integer oid) {
        return ordersMapper.delById(oid);
    }

    @Override
    public void delOrder(Integer oid) {
        ordersMapper.delById(oid);
    }
}
