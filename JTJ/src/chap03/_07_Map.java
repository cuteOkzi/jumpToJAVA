package chap03;
import java.util.HashMap;
import java.util.Map;

public class _07_Map {
    public static void main(String[] args) {
        /*
            map : 사전(dictionary)와 비슷함
            key - value 쌍 자료형

            ex)
            HashMap
            LinkedHashMap
            TreeMap
         */

        //put : key, value 쌍 추가
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map);

        //get : key에 해당하는 value 얻을 때 사용
        System.out.println(map.get("people"));

        //getOrDefault : key 해당 Value 없을 때 null return
        System.out.println(map.get("java"));
        System.out.println(map.getOrDefault("java", "none"));

        //containsKey : map 안에 해당 key가 있는지 bool값 출력
        System.out.println(map.containsKey("people"));
        System.out.println(map.containsKey("basketball"));

        //remove : 해당 key항목 삭제 후 value값 return;
        System.out.println(map.remove("people"));
        System.out.println(map);

        //size : map 요소 개수 return
        map.put("basketball", "농구");
        map.put("volleyball", "배구");
        map.put("tennis", "테니스");
        System.out.println(map.size());
        System.out.println(map);

        //keySet : map의 모든 key 모아서 리턴 (HashMap은 순서, 중복 없으므로 뒤죽박죽)
        System.out.println(map.keySet().getClass());

    }
}
