/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class ARRAY {


public static int SumaArray(int[]array){
int res=0;
    for(int i=0; i<7; i++){
    res=(res+array[i]);
}
return res; 
}

public static boolean ComparaArrays(int[]a,int[]b){
        boolean aux=true;
    for(int i=0;i<a.length;i++){
    if(a[i]!=b[i]){
       aux=false; }                         
                                }
    return aux;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        // TODO code application logic here
   /* int [] numeros={5,3,2,1,7};
     char [] letras={'a','b','c','d','e'};
     int []array2=new int[5];

int [] tabla= new int[4];
//Rellenar con texto
for(int i=0; i<4; i++){
    System.out.println("Introduce el texto");
    tabla[i]=sc.nextInt();
}
//mostrar el texto
    for(int i=0; i<4; i++){
    System.out.print(tabla[i]+" ");
}
    
   // EL EJERCICIO VA DE HACER UNA ARRAY DE 7 HUECOS CUYOS VALORES SERÁN INTRODUCIDOS POR EL USUARIO, 
   //LUEGO SE MOSTRARÁ POR PANTALLA LA SUMA DEL OS 7 VALORES
   //Array 7 huecos
   int [] tabla= new int[7];
   int suma=0;
//Rellenar con texto
for(int i=0; i<8; i++){
    System.out.println("Introduce el texto");
    tabla[i]=sc.nextInt();
}

        System.out.println(SumaArray(tabla));

   
   
   int tamaño;
        System.out.println("Introduce el tamaño de la tabla");
        tamaño=sc.nextInt();
   int [] tabla= new int[tamaño];
 for(int i=0; i<tamaño; i++){
        System.out.println("Introduce el valor");
         tabla[i]=sc.nextInt();
    }
 for(int i=tamaño-1; i>=0; i--){
   
        System.out.println(tabla[i]);
        }
 
 
   int [] numeros={5,3,2,1,7};
   
   int size=numeros.length;
   
        System.out.println(size);
 

   
   
   int []a={3,2,7};
   int []b=new int[3];
   b=a;
   a=null;
        System.out.println(b[0]);
        
        
   
   int numero1 = (int)(Math.random()*10);
   int numero2 = (int)(Math.random()*10);
   int numero3 = (int)(Math.random()*10);
   int [] clave={(numero1),(numero2),(numero3)};
   int [] usuario= new int[3];
        System.out.println(Arrays.toString(clave));
   for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la clave");
            usuario[i] = sc.nextInt();
   }
       while(!Arrays.equals(clave, usuario)){
           System.out.println("Clave Incorrecta vuelva a intentarlo");
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la clave");
            usuario[i] = sc.nextInt();
   }
   }
        System.out.println("Su clave es correcta");   
        
        */
   
int []array1={3,2,7};
int tamaño;
        System.out.println("Introduce el tamaño de la tabla");
        tamaño=sc.nextInt();
int [] tabla= new int[tamaño];

   while(tamaño>3){
        System.out.println("El tamaño no es correcto, debe ser menor de 4");
 System.out.println("Introduce el tamaño de la tabla");
        tamaño=sc.nextInt();
      }
   
   
      for(int i=0; i<tabla.length; i++){
    System.out.println("Introduce el valor de la celda");
    tabla[i]=sc.nextInt();  
      } 
      
        System.out.println(Arrays.toString(tabla));
        
        
        System.out.println(ComparaArrays(tabla,array1));
      
       
}  
}


