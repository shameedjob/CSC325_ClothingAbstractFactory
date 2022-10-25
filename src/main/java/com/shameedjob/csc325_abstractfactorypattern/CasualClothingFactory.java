/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shameedjob.csc325_abstractfactorypattern;

/**
 *
 * @author shameedjob
 */
public class CasualClothingFactory implements ClothingFactory{

    @Override
    public Pants makePants() {
        return new CasualPants();
    }

    @Override
    public Shoes makeShoes() {
        return new CasualShoes();
    }

    @Override
    public Top makeTop() {
        return new CasualTop();
    }
    
}
