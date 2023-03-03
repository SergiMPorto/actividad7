package principales;

import java.util.Scanner;

public class GestionClientes {

	public static void main(String[] args) {
		 int opcion =0;

			do {
			opcion = pintarMenu();
			switch (opcion) {
			case 1:
				System.out.println("ALTA DEL CLIENTE ");
				
				break;
			case 2:
			    System.out.println("BUSCAR UN CLIENTE ");
				
				break;
			case 3:
				System.out.println("  MOSTRAR TODOS");
				
				break;
			case 4:
				System.out.println("ELIMINAR UN CLIENTE  ");
				break;
			case 5:
				
			}
			
			}while(opcion != 5);
			
			System.out.println(" === FIN DE PROGRAMA === ");
			}
		
	
		public static int pintarMenu() {
			Scanner leer = new Scanner(System.in);
			int opcion=0;
			System.out.println("           ******MENU******             ");
			System.out.println("           ----------------             ");
			System.out.println("  1.       ALTA DEL CLIENTE             ");
			System.out.println("  2.       BUSCAR UN CLIENTE            ");
			System.out.println("  3.        MOSTRAR TODOS               ");
			System.out.println("  4.      ELIMINAR UN CLIENTE           ");
			System.out.println("  5             SALIR                   ");
			System.out.println(" PULSA UNA OPCION DE 1 A 4 PARA REALIZAR LA OPERACION O PULSA 5 PARA CERRAR EL PROCESO.");
			opcion=leer.nextInt();
	     	while (opcion <1 || opcion >5 ) {
				System.out.println("PULAS UNA OPCION  DE 1 A 4");
				opcion=leer.nextInt();
				}
			return opcion;
			}	
			
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
