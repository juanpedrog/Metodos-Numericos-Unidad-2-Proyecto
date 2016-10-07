/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Pedro Gil
 */
public class Polinomio {
    float a0,a1,a2,a3;
    public void setAs(float a0p,float a1p,float a2p,float a3p){
        a0=a0p;
        a1=a1p;
        a2=a2p;
        a3=a3p;
    }
    public float[] getAs(){
        float[] arr=new float[4];
        arr[0]=a0;
        arr[1]=a1;
        arr[2]=a2;
        arr[3]=a3;
        return arr;
    }
    
}
