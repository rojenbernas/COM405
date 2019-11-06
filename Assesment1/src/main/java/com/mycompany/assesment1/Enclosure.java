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
public class Enclosure 
{
    private Dog stay;
    private int stayTime;
    private float stayCost;
    
    public Enclosure() 
    {
        stay = null;
        stayTime = 0;
        stayCost = 0;
    }
    
    public boolean setStay(Dog dogInfo, int timeOfStay, float costOfStay)
    {
        if(stay!=null)
        {
            return false;
        }
        
        stay = dogInfo;
        stayTime = timeOfStay;
        stayCost = costOfStay;
        return true;
    }
    
    public boolean removeStay()
    {
        stay = null;
        stayTime = 0;
        stayCost = 0;
        return true;
    }
}
