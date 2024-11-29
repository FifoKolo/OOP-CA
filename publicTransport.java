/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package routeplannapp;

/**
 *
 * @author mncrf
 */
    public class publicTransport extends Structure {

    public publicTransport(String route, String r3turn) {
        super(route, r3turn);
    }
    
    public void initialise(){
        routeCombo=new String[]{"O'Connell street","Grafton street","Pearse Street","Henry Street","Earl Street"};
        r3turnCombo=new String[]{"O'Connell street","Grafton Street","Pearse Street","Henry Street","Earl Street"};
        
        
            
        }

    public String[] getrouteCombo() {
        return routeCombo;
    }

    public String[] getr3turnCombo() {
        return r3turnCombo;
    }
        
    }
    
 
    
    

