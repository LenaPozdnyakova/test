package com.example.test.resources;

import com.example.test.enteties.Book;
import com.example.test.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/book")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    private BookService bookService;
    @Autowired
    public BookResource(BookService bookService) {

        this.bookService = bookService;
    }

    @GET
    @Path("/find/ByAuthorId/{authorId}")
    public Response findByAuthorId(@PathParam("authorId") Long authorId) {
        return Response.status(Response.Status.OK).entity(bookService.getAllByAuthorId(authorId)).build();
    }

    @GET
    @Path(value = "/all")
    public String getAllBook() {
        return "у нас все получилось";
    }

    @POST
    public Response addBook(Book book) {
        return Response.ok().entity(bookService.add(book)).build();
    }


    @DELETE
    @Path("/delete/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        bookService.deleteById(id);
        return Response.status(Response.Status.OK).build();
    }
}


