package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        String[][] seats = new String[][]{
                seatA, seatB, seatC
        };

        /*
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
         */

        System.out.println(seats[1][1]);
        System.out.println(seats[2][4]);

        //첫줄 3칸, 둘째 4칸, 셋째 5칸
        String[][] seats2 = new String[][]{
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2[0][2]);
        //System.out.println(seats2[0][3]); error code : ArrayIndexOutOfBoundsException

        /* 3차원 배열 만들기
        String[][][] mArray = new String[][][]{
                {{},{'1','2','3'},{}},
                {{},{},{}},
                {{},{},{}}
        };
        mArray[0][1][2] = 3
        */
    }
}
