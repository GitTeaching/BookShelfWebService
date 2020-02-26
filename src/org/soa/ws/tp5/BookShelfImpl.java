package org.soa.ws.tp5;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "org.soa.ws.tp5.BookShelf", serviceName="BookShelfService",
               portName ="BookShelfServicePort")
public class BookShelfImpl implements BookShelf {
	
	ArrayList<BookVO> books =  new ArrayList<BookVO>();
	
	public BookShelfImpl() {
		books.add(new BookVO("bookA","Foundation and Earth", "Issac Asimov"));
		books.add(new BookVO("bookB","Foundation and Empire", "Issac Asimov"));
		books.add(new BookVO("bookC","Rama Revealed", "Arthur C Clarke"));
		books.add(new BookVO("bookD","TTP", "Spinoza"));
	}
	
	
	@WebMethod
    public BookVO getBook(String title) {
    	for(int i=0; i < books.size(); i++)
    		if(title.equals(books.get(i).getName()))
    			return books.get(i);
         return null;
    }
    
    @WebMethod
    public  boolean isBookAvailable(String title) {
    	for(int i=0; i < books.size(); i++)
    		if(title.equals(books.get(i).getName()))
    			return true;
		return false;
    }

}
