package com.baidu.controller;

import com.baidu.pojo.Orders;
import com.baidu.pojo.QueryVo;
import com.baidu.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

//控制层
//@RestController =@Controller+@ResponseBody(使返回的是数据)
@CrossOrigin //vue前后端分离 解决端口号不一致问题 跨域
@RestController
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

   /* @GetMapping("test")
    public String TestHello() {
        return "hello";
    }*/

    //条件查询
    @GetMapping("showOrd")
    public String showOrd(Model model, QueryVo vo){
        //模糊搜索
        List<Orders> orders = ordersService.findOrders(vo);
        model.addAttribute("vo",vo);
        model.addAttribute("orders",orders);
        return "order";
    }

    //删除
    @GetMapping("/del")
    public String del(Integer oid){
        int i = ordersService.delById(oid);
        if (i>0){
            return "redirect:showOrd";
        }
        return "error";
    }
    @DeleteMapping("/delete/{oid}")
    public void delOrder(@PathVariable("oid") Integer oid){
        try {
            ordersService.delOrder(oid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    //订单展示
    @GetMapping("show")
    public List<Orders> show() {
        return ordersService.findAll();
    }
}
