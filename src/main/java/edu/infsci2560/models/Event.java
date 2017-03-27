/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author Wenwen Sun
 */
@Entity
public class Event {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String eventTitle;
    protected String eventDate;
    protected String eventContent;
    protected String imageName;


    public Event() {
        this.id = Long.MAX_VALUE;
        this.eventTitle = null;
        this.eventDate = null;
        this.eventContent = null;
        this.imageName = null;
    }

    public Event(Long id, String eventTitle, String eventDate, String eventContent, String imageName) {
      this.id = id;
      this.eventTitle = eventTitle;
      this.eventDate = eventDate;
      this.eventContent = eventContent;
      this.imageName = imageName;
  }


    @Override
    public String toString() {
        return "[ id=" + this.id + ", eventTitle=" + this.eventTitle + ", eventDate=" + this.eventDate +  ",eventContent=" + this.eventContent + ", imageName=" + this.imageName +" ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the eventTitle
     */
    public String getEventTitle() {
        return eventTitle;
    }

    /**
     * @param eventTitle the eventTitle to set
     */
    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }


    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * @return the eventDate
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * @param eventDate the eventDate to set
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * @return the eventContent
     */
    public String getEventContent() {
        return eventContent;
    }

    /**
     * @param eventContent the eventContent to set
     */
    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }
    
    public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


}
