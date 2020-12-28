import java.util.Random;
import java.util.Scanner;

        class Main {
            public static final int  SIZE = 3;
            public static void main(String[] args) {
                int degrees = 0;
                int[][] colors = new int [SIZE][SIZE];
                int[][]rotatedColors = new int [SIZE][SIZE];
                Random random = new Random();
                for(int i = 0; i < SIZE; i++){
                    for(int j = 0; j < SIZE; j++ ){
                        colors[i][j] = random.nextInt(256);
                    }
                }
                for (int i= 0; i < SIZE; i++){
                    for(int j = 0; j < SIZE;j++ ){
                        System.out.format("%4d", colors[i][j]);
                    }
                    System.out.println();
                }
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("\nВведи на сколько градусов хочешь повернуть матрицу 90/180/ 270");
                    String input = scanner.nextLine();
                    int x = Integer.parseInt(input);
                    switch(x){
                        case 90: degrees = 1;
                            break;
                        case 180: degrees = 2;
                            break;
                        case 270 : degrees = 3;
                            break;
                        default :
                            System.out.println("\nЗадано неверное значение угла поворота, повторите ввод ");
                            continue;
                    }
                    break;
                }
                System.out.println(degrees);
                System.out.println("\n\n");
                rotatedColors = turnTable(colors, rotatedColors, degrees );
                for (int i= 0; i < SIZE; i++){
                    for(int j = 0; j < SIZE;j++ ){
                        System.out.format("%4d", rotatedColors[i][j]);
                    }
                    System.out.println();
                }
            }
            public static int [][] turnTable(int[][] colors,int[][] rotatedColors, int degrees ){
                int y  = 1;
                while (y <= degrees) {
                    for(int i = 0; i < SIZE; i++){
                        for(int j = 0; j < SIZE; j++ ){
                            rotatedColors[i][j] = colors[j][SIZE - i - 1] ;
                        }
                    }
                    y++;
                    for(int a = 0; a < SIZE; a++) {
                        for(int b = 0; b < SIZE; b++ ){
                            colors[a][b] = rotatedColors[a][b] ;
                        }
                    }
                }
                return rotatedColors;}}






