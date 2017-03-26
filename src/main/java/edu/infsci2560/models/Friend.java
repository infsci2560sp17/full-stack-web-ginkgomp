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
public class Friend {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String petName;
    protected String petBreed;
    protected int petAge;


    public Friend() {
        this.id = Long.MAX_VALUE;
        this.petName = null;
        this.petBreed = null;
        this.petAge = 0;
    }

    public Friend(Long id, String petName, String petBreed, int petAge) {
      this.id = id;
      this.petName = petName;
      this.petBreed = petBreed;
      this.petAge = petAge;
  }


    @Override
    public String toString() {
        return "[ id=" + this.id + ", petName=" + this.petName + ", petBreed=" + this.petBreed +  ", petAge=" + this.petAge + " ]";
       
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
    public int getPetAge() {
        return petAge;
    }

    /**
     * @param content the content to set
     */
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

 }
