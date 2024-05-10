/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espacex.decouverte.enginsspatiaux;

/**
 *
 * @author LENOVO
 */
public class DepassementTonnageException extends Exception{
    public int tonnageEnExces;

    public DepassementTonnageException(int tonnageEnExces) {
        super("La cargaison ne peut être chargée car elle présente un excès de "+ tonnageEnExces);
        this.tonnageEnExces = tonnageEnExces;
       
    }


    
}
