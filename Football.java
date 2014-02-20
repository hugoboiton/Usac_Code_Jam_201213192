
import java.util.Scanner;
import java.lang.Math;
public class Football {
double v=0,vx=0,vy=0,t=0,tv=0,x=0,ang=0;
double rad=0,pi=0;
double g=9.8;
Scanner leer= new Scanner (System.in);
 
    public void inicio(){
    pi=Math.PI;   
        System.out.println("ingrese la velosidad inicial");
        v=leer.nextInt();
        System.out.println("ingrese el angulo del disparo");
        ang=leer.nextInt();
        
        rad= ang* (pi/180);
        vx= (v*Math.cos(rad));
        vy=(v*Math.sin(rad));
        
        t=vy/g;
        tv=2*t;
        x= tv*vx;
        
        System.out.println("Resumen de calculos");
        System.out.println("Velociadad en y;" +vy+" m/s");
        System.out.println("Velociadad en x;" +vx+" m/s");
        System.out.println("Tiempo T;" +t+" s");
        System.out.println("Tiempo de vuelo;" +tv+" s");
        System.out.println("Distancia recorida" +x+ " m"); 
    
    }
    public static void main(String[] args) {
    Football in=new Football();
    in.inicio();
    }
}
