package com.example.test.resources;

import com.example.test.enteties.Author;
import com.example.test.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/author")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthorResource {

    private final AuthorService authorService;

    @Autowired
    public AuthorResource(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GET
    @Path(value = "/all")
    public String getAllAuthor() {
        return "у нас все получилось(наверное)";
    }

    @POST
    @Path("/save")
    public Response addAuthor(Author author) {
        return Response.ok().entity(authorService.add(author)).build();
    }

    @DELETE
    @Path("/delete/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        authorService.deleteById(id);
        return Response.status(Response.Status.OK).build();
    }
}
