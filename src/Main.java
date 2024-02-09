import java.util.Arrays;

public class Main {
    public static void main(String[] args) {




        Rectángulo[] rectangulos = new Rectángulo[10];
       rectangulos[0] = new Rectángulo(4, 5, 2);
        rectangulos[1] = new Rectángulo(4, 3, 7);
        rectangulos[2] = new Rectángulo(4, 6, 4);
        rectangulos[3] = new Rectángulo(4, 2, 9);
        rectangulos[4] = new Rectángulo(4, 8, 1);
        rectangulos[5] = new Rectángulo(4, 5, 5);
        rectangulos[6] = new Rectángulo(4, 4, 6);
        rectangulos[7] = new Rectángulo(4, 1, 8);
        rectangulos[8] = new Rectángulo(4, 7, 3);
        rectangulos[9] = new Rectángulo(4, 9, 2);



       for(int contaor=0; contaor <= 9; contaor++){
            System.out.println(rectangulos[contaor].toString());
        }

        System.out.println("                                                         ");

        Arrays.sort(rectangulos);

        for(int contaor=0; contaor <= 9; contaor++){
            System.out.println(rectangulos[contaor].toString());
        }

    }
}
