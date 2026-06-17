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
@Table(name = "autor")
public class Author {
    @Id
    private String email;
    @Column(name = "sifra")
    private String password;
    @Column(name = "ime")
    private String name;
    @Column(name="prezime")
    private String lastName;
    @Column(name = "godiste")
    private int yearOfBirth;

    public Author() {
    }

    public Author(String email, String password, String name, String lastName, int yearOfBirth) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Author " + "email=" + email + ", password=" + password + ", name=" + name + ", lastName=" + lastName + ", yearOfBirth=" + yearOfBirth;
    }
    
    
    
}
