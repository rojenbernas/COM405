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
public class Main {
    public static void main(String[] args){
        Company company = new Company();
        Dog doggy = new Dog("Jim","Bob",5,"Male","pitbull","goes woof!");
        int bookedIn = company.setBooking(doggy, 3); // sets an example booking
        boolean removeRoom = company.removeBooking(3 - 1); // removes room number 3
        
    }
}
