package services;

import javax.ejb.Remote;

@Remote
public interface OrderService {

    public void create(String userId, String commodityCode, int count);

}
