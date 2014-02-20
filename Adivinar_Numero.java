import java.util.Scanner;
import java.lang.Math;
public class Adivinar_Numero {
int a=0,al=0,num=0;
Scanner leer= new Scanner (System.in);

    
    public void inicio(){
       al =(int) (Math.random()*100+1) ;
        do{
        System.out.println("Ingrese un numero a adivinar");
        num=leer.nextInt();
        if(num==al){
        System.out.println("el numero es corecto");
        a=2;
         }else if(num <al){
             System.out.println("es muy bajo");
         
         }else{
         
          System.out.println("es muy alto");
         }
         System.out.println("Desea intentarlo de nuevo Si=1/No=2");
         a=leer.nextInt();
       }while(a!=2);
    
    }
    public static void main(String[] args) {
    Adivinar_Numero in= new Adivinar_Numero();
    in.inicio();
    }
}
