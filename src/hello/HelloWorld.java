package hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
  
@Path("/message")
public class HelloWorld
{
    @GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
}