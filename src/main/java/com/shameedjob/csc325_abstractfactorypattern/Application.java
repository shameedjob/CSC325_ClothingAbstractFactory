/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shameedjob.csc325_abstractfactorypattern;

/**
 *
 * @author shameedjob
 */
public class Application {
    public Pants pants;
    public Top top;
    public Shoes shoes;
    
    /**
     * Constructor that creates the clothing using a specified factory
     * @param factory the factory that creates the clothing objects
     */
    public Application(ClothingFactory factory) {
        pants = factory.makePants();
        shoes = factory.makeShoes();
        top = factory.makeTop();
    }
    
    /**
     * Displays the data for the clothing created by the factory
     */
    public void showAllClothing(){
        pants.showPantsData();
        shoes.showShoesData();
        top.showTopData();
    }

}
