/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package betternotes;

import Controladores.CSVManager;
import Controladores.GeneralManager;
import Modelo.Nota;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author VandurTheWizard <https://github.com/VandurTheWizard>
 */
public class BetterNotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Zona de testeo
        GeneralManager gm = new GeneralManager();
        
        ArrayList <Nota> lista = gm.scanNotes(new File("C:\\Users\\radok\\Desktop\\Test"), false);
        
        if(lista != null){
            for(Nota n : lista){
                System.out.println(n);
                
                CSVManager csvMana = new CSVManager();
        
                csvMana.writeCSV(lista, new File("C:\\Users\\radok\\Desktop\\Test\\ScanNotas.csv"));
            }
        }
    }
    
}
