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
public class Company 
{
    private float price;
    private Enclosure[] enclosures;
    
    public Company()
    {
        enclosures = new Enclosure[10];
        price = 10;
        
        for(int i=0; i < enclosures.length; i++)
        {
            enclosures[i] = new Enclosure();
        }
    }
    
    public int setBooking(Dog dogInfo, int stayTime)
    {
        for(int roomNumber=0; roomNumber < enclosures.length; roomNumber++)
        {
            if (enclosures[roomNumber].setStay(dogInfo, stayTime, (stayTime * 50)))
            {
                return roomNumber;
            }
        }
        return -1;
    }
    
    public boolean removeBooking(int roomNumber){
        if (roomNumber >= 0 && roomNumber < enclosures.length)
        {
            enclosures[roomNumber].removeStay();
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
}
