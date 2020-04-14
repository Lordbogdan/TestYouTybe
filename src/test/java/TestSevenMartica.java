public class TestSevenMartica {
    public static void main(String[] args) {
        int[][] matrica = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
        };
        int[][] matrica2 = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3},
        };

        for (int i = 0; i < matrica.length; i++) {
            for (int k = 0; k < matrica[i].length; k++) {
                System.out.print("Первая матрица");
                System.out.print(matrica[i][k] + " ");
                System.out.print(" ");


                for (int h = 0; h < matrica2.length; h++) {
                    for (int f = 0; f < matrica2[i].length; f++) {
                        System.out.print("Вторая матрица");
                        System.out.print(matrica2[h][f] + " ");
                        System.out.println();
                        int sum;
                        sum = matrica[i][k] + matrica2[h][f];
                        System.out.print("Сумма матриц");
                        System.out.print(sum + " ");
                        break;
                    }
                }
            }
        }
    }
}

