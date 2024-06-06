package chap07;
import java.util.*;

public class _11_NoneStream {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if(data[i] % 2 == 0){
                dataList.add(data[i]);
            }
        }

        //Set 활용으로 중복 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        //Set 을 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        //역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());

        //Integer 리스트를 정수배열로 변환
        int[] result = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }

        for(int n : result){
            System.out.print(n + " ");
        }

    }
}
