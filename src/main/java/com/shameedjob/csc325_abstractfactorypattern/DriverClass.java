/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.shameedjob.csc325_abstractfactorypattern;

/**
 *
 * @author shameedjob
 */
public class DriverClass {
    
    /**
     * Configures the application depending on an input string that determines
     * the type of factory
     * @param factoryType contains a keyword that determines the type of factory
     * @return 
     */
    private static Application configureApplication(String factoryType){

        Application app;
        ClothingFactory factory;

        //Make 
        if (factoryType.contains("casual")) {
            factory = new CasualClothingFactory();
            app = new Application(factory);
        } else if(factoryType.contains("professional")){
            factory = new ProfessionalClothingFactory();
            app = new Application(factory);
        }
        else{
            factory = new PartyClothingFactory();
            app = new Application(factory);
        }
        return app;
    }
    
    public static void main(String[] args) {
        var app = configureApplication("casual");
        
        app.showAllClothing();
    }
}
