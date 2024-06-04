package chap05;
class Calculator{
    static int res = 0;

    static int add(int num){
        res += num;
        return res;
    }

    static int sub(int num){
        res -= num;
        return res;
    }

    static int mul(int num){
        res *= num;
        return res;
    }
}

class Calculator2{
    static int res = 0;

    static int add(int num){
        res += num;
        return res;
    }
}

class Cal {
    int res = 0;

    int add(int num) {
        res += num;
        return res;
    }
}

public class _01_ObjectOriented {
    public static void main(String[] args){
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));

        System.out.println(Calculator2.add(3));
        System.out.println(Calculator2.add(7));


        Cal c1 = new Cal();
        Cal c2 = new Cal();

        System.out.println(c1.add(3));
        System.out.println(c1.add(4));
        System.out.println(c2.add(3));
        System.out.println(c2.add(7));
    }
}

