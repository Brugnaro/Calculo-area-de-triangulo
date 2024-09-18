/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.triangulo;

/**
 *
 * @author PC
 */
public class Area {
    public double lado1,lado2,lado3;


public Area (double lado1 , double lado2 , double lado3){
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;
}

public double calcularArea(){
    double area = (lado1 + lado2 + lado3) / 2;
    return area;
}

public String exibirClassificacao(){
if (lado1 == lado2 && lado2 == lado3){
return "Equilátero";
}
else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
 return "Isósceles";
}else if (lado1 * lado1 + lado2 * lado2 == lado3 * lado3 || 
          lado1 * lado1 + lado3 * lado3 == lado2 * lado2 || 
          lado2 * lado2 + lado3 * lado3 == lado1 * lado1) {
 return "Triângulo Retângulo";
}else {
return "Escaleno";
}
}

public double getLado1(){
return lado1;
}
public double getLado2(){
return lado2;
}
public double getLado3(){
return lado3;
}

}






