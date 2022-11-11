package com.mycompany.ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
        Ejercicio5(); 
    }
    
    public static void Ejercicio1(){
         
       Scanner sp = new Scanner(System.in);
       System.out.println("INGRESE SU PRIMER NUMERO ENTERO");
       int n1 = sp.nextInt();
       System.out.println("INGRESE SU SEGUNDO NUMERO ENTERO");
       int n2 = sp.nextInt();
       System.out.println("Su primer numero es: " + n1 + " " + "y su segundo numero es: " + n2); 
       System.out.println("");  
   }
   
   public static void Ejercicio2(){
   
       Scanner sp = new Scanner(System.in);
       System.out.println("INGRESE SU NOMBRE");
       String nombre = sp.nextLine();
       System.out.println("Buenos Dias " + nombre);
       System.out.println("");   
   }
   
    public static void Ejercicio3(){
   
       Scanner sp = new Scanner(System.in);
       System.out.println("INGRESE UN NUMERO ENTERO");
       int n3 = sp.nextInt();
       System.out.println("EL doble del numero es: " + (n3*2));
       System.out.println("El triple del numero es: " + (n3*3));
       System.out.println("");   
   }
      
    public static void Ejercicio4(){
   
       Scanner sp = new Scanner(System.in);
       System.out.println("INGRESE SU TEMPERATURA EN GRADOS CENTIGRADOS");
       float temperatura = 32 + (9*(sp.nextFloat()/5));
       System.out.println("La nueva temperatura en grados Fahrenheit es : " + temperatura);
       System.out.println("");
   }
    
    public static void Ejercicio5(){
   
       Scanner sp = new Scanner(System.in);
       System.out.println("INGRESE EL RADIO DE SU CIRCUNFERENCIA");
       float radio = sp.nextFloat();
       System.out.println("El area de la circunferencia es : " + (Math.PI*Math.pow(radio, 2)));
       System.out.println("La longuitud de circunferencia es : " + (2*Math.PI*radio));
       System.out.println("");
   }
}
