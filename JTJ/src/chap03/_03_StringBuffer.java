package chap03;

public class _03_StringBuffer {
    public static void main(String[] args) {
        // ex1.
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");

        String res = sb.toString();
        System.out.println(res); // 자료형이 String
        System.out.println(sb); // 자료형이 StringBuffer


        // ex2.
        // result.append("java"); String 에는 append 메소드 없음
        String result = "";
        result += "hello";
        result += " ";
        result += "World";
        System.out.println(result);

        /*
            메모리 관점의 차이
            ex1) StringBuffer객체 한번 생성
            ex2) String에 += 있을때마다 새로운 String객체 생성 총 String 객체 4개 생성
                >>> String은 한번 생성하면 변경 불가능하니까 (immutable)
         */

        /*
            1) String = immutable
                - heap 메모리 영역에 새로운 객체를 매번 만듦
                - 기존 객체가 제거되면 가비지 컬렉션이 회수
                - 동기화 신경 안써도 됨 = thread safe = 내부 데이터 자유 공유 가능
            2) StringBuffer,StringBuilder = mutable
                - StringBuffer : 메서드 별로 동기화키워드 존재 (멀티스레드 환경 추천)
                - StringBuilder : 동기화 보장 x (단일스레드 환경 추천)

            정리
                - String : 짧은 문자열 더할 경우
                - StringBuffer : 스레드에 안전한 프로그램 필요할 때 / 개발 중인 시스템 부분이 스레드에 안전한지 모를 경우
                - StringBuilder : 스레드 안전 여부가 관계 없는 프로그램 개발 시

            이외
                - JDK 1.5버전 이전 : 문자열 연산(+, concat)시 조합된 문자열을 새로운 메모리에 할당해 참조 = 성능상 이슈 있었음
                - JDK 1.5버전 이후 : 컴파일 단계에서 StringBuilder로 컴파일 되도록 변경 = 성능상 차이 x
                - 하지만 반복 루프 사용해서 문자열 더할 땐 객체 계속 추가하므로 StringBuilder > StringBuffer >>>> String 순으로 활용 권장
         */

        //StringBuffer 초기화
        //ex1.
        // 이전 문자는 garbage collected 됨
        System.out.println("sb : " + sb);
        sb.setLength(0);
        System.out.println("sb : " + sb);

        //ex2.
        // 이전 데이터 메모리에 저장 X = GC발생 x >>> API와 같이 서비스에서 일정한 속도가 중요한 경우 GC최소화에 유리함
        sb.append("java");
        System.out.println("sb : " + sb);
        sb.delete(0, sb.length());
        System.out.println("sb :" + sb);

        //insert(offeset, str) : offset위치에 str삽입
        sb.append("jump to java");
        System.out.println(sb);
        sb.insert(0, "hello ");
        System.out.println(sb);

        //substring(a, b) : a <= 출력 < b
        System.out.println(sb.substring(0,4));

    }
}
