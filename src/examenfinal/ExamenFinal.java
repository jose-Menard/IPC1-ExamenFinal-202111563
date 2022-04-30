package examenfinal;
import java.util.Scanner;

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


            System.out.println();
            System.out.println("-----Introduzca una opción------");
            opcion = sn.nextInt();

            switch(opcion) {
                case 1:
                    Scanner entrada = new Scanner (System.in);
                                      
                    System.out.println();
 
           
                    
                    System.out.println("---Problema 1---");
                    System.out.println();
                    System.out.println("favor ingresar un número");
                    a = entrada.nextInt();
                    
                    System.out.println("favor ingresar otro número");
                    b = entrada.nextInt();
                    
                    if(a>b){
                    System.out.println("el número mayor es: " +a);
                    }else{
                    System.out.println("el número mayor es: " +b);
                    }
                    
                    System.out.println();

                            break;


                case 2:
                                   
                    System.out.println();

           
                    
                    System.out.println("---Problema 2---");
                    System.out.println();
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
                    System.out.println();



                    break;
                    
                    case 3:
                        
                    System.out.println();
 
               
                    System.out.println("---Problema 3---");
                    System.out.println();
                     int vacas[]=new int[8];
                     int vacas2[]=new int[8];
                     int peso[]=new int[8];
                     int leche[]=new int[8];
                     int lecheTotal;
                     int vacasBuenas[]=new int[8];
                     
                     
                     leche[0]=30;
                     leche[1]=34;
                     leche[2]=28;
                     leche[3]=45;
                     leche[4]=31;
                     leche[5]=50;
                     leche[6]=29;
                     leche[7]=1;
                     
                       for (int r=0; r<vacas.length; r++){
                        vacas[r]=leche[r]; 
                        }
                       
                     peso[0]=223;
                     peso[1]=243;
                     peso[2]=100;
                     peso[3]=200;
                     peso[4]=200;
                     peso[5]=155;
                     peso[6]=300;
                     peso[7]=150;
                     
                      for (int r=0; r<vacas2.length; r++){
                        vacas2[r]=peso[r]; 
                        }
                      
                      for (int r=0; r<vacas2.length; r++){
                          if(vacas[r]>28 && vacas2[r]>=200){
                              vacasBuenas[r]=vacas[r];
                      }    
                        }
                      
                      lecheTotal=vacasBuenas[0]+vacasBuenas[1]+vacasBuenas[2]+vacasBuenas[3]+vacasBuenas[4]+vacasBuenas[5];
                      
                      System.out.println("Las Vaquitas menos pesadas producirán: " +lecheTotal+" litros de leche");

                        System.out.println();
                        System.out.println("Una disculpa, esto es lo que logré hacer con el tiempo que tenía :(");
                        System.out.println();
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

