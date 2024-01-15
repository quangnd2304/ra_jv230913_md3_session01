package ra;

public class OperatorDemo {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 10;
        int number3 = number1++;//number3=10 - Dương + Khôi + Hoàng + Khánh - 11: Thịnh, Dũng - 12: Khang
        int number4 = ++number2;//number4 = 10 - Khang, Thịnh, Dũng, 11: Hoàng + Khôi + Dương + Khánh
        System.out.println("number3=" + number3);
        System.out.println("number4=" + number4);
        int number5 = 15, number6 = 18, number7 = 20;
        boolean result = (number5 <= 15) && (number6 > 18) || (number7 > 18 && number7 < 22);
        //true && false || (true && true)
        //true && false || true
        //false || true
        //true
        System.out.println("result="+result);
    }
}
