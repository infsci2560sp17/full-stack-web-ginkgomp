package edu.infsci2560.models;

import java.net.URL;

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
public class Friend {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String petName;
    protected String petBreed;
    protected String petAge;
    protected String imageName;


    public Friend() {
        this.id = Long.MAX_VALUE;
        this.petName = null;
        this.petBreed = null;
        this.petAge = null;
        this.imageName = null;
    }

    public Friend(Long id, String petName, String petBreed, String petAge, String imageName) {
      this.id = id;
      this.petName = petName;
      this.petBreed = petBreed;
      this.petAge = petAge;
      this.imageName = imageName;
  }


    @Override
    public String toString() {
        return "[ id=" + this.id + ", petName=" + this.petName + ", petBreed=" + this.petBreed +  ", petAge=" + this.petAge + ", imageName=" + this.imageName + " ]";
       
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
     * @return the petName
     */
    public String getPetName() {
        return petName;
    }

    /**
     * @param petName the petName to set
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     * @return the petBreed
     */
    public String getPetBreed() {
        return petBreed;
    }

    /**
     * @param petBreed the petBreed to set
     */
    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
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
     * @return the petAge
     */
    public String getPetAge() {
        return petAge;
    }

    /**
     * @param content the content to set
     */
    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
    
    

 }
