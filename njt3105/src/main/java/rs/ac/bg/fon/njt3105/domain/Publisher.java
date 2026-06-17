/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt3105.domain;

import jakarta.persistence.*;

/**
 *
 * @author natal
 */
@Entity
@Table(name = "izdavac")
public class Publisher {
    @Id
    private String pib;
    @Column(name = "naziv")
    private String name;
    @Column(name = "maticniBroj")
    private String mB;
    @ManyToOne
    @JoinColumn(name = "mesto")
    private City city;

    public Publisher() {
    }

    public Publisher(String pib, String name, String mB, City city) {
        this.pib = pib;
        this.name = name;
        this.mB = mB;
        this.city = city;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmB() {
        return mB;
    }

    public void setmB(String mB) {
        this.mB = mB;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Publisher " + "pib=" + pib + ", name=" + name + ", mB=" + mB + ", city=" + city;
    }
    
    
            
            
}
