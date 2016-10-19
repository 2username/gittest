
public class Main {

    public static void main(String[] args) {


        int[][] mas = new int[5][8];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = (int) (-99 + (Math.random() * (99 - (-99))));
                System.out.print(" " + mas[i][j]);
            }
        }
        int max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas [i][j] > max){
                    max = mas [i][j];
                }

            }
        }
        System.out.println();
        System.out.println("Max: " + max);
    }
    }

//                int max = mas [0] [0];
//                if (max < mas[i][j])
//                        max = mas[i][j];
//
//                System.out.println("\n Maximum = " + max);
//                }







//        int[] []  mas = new int[10][];
//
////        for (int i = 0; i < mas.length; i++){
////            mas[i] = new int[10];
////        }
//        for (int i = 0; i < mas.length; i++){
//            System.out.println();
//            for (int j = 0; j < mas.length; j++){
//                mas [i] [j] = (int) (Math.random() * 100);
//                System.out.print(mas[i][j] + "  ");
//            }
//            System.out.println();
//
//        }
//        int summ = 0;
//        for (int i = 0; i < mas.length; i++ ) {
//            for (int j = 0; j < mas.length; j++) {
//                if (mas[i][j] % 2 != 0) System.out.print(mas[i][j] + "  ");
//                }
//            }
//        System.out.println();
//        }
//




