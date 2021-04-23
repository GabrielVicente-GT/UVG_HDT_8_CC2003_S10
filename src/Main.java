/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
import java.util.Scanner;
import java.io.*;
import java.util.PriorityQueue;
public class Main {
    public static  void main (String[] args){
        /***
         * instancias de VectorHeap, PriorityQUeue de JCF, Scanner, Tools y vista
         */
        VectorHeap<Paciente> espera = new VectorHeap<Paciente>();
        PriorityQueue<Paciente> instancia_queue= new PriorityQueue<Paciente>();
        Scanner scan = new Scanner(System.in);
        Tools tuerca =  new Tools();
        vista view =  new vista();

        view.titulo();

        /***
         * inicio del ciclo para el Main
         */
        boolean ciclo = true;
        while (ciclo==true){

            int opcion = view.menu_opcion();

            /***
             * Si el usuario elige la opcion 1 desea usar JCF en la Cola de Prioridad
             */
            if(opcion==1){
                /***
                 * Se lee el archivo y se agrega a la Cola de prioridad correspondiente
                 */
                try{
                    FileReader r = new FileReader("C:\\Users\\Gabriel Vicente\\Desktop\\HDT8\\src\\pacientes.txt");
                    BufferedReader buffer = new BufferedReader(r);

                    String temp ="";

                    while(temp!=null){
                        temp = buffer.readLine();
                        if(temp == null){
                            break;
                        }
                        String[] data = temp.split(", ");
                        Paciente paciente = new Paciente(data[0],data[1],tuerca.StringToNum(data[2]));
                        instancia_queue.add(paciente);

                    }
                }catch(Exception e){
                    System.out.println("archivo no encontrado");
                }
                int turno = 1;
                System.out.println("\nPriority Queue Java Collection Frameworks\n");
                while (!instancia_queue.isEmpty()){
                    System.out.println("Turno "+turno+" >>>"+instancia_queue.remove());
                    view.press_enter();
                    turno++;
                }
            //Implementacion con VectorHeap
            }else if(opcion==2){
                /**
                 * Lectura de archivo y agregar a Cola correspondiente
                 */
                try{
                    FileReader r = new FileReader("C:\\Users\\Gabriel Vicente\\Desktop\\HDT8\\src\\pacientes.txt");
                    BufferedReader buffer = new BufferedReader(r);

                    String temp ="";

                    while(temp!=null){
                        temp = buffer.readLine();
                        if(temp == null){
                            break;
                        }
                        String[] data = temp.split(", ");
                        Paciente paciente = new Paciente(data[0],data[1],tuerca.StringToNum(data[2]));
                        espera.add(paciente);

                    }
                }catch(Exception e){
                    System.out.println("archivo no encontrado");
                }
                int turno = 1;
                System.out.println("\nPriority Queue con Heap\n");
                while (!espera.isEmpty()){
                    System.out.println("Tuerno "+turno+" >>>"+espera.remove());
                    view.press_enter();
                    turno++;
                }
            }else if (opcion==3){
                /***
                 * Se termina el ciclo si el usuario lo desea.
                 */
                ciclo=false;
            }
        }




    }
}
