/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject1;

/**
 *
 * @author andy
 */
public class Plants extends LivingBeing {
    
    private String grows;
    private String oxygenLevel;

    public Plants(byte age, String type , String grows, String oxygenLevel) {
        super(age, type);
        this.grows = grows;
        this.oxygenLevel = oxygenLevel;
    }

    public String getGrows() {
        return grows;
    }

    public String getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(String oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public String toString() {
        
        return "Age: " + getAge() + "\n" + "Type : " + getType() + "\n" + "grows : " + grows + "\n" + "oxygenLevel : " + oxygenLevel;
    }
    
    
}