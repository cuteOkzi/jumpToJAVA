package chap03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프문자 (Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요");

        System.out.println("해물파전\t9,000원");
        System.out.println("김치전\t8,000원");
        System.out.println("부추전\t8,000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java\\chap03\\04_EscapeSequence.java");
        System.out.println("단비가 \"냐옹\"이라고 했어요");
        System.out.println("단비가 \'뭘 봐?\'라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?'라는 표정을 지었어요");

        char c = 'A';
        c = '\'';

        System.out.println(c);


    }
}
