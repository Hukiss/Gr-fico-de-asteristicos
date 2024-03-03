import java.util.Scanner;

public class Grafic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nQuantidade de notas a serem enseridas: ");
        int quantideNotas = scanner.nextInt();

        int[] notasArray = new int[quantideNotas];
        int[] asteristicos = new int[11];

        for (int i = 0, contador = 0; i < quantideNotas; i++) {

            System.out.printf("%s%d: ","Nota ",++contador);
            int notas = scanner.nextInt();
            notasArray[i] = notas;

            switch (notas/10){
                case 0:
                    ++asteristicos[0]; break;
                case 1:
                    ++asteristicos[1]; break;
                case 2:
                    ++asteristicos[2]; break;
                case 3:
                    ++asteristicos[3]; break;
                case 4:
                    ++asteristicos[4]; break;
                case 5:
                    ++asteristicos[5]; break;
                case 6:
                    ++asteristicos[6]; break;
                case 7:
                    ++asteristicos[7]; break;
                case 8:
                    ++asteristicos[8]; break;
                case 9:
                    ++asteristicos[9]; break;
                case 10:
                    ++asteristicos[10]; break;
            }

        }

        for (int i = 0; i < 11; i++) {
            System.out.println();
            if (i == 10)
                System.out.printf("  %d: ", i*10);
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            for (int j = 0; j < asteristicos[i]; j++)
                System.out.print("*");

        }

    }

}
