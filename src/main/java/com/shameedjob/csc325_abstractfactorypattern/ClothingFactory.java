/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shameedjob.csc325_abstractfactorypattern;

/**
 *
 * @author shameedjob
 */
public interface ClothingFactory {
    Pants makePants();
    Shoes makeShoes();
    Top makeTop();
}
