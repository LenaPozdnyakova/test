package com.example.test.resources;

import com.example.test.services.BookService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path(value = "/book")
public class BookResource{

    private BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @GET
    @Path("/find/ByAuthorId/{authorId}")
    public Response findByAuthorId(@PathParam("authorId") Long authorId){
        return Response.status(Response.Status.OK).entity(bookService.getAllByAuthorId(authorId)).build();
    }

    @GET
    @Path(value="/all")
    public String getAllBook(){
        return "у нас все получилось";
    }

    @POST
    public String postBook() {
        return "У меня все получилось<З";
    }

}


