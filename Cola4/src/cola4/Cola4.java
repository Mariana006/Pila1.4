//Cola 1.4 Abecedario Sin Repetir Elementos
package cola4;
import java.util.Scanner;
public class Cola4 { 
    //Declaramos el vector 
    char Vabc[]=new char [26];
    char tope=26,letra='A',aux;
   char j=0;
    public void Llenar(){
    
        Vabc[j]=(char)(Math.random()*tope+letra);
for( j=1; j<tope; j++){
    Vabc[j]=(char)(Math.random()*tope+ letra );
for(int k=0; k<j; k++){
    if(Vabc [j]==Vabc[k]){
        j--;
    }
}
}
    }
    public void Mostrar(){
if(tope>0){
    for(int i=0; i<tope; i++){
        System.out.print(Vabc[i]+" ");
    }    
}
else{
   System.out.print("----- La Cola Esta Vacia -----");
            }
}
    public void Agregar(char dato){
      if (tope <26){                
            Vabc[tope]=dato;           
  tope++; 
          System.out.println("----- Elemento Agregado -----");   }                    
         else{
             System.out.println("----- Cola llena -----");               
      }  
    }
     public void Ordenar(){
       
    for(int i=0; i<tope-1; i++){
//Declaramos el for aninado este va ordenar los elementos
        for(int j=0; j<tope-1; j++){
//Declaramos condicionador if , si numero actual es menor que numero siguente estos se intercambian 
            if (Vabc[j]>Vabc[j+1]){
//Con la ayua de la variable "aux" podremos intercambiar los valores de los elementos 
 //aux es igual al numero actual
         aux=Vabc[j];
//Agregamos el valor actual al valor numero siguiente 
         Vabc[j]=Vabc[j+1];
//El numero siguientes vatener el numero siguiente          
         Vabc[j+1]=aux;
            } 
        }  
    }
    //imprimimos el arreglo de forma ordenada (crecientemente) con un ciclo for
      for(int i=0; i<tope; i++){
      System.out.print(" "+Vabc[i]);
      }    
    }
    public void EliminarCola(){
        //Declaramos una variable temporal
     if(tope>0){
        int d=1;
        System.out.println("-----  Dato Eliminado "+" "+ Vabc[d-1]+" -----");
    tope--;
     for(int i=0;i<tope; i++){
    Vabc[i]=Vabc[d];
    d++;
    }
     }
     else{
             System.out.print("---- No hay Elementos A Eliminar -----");
             }
}   
    public static void main(String[]args){
        Cola4 cola =new Cola4();
        Scanner entrada =new Scanner(System.in);
      int opc;
      //"do" nos permite repetir el menu es un cliclo de repetición 
     System.out.print("----- Abecedario Aleatorio Sin Repetir Elementos -----\n");
      do{
            //Munu 
         System.out.print("\n1. - Agregar\n"
                  + "2. - Llenar\n"
                  + "3. - Mostrar\n"
                  + "4. - Eliminar\n"
                  + "5. - Ordenar\n"
                  + "6. - Salir\n");

          switch(opc=entrada.nextInt()){
              //Agregar Dato
              case 1:
                   //Solicitamos al usuario que dijite su dato 
                  System.out.println("Ingresa el Dato:\n");
                  char dato=entrada.next().charAt(0);
                 cola.Agregar(dato);
                  break;
                //Llenar  
              case 2: 
                  cola.Llenar();
                  break;
                  //Mostrar
              case 3:
                  cola.Mostrar();
                  break;
              case 4:
                  cola.EliminarCola();
                  break;    
              case 5:
                  cola.Ordenar();
                  break;            
          }
      }
      while (opc != 6);
    }  
    
}
