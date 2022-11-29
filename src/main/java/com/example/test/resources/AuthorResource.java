package com.example.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path(value = "/author")
public class AuthorResource {

    @GET
    @Path(value = "/all")
    public String getAllAuthor(){
        return "у нас все получилось(наверное)";
    }

    @POST
    public String postAuthor(){
        return "У меня все получилось";
    }
}
