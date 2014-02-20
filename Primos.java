import java.util.Scanner;
public class Primos {
Scanner leer= new Scanner (System.in);
int num=0,b=0,pri=0;
    public void inicio(){
        System.out.println("ingrese un numero ");
        num=leer.nextInt();
        System.out.println("los numeros primos son");
         for(int i=1;i<num+1;i++){
         b=0;
             for(int j=1;j<num+1;j++){
       pri=i%j;
         if(pri==0){
             b=b+1;
         }
      
         }
             if(b==2){
                 
             System.out.println(i);
             }
         }
    
    
    }
    public static void main(String[] args) {
    Primos in=new Primos();
    in.inicio();
    }
}
