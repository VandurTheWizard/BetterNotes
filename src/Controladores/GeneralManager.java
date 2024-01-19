/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Nota;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VandurTheWizard <https://github.com/VandurTheWizard>
 */
public class GeneralManager {

    public GeneralManager() {
    }
    
    public ArrayList<Nota> scanNotes(File f, boolean filterExtension){
        return scanNotes(f, "", filterExtension);
    } 
    
    public ArrayList<Nota> scanNotes(File f){
        return scanNotes(f, ".txt", true);
    } 
    
    public ArrayList<Nota> scanNotes(File f, String extension, boolean filterExtension){
        ArrayList <Nota> list = null;
        
        if(f.isDirectory()){
            list = new ArrayList<>();
            
            File listTemas [] = f.listFiles();
            
            for(File tema : listTemas){
                if(tema.isDirectory()){
                    File [] archivos = tema.listFiles();
                    for(File archivo : archivos){
                        if(archivo.getName().contains(extension) || !filterExtension){
                            list.add(new Nota(tema.getName(), archivo.getName()));
                        }  
                    }
                }
                
            }
            
        }
        
        return list;
    }
    
    
    public String readNote(File f){
        FileReader fr = null;
        BufferedReader br = null;
        String txt = "";
        
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            String aux = "";
            
            while((aux = br.readLine()) != null){
                txt += aux + "\n";
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeneralManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GeneralManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(GeneralManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        return txt;
    }
}
