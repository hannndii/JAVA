/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trialobject;

/**
 *
 * @author tupog
 */
public class manusia {
    private String name;
    private int tinggi;
    
    void setInfo(String name, int tinggi){
        this.name = name;
        this.tinggi = tinggi;
    }
    
    void print(){
        System.out.println(this.name+"memiliki tinggi sekitar"+this.tinggi+"Cm");
    }
}
