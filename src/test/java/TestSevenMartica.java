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
        int[][] sum = new int[3][3];
                for (int h = 0; h < matrica2.length; h++) {
                    for (int f = 0; f < matrica2[h].length; f++) {
                        sum [h][f] = matrica[h][f] + matrica2[h][f];
                    }
                }
        for (int h = 0; h < matrica2.length; h++) {
            for (int f = 0; f < matrica2[h].length; f++) {
                System.out.print(" " + sum [h][f]);
            }
            System.out.println();
        }
            }
        }
