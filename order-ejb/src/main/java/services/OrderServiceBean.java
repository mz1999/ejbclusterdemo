package services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless
public class OrderServiceBean implements OrderService, Serializable {

    @PostConstruct
    public void init() {
        System.out.println("[OrderServiceBean.init]");

    }

    @PreDestroy
    public void cleanup() {
        System.out.println("[OrderServiceBean.cleanup]");
    }

    public void create(String userId, String commodityCode, int count) {
        System.out.println("[OrderServiceBean]userId:" + userId + ", commodityCode:" + commodityCode + ", count:" + count);
    }
}
