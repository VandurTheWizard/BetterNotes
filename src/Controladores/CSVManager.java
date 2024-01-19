/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Nota;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author VandurTheWizard <https://github.com/VandurTheWizard>
 */
public class CSVManager {

    public CSVManager() {
    }
    
    public void writeCSV(ArrayList<Nota> list, File f){
        FileWriter fw = null;
        
        try {  
            fw = new FileWriter(f);
            
            for(Nota n : list){
                
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error en writerManager");
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error en writerManager");
            }
        }
         
    }
    
    
}
