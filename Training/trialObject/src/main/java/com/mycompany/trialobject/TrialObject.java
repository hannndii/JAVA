/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trialobject;
/**
 *
 * @author tupog
 */
public class TrialObject {

    public static void main(String[] args) {
        
        manusia[] human = new manusia[4];
        for(int i = 0; i < human.length; i++){
            human[i] = new manusia();
        }
        human[0].setInfo("A", 180);
        human[1].setInfo("B", 180);
        human[2].setInfo("C", 180);
        human[3].setInfo("D", 180);
        
        human[0].print();
        human[1].print();
        human[2].print();
        human[3].print();
    }    
    
}
