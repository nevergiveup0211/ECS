Package com.util.services;
import org.springframework.stereotype.Component;
@component
@path("/spring-docker/")
public class HelloIdService{
@GET
@path("/hello")
public Response test(){

return Response.status(200).entity("index page, Date 09-03-2020, Hello AWS Friends").build();
}
}
