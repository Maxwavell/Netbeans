/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
//Habilitación de input via usuario
    import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class JavaApplication3 {
    
   
    public static int potencia(int base, int exponente){
    int res=1;
    for(int i=1;i<exponente;i++){
        res=res*base;
        
    }
    return res;
    }
    
    public static int factorial(int numero){
    int res=1;
    for(int i=numero;i>0;i--){
        res=res*i;
    }
    
    return res;
    }
       
                
    
  
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner sc=new Scanner(System.in);
       /*
               
        float a=5f;
         float b=2f;
         float suma=a/b;
        //de farenheit a celsius
         float celsius=40f;
         float farenheit=(celsius*1.8f+32);
        //Datos Alfanuméricos
         char letra='a';
         char letra2='b';
        //Variables booleanas 
         boolean respuesta;
         boolean booleano1=true;
         boolean booleano0=false;
         respuesta=(booleano1||booleano0);
        //operadores relacionales
         int num1= 5;
         int num2= 8;
         char letrita1='a';
         char letrita2='a';
        //castings
         double num=8.3;
         int resul= (int)num;
         char let='a';
         int result= let;
        
         
        // PRUEBA PAR IMPAR
       System.out.println("Introduce un número");
         int parimpar= sc.nextInt();
         if(parimpar%2==0){
             System.out.println("su numero es par");
   
         }
         else{
             System.out.println("su número es impar ");
             

        System.out.println("¿Quieres Jugar? 1Sí 2NO");
         int respuesta= sc.nextInt();
         if(respuesta==1){ 
             System.out.println("JUEGO IRÍA AQUÍ");
         }
         else{
             System.out.println("NO QUIERES JUGAR :(");
           
    // EJERCICIO DE ORDENAR NUMEROS INCOMPLETO
    int num1=3;
    int num2=3;
       if(num1>num2){
           System.out.println(num1+" es mayor que "+num2);
        }
       else{if(num2>num1){
           System.out.println(num2+" es mayor que "+num1);}
       }
       if(num1==num2){
           System.out.println("los numeros introducidos son iguales :)");}
      
    System.out.println("¿Quieres Jugar? 1 YES 2 NO");
   int respuesta= sc.nextInt();
        
    if(respuesta==1){
      
        
// Preguntar variables
        System.out.println("¿Tiene Bigote?");
            boolean bigote= sc.nextBoolean();
        System.out.println("¿Tiene Gafas?");
            boolean gafas= sc.nextBoolean();
        System.out.println("¿Tiene Gorro?");
            boolean gorro= sc.nextBoolean();
        System.out.println("¿Tiene perilla?");
            boolean perilla= sc.nextBoolean();
        System.out.println("¿Tiene Pelo");
             boolean pelo= sc.nextBoolean();
        System.out.println("¿Tiene Barba?");
             boolean barba= sc.nextBoolean();
        
                //lupas
                if(gafas && !bigote && !gorro && !barba && !perilla && !pelo){
                    System.out.println("Lucas");}
                //Mónico
                else if(!gafas && !bigote && !gorro && !barba && !perilla && pelo){
                    System.out.println("Mónico");}
                //Nike
                else if(!gafas && bigote && !gorro && !barba && !perilla && !pelo){
                    System.out.println("Nike");}
                //Kiko
                else if(!gafas && !bigote && gorro && !barba && !perilla && pelo){
                    System.out.println("Kiko");}
                //Medinilla
                else if(!gafas && bigote && !gorro && barba && perilla && !pelo){
                    System.out.println("Medinilla");}
                //Alejandro
                else if(!gafas && !bigote && gorro && !barba && perilla && !pelo){
                    System.out.println("Alejandro");}
                else{
                    System.out.println("No existe el personaje");} 
    }
    else{
        System.out.println("Bueno pues nada :( ");}
    
    
       System.out.println("Introduce la nota");
   int nota= sc.nextInt();
   
   if(nota<11 || nota<0){
       if(nota<5){
           System.out.println("Insuficiente");}
       else if(nota==5){
           System.out.println("Aprobado");}
       else if(nota==6){
           System.out.println("Bien");}
       else if(nota<9){
           System.out.println("Notable");}
       else if(nota>9){
           System.out.println("Sobresaliente");}
   }
   else{
       System.out.println("su número no es correcto");} 
    
    
       int nota;
       System.out.println("mete un numero");
       nota=sc.nextInt();
        
       switch (nota){
           case 0:
               System.out.println("tiene un cero");
               break;
           case 1:
               System.out.println("tienes un uno");
               break;
           case 2:
               System.out.println("tienes un dos");
               break;
           default:
               System.out.println("no es ninguno");
                
       
       int dia;
       
        System.out.println("mete un número del 1 al 7");
         dia=sc.nextInt();
        
        
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No ha introducido bien el número");
                break;
       
        }

       int nota;
       
        System.out.println("mete un número del 1 al 10");
         nota=sc.nextInt();
         switch (nota){
             case 0,1,2,3,4: 
                 System.out.println("Insuficiente");
                 break;
             case 5:
                 System.out.println("Aprobado");
                 break;
             case 6:
                 System.out.println("Bien");
                 break;
             case 7,8:
                 System.out.println("Notable");
                 break;
             case 9,10:
                 System.out.println("Sobresaliente");
                 break;
             default:
                 System.out.println("Numero incorrecto");
         
         
         char nota;
       
        System.out.prinota=sc.next().charAt(0)ntln("¿Qué día es? l,m,x,j,v,s,d");
         ;
         switch (nota){
             case 'l','L' :
                 System.out.println("Lunes");
                 break;
             case 'm','M':
                 System.out.println("Martes");
                 break;
             case 'x','X':
                 System.out.println("Miercoles");
                 break;
             case 'j','J':
                 System.out.println("Jueves");
                 break;
             case 'v','V' :
                 System.out.println("Viernes");
                 break;
             case 's','S' :
                 System.out.println("Sábado");
                 break;
             case 'd','D':
                 System.out.println("Domingo");
                 break;
             default:
                 System.out.println("Letra Incorrecta");
                 break;
                 }
         
         
       //while
       int a=3;
       while(a<5){
           System.out.println("hola");
       a ++; }
      
       int numero;
       while (1<5){
       System.out.println("mete un número");
         numero=sc.nextInt();
         if(numero!=0){
          if(numero%2==0){
              System.out.println("par");}   
         
         else{System.out.println("impar");}
          }
         else{break;}
         }
       
       secreto=sc.nextInt();
       //Generador random del 1 al 100
       int secreto=((int)(Math.random()*101));
        System.out.println(secreto);
        
       
       //do while
       int a=0;
       do {
           System.out.println("hola");
           a++;
                   }
       while (a<3);
       
   
       
      int numero;
      
       int usuario1;
        System.out.println("Introduce inicio del rango");
            usuario1=sc.nextInt();  
       int usuario2;
        System.out.println("Introduce final del rango");
            usuario2=sc.nextInt(); 
         do{    
           System.out.println("introduce un numero");
            numero=sc.nextInt();
           System.out.println("su numero no es correcto");
       } while(numero>usuario2||numero<usuario1);
       
          
           
            int numero;
            int a=1;
            do{
            System.out.println("Mete un numero del 1 al 10");
            numero=sc.nextInt();
            }
        while(!(numero>0&&numero<11));
            
                while(a<11){
                System.out.println((numero)*(a));
                a++; 
                }
       
    
            
       //for
       for(int i=1;i<11;i++){
        System.out.println("hola");

       int a=1;
    for(int numero=1;numero<20;numero++)
   
    {
        numero++;
        System.out.println((a)*(numero));
    
  
   }

   
    
       
  for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
          System.out.print("2");
      
      }
      System.out.println("");
  }
         
   
      int cont=0; 
  for(int i=0;i<3;i++){
      
      for(int j=0;j<3;j++){
          cont++;
          System.out.print(cont);
      
      }
      System.out.println("");
      cont=0;
  }
 
    for(int i=0;i<4;i++)
    {
    for(int j=3;j>i;j--)
    {System.out.print("*");
    
    }
        System.out.println("*");
    }
}
}
  int base,exponente;
System.out.println("Introduce la base");
base=sc.nextInt();
System.out.println("Introduce el exponente");
exponente=sc.nextInt();
        
        System.out.println(potencia(base,exponente));
      
       
       
       int factor;
        System.out.println("Introduce el numero a factorizar");
        factor=sc.nextInt();
        
        System.out.println(factorial(factor));

 */
   
       for(int i=0;i<4;i++){
           if(i==2){
               break;
       }
      
        System.out.println(("i"+i));
        
         }
    }
}
      
       