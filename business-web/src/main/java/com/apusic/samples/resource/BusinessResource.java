package com.apusic.samples.resource;

import com.apusic.samples.models.Response;
import com.apusic.samples.services.BusinessServiceBean;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("business")
public class BusinessResource {

    @EJB
    private BusinessServiceBean businessService;

    @GET
    @Path("/createOrder")
    @Produces("application/json")
    public Response createOrder(@QueryParam("userId") String userId,
                                @QueryParam("commodityCode") String commodityCode,
                                @QueryParam("count") int count) {
        return businessService.createOrder(userId, commodityCode, count);
    }

}
