/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Nota;
import java.io.File;
import java.util.ArrayList;

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
    
}
