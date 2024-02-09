import java.util.Arrays;

public class Main2 {
        public static void main(String[] args) {
            Estudiante[] estudiantes = {
                    new Estudiante("Patri", 12, 170),
                    new Estudiante("Manuel", 43, 173),
                    new Estudiante("Javier", 72, 189),
                    new Estudiante("Alicia", 52, 168),
                    new Estudiante("Alberto", 35, 189)
            };

            System.out.println("Estudiantes sin ordenar:");
            for (int i = 0; i < estudiantes.length; i++) {
                System.out.println((i + 1) + ". " + estudiantes[i]);
            }
            System.out.println(" ");
            System.out.println("Estudiantes ordenados:");
            Arrays.sort(estudiantes);
            for (int contador = 0; contador < estudiantes.length; contador++) {
                System.out.println((contador + 1) + ". " + estudiantes[contador]);
            }
        }
    }


