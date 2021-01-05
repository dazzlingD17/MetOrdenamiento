package metburbuja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alan
 */
public class MetBurbuja {

   
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int auxiliar,opc;
boolean x=true;
List <Integer> Numeros;
 Numeros = new ArrayList<>();
    Numeros.add(5); 
            Numeros.add(3);
            Numeros.add(1);
            Numeros.add(4);
            Numeros.add(2);
            
             while(x){
        System.out.println("--SELECCIONE UN METODO DE ORDENAMIENTO--");
        System.out.println("[1] METODO BURBUJA\n"
                         + "[2] METODO QUICKSORT \n" 
                         + "[3]SALIR");
        opc=leer.nextInt();
         switch (opc){
             case 1:
                 System.out.println("[----METODO BURBUJA----]");
    for (int i=0; i<(Numeros.size()-1); i++){
      for (int j=0; j<(Numeros.size()-1); j++){
          if (Numeros.get(j)>Numeros.get(j+1)){
              auxiliar=Numeros.get(j+1);
              Numeros.set(j+1, Numeros.get(j));
              Numeros.set(j,auxiliar);
          }
      }
        
    }
        System.out.println("LISTA ORDENADA");
        for (int i=0 ; i<Numeros.size(); i++){
             System.out.print("[" + Numeros.get(i) + "]\n");
        }
             break;
             
             case 2:
                 System.out.println("[----METODO QUICKSORT----]");
                 int primero=0, ultimo=Numeros.size()-1;
                 Quick(Numeros,primero,ultimo);
                 System.out.println("LISTA ORDENADA");
                 for (int i=0 ; i<Numeros.size(); i++){
                 System.out.print("[" + Numeros.get(i) + "]\n");
                 
                 }
             break;
             case 3:
                 x=false;
                 System.out.println("");
                 break;
                 
             default:
                 System.out.println("OPCION INCORRECTA");
                 
             
      
        
         }
            
             }
    
            
    //System.out.print(Lista.size());
}

    public static void Quick (List<Integer> Numeros, int primero, int ultimo){
        int pivote= Numeros.get(primero),auxiliar;
        int i=primero;
        int j=ultimo;
        while (i< j){
            while(Numeros.get(i)<= pivote && i<j)
                i++;
            while(Numeros.get(j) > pivote)
                j--;
            if(i<j){
                auxiliar=Numeros.get(i);
                Numeros.set(i,Numeros.get(j));
                Numeros.set(j, auxiliar);
            }
        }
        Numeros.set(primero,Numeros.get(j));
        Numeros.set(j, pivote);
        if (primero< j-1)Quick(Numeros,primero, j-1);
        if (j+1< ultimo) Quick(Numeros,j+1,ultimo);
}
}
