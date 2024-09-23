public class Main4 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        1
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------");

//      2
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(arr1[j][i]);

            }
            System.out.println();
        }
        System.out.println("---------------");

//      3
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if(i == 1 || i == 2) {
                    System.out.print(arr1[i][j]);
                }else if(i == 0){
                    System.out.print(arr1[i][j]);
                }

            }
            System.out.println();

//            System.out.print(arr1[i][1]);
//            System.out.print(arr1[i][2]);
//            System.out.print(arr1[i][0]);
//            System.out.println();
//            }
//            System.out.print(arr1[0][1]);
//            System.out.print(arr1[0][2]);
//            System.out.print(arr1[0][0]);
//            System.out.println();
        }
        System.out.println("---------------");

//      4
        for (int i = 1; i <= 2; i++) {
            System.out.print(arr1[i][2]);
            System.out.print(arr1[i][0]);
            System.out.print(arr1[i][1]);
            System.out.println();
            }
            System.out.print(arr1[0][2]);
            System.out.print(arr1[0][0]);
            System.out.print(arr1[0][1]);
            System.out.println();

        }

        }


