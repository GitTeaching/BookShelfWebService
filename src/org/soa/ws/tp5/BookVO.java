package org.soa.ws.tp5;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"id", "author", "name"})
public class BookVO {

    private String id;
    private String name;
    private String author;
    
    public BookVO(String id, String name, String author) {
		this.id=id;
		this.name=name;
		this.author = author;
	}
    public BookVO () {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlElement(name="bookId")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

        @XmlElement(name="bookName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
