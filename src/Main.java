

import java.util.Scanner;
import java.io.*;
import java.util.PriorityQueue;
public class Main {
    public static  void main (String[] args){
        VectorHeap<Paciente> espera = new VectorHeap<Paciente>();
        PriorityQueue<Paciente> instancia_queue= new PriorityQueue<Paciente>();
        Scanner scan = new Scanner(System.in);
        Tools tuerca =  new Tools();
        vista view =  new vista();

        System.out.println("\n______________________-----------------------------------______________________");
        System.out.println("______________________--------- Orden Pacientes ------" +
                "" +
                "---______________________");
        System.out.println("______________________-----------------------------------______________________");
        System.out.println();

        System.out.println("Archivo a leer --> pacientes.txt");

        boolean ciclo = true;
        while (ciclo==true){
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
                    instancia_queue.add(paciente);

                }
            }catch(Exception e){
                System.out.println("archivo no encontrado");
            }

            int opcion = view.menu_opcion();

            if(opcion==1){
                int turno = 1;
                System.out.println("\nPriority Queue Java Collection Frameworks\n");
                while (!instancia_queue.isEmpty()){
                    System.out.println("Dequed "+turno+"-->"+instancia_queue.remove());
                    view.press_enter();
                    turno++;
                }
            }else if(opcion==2){
                int turno = 1;
                System.out.println("\nPriority Queue con Heap\n");
                while (!espera.isEmpty()){
                    System.out.println("Dequed "+turno+"-->"+espera.remove());
                    turno++;
                }
            }else if (opcion==3){
                ciclo=false;
            }
        }




    }
}
