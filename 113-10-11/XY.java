

public class XY {
    public static void main(String[] args) {
        int[][] cords = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for(int x = 0; x < cords.length; x++) {  //x為列數
            for(int y = 0; y < cords[x].length; y++) { //y為行數
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }
    }
} 
