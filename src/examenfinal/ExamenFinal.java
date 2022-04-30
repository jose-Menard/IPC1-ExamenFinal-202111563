
package examenfinal;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jose Pablo
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        int a;
        int b;
        while(!salir){

            System.out.println("1. Problema 1");
            System.out.println("2. Problema 2");
            System.out.println("3. Problema 3");
            System.out.println("4. Salir");



            System.out.println("Introduzca una opción");
            opcion = sn.nextInt();

            switch(opcion) {
                case 1:
                    Scanner entrada = new Scanner (System.in);
                                      
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
           
                    
                    System.out.println("Problema 1");
                    
                    System.out.println("favor ingresar un número");
                    a = entrada.nextInt();
                    
                    System.out.println("favor ingresar otro número");
                    b = entrada.nextInt();
                    
                    if(a>b){
                    System.out.println("el número mayor es: " +a);
                    }else{
                    System.out.println("el número mayor es: " +b);
                    }
                    
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
           
                            break;


                case 2:
                                   
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
           
                    
                    System.out.println("Problema 2");
                    int filas;
                    Scanner abajo=new Scanner (System.in);
                    System.out.println("Favor ingresar la cantidad de asteríscos inferiores (IMPAR)");
                    filas=abajo.nextInt();
             
                    
                                       
                    if(filas % 2== 0){
                    System.out.println("debe ingresar un número impar, vuelvalo a intentar");            
                    }else{
                    System.out.println(); 
                    for (int i=0; i<filas; i++){
                        for (int e=filas-i; e>1; e--){
                            System.out.print(" ");      
                        }
                        for (int e=0; e<=i; e++){
                            System.out.print("* ");   
                        }
                        System.out.println();
                    }        
                    }
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");


                    break;
                    
                    case 3:
                        
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
               
                    System.out.println("Problema 3");


                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");


                    break;

                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("Las opciones son entre 1 y 4");

           System.out.println("");
           System.out.println("");
           System.out.println("");
           System.out.println("");
           System.out.println("");
            }
            }
            }
        }

