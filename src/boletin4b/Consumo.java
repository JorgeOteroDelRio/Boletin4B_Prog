/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4b;

/**
 *
 * @author joterodelrio
 */
public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    //Constructores
    public Consumo(){}
    public Consumo(float km,float litros,float vMed,float pGas){
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }
    
    //Metodos
    public float getTempo(){
        return km / vMed;
    }
    
    public float consumoMedio(){
        return (litros * 100) / km;
    }
    
    public float consumoEuros(){
        return (litros / km) * pGas;
    }
    
    public void setKms(float km){
        this.km = km;
    }
    
    public void setlitros(float litros){
        this.litros = litros;
    }
    
    public void setvMed(float vMed){
        this.vMed = vMed;
    }
    
    public void setPGas(float pGas){
        this.pGas = pGas;
    }
    
    public float getVMed(){
        return vMed;
    }
    
}
