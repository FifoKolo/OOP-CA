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
public class  Output {
    protected String route;
    protected String r3turn;
    //arrays holding locations
    protected String[] routeCombo;
    protected String[] r3turnCombo;
    protected String  time;
    protected int co2;

    public Output(String route, String r3turn, String time) {
        this.route = route;
        this.r3turn = r3turn;
        this.time=time;
    }
    public Output() {
        this.route = " ";
        this.r3turn = " ";
        this.time=" ";
    }
     public String output(){
        //initialise();
        String output;
        output=" You have successfully set your Destination\n from "+route+" to "+r3turn+".\n You will emit "+co2+" Co2 from your chosen Transport Option.\nYour Destination will take "+time;
        return output;
    }
    // protected abstract void initialise();
     
     
     private String[] routeCombo(){
         return routeCombo;
     }
     private String[] r3turnCombo(){
         return r3turnCombo;
     }
   
        
}
