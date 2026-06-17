/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

/**
 *
 * @author natal
 */
@Entity
@Table(name = "mesto")
public class City {
    @Id
    private Long zipcode;
    @Column(name = "naziv")
    private String name;

    public City() {
    }

    public City(Long zipcode, String name) {
        this.zipcode = zipcode;
        this.name = name;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City " + "zipcode=" + zipcode + ", name=" + name;
    }
    
   
    
}
