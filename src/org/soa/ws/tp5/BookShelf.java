package org.soa.ws.tp5;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface BookShelf {
    
    @WebMethod
    @WebResult(name="ReturnedBook")
    public  BookVO getBook(@WebParam(name="title")String title);
    
    @WebMethod
    public  boolean isBookAvailable(@WebParam(name="title")String title);
    
}
