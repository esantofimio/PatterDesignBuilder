/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterdesign;

/**
 *
 * @author Estudiante
 */
public class Auto {
    private int cantidadDePuertas;
    private String modelo;
    private String marca;
    private String motor;
    
    public int getCantidadDePuertas(){
        return cantidadDePuertas;
    }
    public void setCantidadDePuertas(int cantidadDePuertas){
        this.cantidadDePuertas = cantidadDePuertas;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    public String Motor(){
        return motor;
    }
    public void setMotor(String motor){
        this.motor = motor;
    }
    
}
