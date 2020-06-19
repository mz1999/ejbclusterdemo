package com.apusic.samples.services;

import com.apusic.samples.models.Response;
import services.OrderService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

@Stateless
public class BusinessServiceBean {

    private OrderService orderService;

    @PostConstruct
    public void init() {
        try {
            Properties properties = new Properties();
            properties.put("com.sun.appserv.iiop.endpoints", "172.20.140.11:23700,172.20.140.12:23700");
            InitialContext ic = new InitialContext(properties);
            orderService = (OrderService) ic.lookup("java:global/order-ejb/OrderServiceBean");
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("[BusinessServiceBean.init]" + orderService.getClass());
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("[BusinessServiceBean.cleanup]");
    }


    public Response createOrder(String userId, String commodityCode, int count) {
        System.out.println("[BusinessServiceBean]userId: " + userId + ", commodityCode: " + commodityCode + ", count: " + count);
        orderService.create(userId, commodityCode, count);
        return new Response(200, userId, commodityCode, count, System.currentTimeMillis());
    }

}
