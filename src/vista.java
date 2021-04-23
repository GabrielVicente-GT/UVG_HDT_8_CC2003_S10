/***************************************************************
* vista.java
* Autor: Gabriel Alejandro Vicente Lorenzo
* Carné: 20498
* Universidad del Valle de Guatemala
***************************************************************/

import java.util.Scanner;

class vista{
	Scanner scan;
	
	public vista(){
		scan = new Scanner(System.in);
	}

    /***
     * presionar para continuar
     */
    public void press_enter(){
        System.out.println("Presione ENTER para el siguiente paciente...");
        scan.nextLine();
    }
	/***
	 * menu para elegir opcion
	 * @return numero seleccionado segun la opcion
	 */
	public int menu_opcion(){
		boolean verificador=false;
		int opcion=-1;
		do{
			System.out.println(" ---> Elija que implementacion");
			System.out.println("	1.  Priority Queue Java Collection ");
			System.out.println("	2.  Priority Queue con Heap");
			System.out.println("	3.  Salir");


			try{
			
				opcion = Integer.parseInt(scan.nextLine());

				
			}catch(Exception e){
				System.out.println("ese no es un numero entero");
			}
			
			if(opcion<1||opcion>3){
				System.out.println("esa no es una opcion\n");
			}else{
				verificador=true;
			}
		}while(verificador==false);
		
			return opcion;
	}

	
}