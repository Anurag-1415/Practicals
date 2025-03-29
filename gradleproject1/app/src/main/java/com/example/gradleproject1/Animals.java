/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gradleproject1;

/**
 *
 * @author andy
 */
public class Animals extends LivingBeing {
    private  String gender;
    private String food;
    
    Animals(byte age,String type,String gender,String food){
        super(age,type);
        this.gender = gender;
        this.food = food;
    }

    public String getGender() {
        return gender;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String toString() {
        return "Age : "+  getAge() + "\n" + "Type : "+ getType() + "\n" +  "gender : " + gender + "\n" + "food=" + food;
    }
    
    
    
}
