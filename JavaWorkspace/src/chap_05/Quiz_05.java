package chap_05;

public class Quiz_05 {
    public static void main(String[] args) {
        int[] shoeSize = new int[10];

        for (int i = 0; i < shoeSize.length; i++) {
            shoeSize[i] = 250 + (i * 5);
        }

        for (int size : shoeSize){
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
