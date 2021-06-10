import java.util.*;
import javax.swing.JOptionPane;


public class ejercicio5{

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int opcion = 0;
		boolean condicion = true;

		int cantpersonas = 0;
		String personaNombre [] = new String [cantpersonas];
		int personaEdad [] = new int [cantpersonas];
		String personaSexo [] = new String [cantpersonas];

		while (condicion) {
			System.out.println("-----------MENU-----------");
			System.out.println("[1] ingresar personas");
			System.out.println("[2] indicar cantidad de personas que tienen X años");
			System.out.println("[3] indicar cantidad de mujeres y hombres.");
			System.out.println("[4] mostrar personas");
			System.out.println("[0] salir");
			System.out.println("------------------------------------------");
			System.out.println("opcion: ");
			opcion = tec.nextInt();

			switch (opcion) {
				case 1:
				System.out.println("-- opcion 1 --");
				System.out.print("cantidad de personas a ingresar: ");
				cantpersonas = tec.nextInt();
				tec.nextLine();

				personaNombre = new String [cantpersonas];
				personaEdad = new int [cantpersonas];
				personaSexo = new String [cantpersonas];

				for (int i = 0; i < cantpersonas; i++) {
					System.out.println("--> persona " + (i+1));
					System.out.print("nombre: ");
					personaNombre[i] = tec.nextLine();
					System.out.print("Edad: ");
					personaEdad [i] = tec.nextInt();
					tec.nextLine();
					System.out.print("Sexo(M/F): ");
					personaSexo[i] = tec.nextLine();
				}
				break;

				case 2:
				System.out.println("-- opcion 2 --");
				int cont = 0;
				System.out.println("ingrese la edad: ");
				int edadX = tec.nextInt();
				for (int i = 0; i < cantpersonas; i++) {
					if (edadX == personaEdad[i]) {
						cont = cont +1;
					}
				}
				System.out.println("cantidad de personas con " + edadX + " años: " + cont);
				break;

				case 3:
				System.out.println("-- opcion 3 --");
				int contM = 0;
				int contF= 0;
				for (int i = 0; i < cantpersonas; i++) {
					if (personaSexo[i].equals("M")) {
						contM = contM + 1;
					}else{
						contF = contF +1;
					}
				}
				System.out.println("Hombres: " + contM);
				System.out.println("Mujeres: " + contF);
				break;

				case 4:
				System.out.println("-- opcion 4 --");
				for (int i= 0; i < cantpersonas; i++) {
					System.out.println("--> persona " + (i+1));
					System.out.println("nombre: " + personaNombre[i]);
					System.out.println("Edad: " + personaEdad[i]);
					System.out.println("Sexo: " + personaSexo[i]);
				}
				case 0:
				condicion = false;
				System.out.println("-- saliste !! --");
				break;

				default:
				System.out.println("-- opcion no encontrada --");

			}


		}
	}
}