
package bexysuttx.controller;

import bexysuttx.service.BussinessService;
import java.util.List;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/bykey")
public class ReadParamController {

    @Autowired
    private ServletContext servletContext;

    @Autowired
    private BussinessService bussinessService;

    @GET
    @Path("/getjson")
    public Response getTable(@QueryParam("key") List<Integer> id) {
        String sqlQuery = servletContext.getInitParameter("sqlQuery");
        if (!id.isEmpty()) {
            String result = bussinessService.findRowById(sqlQuery, id);
            return Response.status(200).entity(result).type(MediaType.APPLICATION_JSON).build();
        } else {
            String notParam = "Please add the parameter to URL and try again.";
            return Response.status(200).entity(notParam).type(MediaType.TEXT_HTML).build();
        }
    }
}
