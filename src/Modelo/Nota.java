/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author VandurTheWizard <https://github.com/VandurTheWizard>
 */
public class Nota implements Serializable{
    private String tema;
    private String nombre;

    public Nota(String tema, String nombre) {
        this.tema = tema;
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tema=" + tema + ", Nombre=" + nombre;
    }
    
}
