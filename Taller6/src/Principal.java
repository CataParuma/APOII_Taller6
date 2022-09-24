import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Alumno[] al = new Alumno[2];
		int notaMayor = 0;

		for (int i = 0; i < 2; i++) {

			System.out.println("Ingrese el nombre:");
			String nombre = sc.next();

			System.out.println("Ingrese el apellido:");
			String apellido = sc.next();

			System.out.println("Ingrese su nota final:");
			double notaFinal = sc.nextDouble();

			al[i] = new Alumno(nombre, apellido, notaFinal);
		}

		for (int i = 0; i < al.length; i++) {
			if (al[i].getNotaFinal() > al[notaMayor].getNotaFinal()) {
				notaMayor = i;
			}
		}

		System.out.println(al[notaMayor].getNombre() + " " + al[notaMayor].getApellido() + " con "
				+ al[notaMayor].getNotaFinal() + " es el estudiante con la nota mas alta");

	}
}
