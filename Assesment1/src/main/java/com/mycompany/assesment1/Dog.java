/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assesment1;

/**
 *
 * @author 4mutlr24
 */
public class Dog {
    private String name;
    private String owner;
    private int age;
    private String gender;
    private String breed;
    private String notes;
    public Dog(String dogName, String dogOwner, int dogAge, String dogGender, String dogBreed, String dogNotes){
        name = dogName;
        owner = dogOwner;
        age = dogAge;
        gender = dogGender;
        breed = dogBreed;
        notes = dogNotes;
    }
    //getters
    public String getName()
    {
        return name;
    }
    
    public String getOwner()
    {
        return owner;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public String getBreed()
    {
        return breed;
    }
    
    public String getNotes()
    {
        return notes;
    }
}
