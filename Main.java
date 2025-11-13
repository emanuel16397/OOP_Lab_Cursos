import models.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de cursos a registrar: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        Course[] cursos = new Course[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nCurso #" + (i + 1));

            System.out.print("Tipo (Online / OnSite): ");
            String tipo = sc.nextLine().trim();

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Duración (hs): ");
            int duracion = Integer.parseInt(sc.nextLine());

            System.out.print("Profesor (opcional): ");
            String profesor = sc.nextLine();

            if (tipo.equalsIgnoreCase("Online")) {
                System.out.print("Plataforma: ");
                String plataforma = sc.nextLine();

                if (profesor.isBlank())
                    cursos[i] = new OnlineCourse(titulo, duracion, plataforma);
                else
                    cursos[i] = new OnlineCourse(titulo, duracion, profesor, plataforma);

            } else if (tipo.equalsIgnoreCase("OnSite")) {
                System.out.print("Aula: ");
                String aula = sc.nextLine();

                System.out.print("Cupo máximo: ");
                int cupo = Integer.parseInt(sc.nextLine());

                if (profesor.isBlank())
                    cursos[i] = new OnSiteCourse(titulo, duracion, aula, cupo);
                else
                    cursos[i] = new OnSiteCourse(titulo, duracion, profesor, aula, cupo);
            } else {
                System.out.println("⚠️ Tipo no válido, se omitirá este curso.");
            }
        }

        System.out.println("\n=== Información de cursos registrados ===");
        for (Course c : cursos) {
            if (c != null)
                c.showInformation();
        }

        sc.close();
    }
}
