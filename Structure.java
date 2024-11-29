/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package routeplannapp;

import java.util.Arrays;

/**
 *
 * @author mncrf
 */
public abstract class  Structure {
    protected String route;
    protected String r3turn;
    //arrays holding locations
    protected String[] routeCombo;
    protected String[] r3turnCombo;

    public Structure(String route, String r3turn) {
        this.route = route;
        this.r3turn = r3turn;
    }
     public final String output(){
        initialise();
        String calculation;
        calculation= Arrays.toString(routeCombo);
        calculation=calculation+",\n";
        calculation=calculation+Arrays.toString(r3turnCombo);
        return calculation;
    }
     protected abstract void initialise();
     
     
     private String[] routeCombo(){
         return routeCombo;
     }
     private String[] r3turnCombo(){
         return r3turnCombo;
     }
        
}
