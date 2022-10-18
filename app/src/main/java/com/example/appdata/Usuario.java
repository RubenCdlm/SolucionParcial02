package com.example.appdata;

import android.widget.EditText;

import java.io.Serializable;

public class Usuario implements Serializable {

    public int bmw1;
    public int ferrari1;
    public int Mazda1;
    public int Volvo1;


    public Usuario(int bmw1,int ferrari1,int Mazda1,int Volvo1){
        this.bmw1 = bmw1;
        this.ferrari1 = ferrari1;
        this.Mazda1 = Mazda1;
        this.Volvo1 = Volvo1;

    }

    public Usuario(){

    }
    public int getbmw1() {return bmw1;}
    public void setbmw1( int bmw1) {this.bmw1 = bmw1;}

    public int getferrari1() {return ferrari1;}
    public void setferrari1( int ferrari1) {this.ferrari1 = ferrari1;}

    public int getMazda1() {return Mazda1;}
    public void setMazda1( int Mazda1) {this.Mazda1 = Mazda1;}

    public int getVolvo1() {return Volvo1;}
    public void setVolvo1( int Volvo1) {this.Volvo1 = Volvo1;}


}
