public class FillTheMatrix {
    public static void main(String[] args) {
        fillTheMatrix(6);
    }

    public static void fillTheMatrix(int size){
        int num = 1;
        int[][] array = new int[size][size];

        for (int y = 0; y < size; y++) {
            array[0][y] = num;
            num++;
        }
        for (int x = 1; x < size; x++) {
            array[x][size - 1] = num;
            num++;
        }
        for (int y = size - 2; y >= 0; y--) {
            array[size - 1][y] = num;
            num++;
        }
        for (int x = size - 2; x > 0; x--) {
            array[x][0] = num;
            num++;
        }
        int c = 1;
        int d = 1;

        while (num < size * size) {
            while (array[c][d + 1] == 0) {
                array[c][d] = num;
                num++;
                d++;
            }
            while (array[c + 1][d] == 0) {
                array[c][d] = num;
                num++;
                c++;
            }
            while (array[c][d - 1] == 0) {
                array[c][d] = num;
                num++;
                d--;
            }
            while (array[c - 1][d] == 0) {
                array[c][d] = num;
                num++;
                c--;
            }
        }
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = num;
                }
            }
        }
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (array[x][y] < 10) {
                    System.out.print(array[x][y] + "|  ");
                } else {
                    System.out.print(array[x][y] + "| ");
                }
            }
            System.out.println();
        }
    }
}
