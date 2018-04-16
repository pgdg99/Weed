/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.punto1.modelo;

import becker.robots.*;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class ZonaCarga extends Thing implements Runnable {
    private ArrayList<Carga> zona;

    public ZonaCarga(int cant, City city, int i, int i1) {
        super(city, i, i1);
        zona= new ArrayList<>(cant); 
        setIcon(new Bicon("solarpanel.png"));
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
