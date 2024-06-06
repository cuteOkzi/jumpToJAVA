package chap07;

import java.util.Arrays;
import java.util.Comparator;

public class _12_Stream {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] res = Arrays.stream(data)
                .boxed()//IntStream 을 Stream<Integer>로 변경
                .filter((a) -> a % 2 == 0)// 짝수만 뽑아내기
                .distinct()//중복제거
                .sorted(Comparator.reverseOrder()) // 역순 정렬
                .mapToInt(Integer::intValue) //Stream<Integer>를 IntStream으로 변경
                .toArray() // int[]배열로 반환
                ;
    }
}
