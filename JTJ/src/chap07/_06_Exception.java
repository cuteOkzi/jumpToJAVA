package chap07;

import java.io.*;

class FoolException extends RuntimeException {
    /*
        RuntimeException의 예외
        1) RuntimeException : 실행 시 발생하는 예외 = 예측 불가능한 경우에 활용 (Unchecked Exception)
        2) Exception : 컴파일 시 발생하는 예외 = 예측 가능한 경우에 활용 (Checked Exception)
     */
}

public class _06_Exception {
    public void shouldBeRun(){
        System.out.println("ok thanks.");
    }

    public void sayNick(String nick) throws FoolException{
        //try {
            if ("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 " + nick + "입니다.");
        /*} catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }*/
    }

    /*
        throw VS throws
        - throw : 메서드 내에서 예외 발생
            > 메서드 내에서 예외처리
            예외발생 후에도 다음 문장 실행 가능

        - throws : 메서드 선언부에서 사용
            > main 문에서 예외처리
            예외발생한 후 다음 문장 실행 안됨
     */

    public static void main(String[] args) throws IOException {
        /*
            FileNotFoundException : 지정 파일을 찾을 수 없습니다.
            BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
            br.readLine();
            br.close();

            -ArithmeticException : 산술예외 (0으로 나누기)
            int c = 4 / 0;

            - ArrayIndexOutOfBoundsException : 배열 인덱스를 벗어난 범위를 호출할 때
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
        */

        //예외처리 : try catch문
        _06_Exception E = new _06_Exception();
        int c;
        try{
            c = 4 / 0;
            E.shouldBeRun(); // 코드 실행 절대 되지 않음 = 예외 발생으로 catch구문으로 넘어가기 때문
        } catch(ArithmeticException e) {
            c = -1;
        } finally{ //finally : 어떤 예외가 발생하더라도 반드시 실행되어야 하는 부분이 있을 때
            E.shouldBeRun();
        }
        System.out.println(c);

        try{
            E.sayNick("바보");
            E.sayNick("야호");
        } catch (FoolException e) {
            System.err.println("FoolException 이 발생했습니다.");
        }

    }
}

