/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Nota;
import java.io.File;
import java.util.ArrayList;
import com.google.gson.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VandurTheWizard <https://github.com/VandurTheWizard>
 */
public class JSONManager {

    public JSONManager() {
    }
    
    public void writeJSON(ArrayList <Nota> lista, File f){
        Gson gson = new Gson();
        FileWriter fw = null;
        
        try {
            fw = new FileWriter(f, true);
            
            for(Nota n : lista){
                //Codigo para escribir el Json
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(JSONManager.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
}
