import org.junit.Test;

public class Main {
    public int[][] array = new int[3][4];

    @Test
    public void arici() {
        initializeArray();
        showArray();
        System.out.println(solve());
    }

    public void initializeArray() {
        array[0][0] = 69;
        array[0][1] = 70;
        array[0][2] = 80;
        array[0][3] = 90;
        array[1][0] = 1;
        array[1][1] = 2;
        array[1][2] = 3;
        array[1][3] = 4;
        array[2][0] = 100;
        array[2][1] = 20;
        array[2][2] = 60;
        array[2][3] = 40;
    }

    int solve(){
      int value = 0;
      for (int i = 0; i < 4 ; i++) {
          value += getMax();
      }
      return value;
    }

    int getMax() {
        int coordI = 0;
        int coordJ = 0;
        int init = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (init < array[i][j]){
                    init = array[i][j];
                    coordI = i;
                    coordJ = j;
                }
            }
        }
        array[coordI][coordJ] = 0;
        return init;
    }

    public void showArray() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
