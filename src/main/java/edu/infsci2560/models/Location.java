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
public class Location {

    private static final long serialVersionUID = 1L;

    public enum LocationType {
        Unknown,
        PublicPark,
        CoffeeShop,
        Hotel,
        Restaurant,
        NaturalAttractions
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String locationName;
    protected LocationType locationType;
    protected String address;
    protected String description;
    protected String imageName;

    public Location() {
        this.id = Long.MAX_VALUE;
        this.locationName = null;
        this.locationType = LocationType.Unknown;
        this.address = null;
        this.description = null;
        this.imageName = null;
    }

    public Location(Long id, String locationName, LocationType locationType, String address, String description, String imageName) {
      this.id = id;
      this.locationName = locationName;
      this.locationType = locationType;
      this.address = address;
      this.description = description;
      this.imageName = imageName;
  }


    @Override
    public String toString() {
        return "[ id=" + this.id + ", locationName=" + this.locationName + ", locationType=" + this.locationType + ", address=" + this.address +  ",description=" + this.description + ", imageName=" + this.imageName + " ]";
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
     * @return the locationName
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * @param name the locationName to set
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * @return the locationType
     */
    public LocationType getLocationType() {
        return locationType;
    }

    /**
     * @param locationType the locationType to set
     */
    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param address the address to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

}
