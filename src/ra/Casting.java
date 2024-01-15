package ra;

public class Casting {
    public static void main(String[] args) {
        int number = 10;
        String str = "10";

        //1. Implicit - Ngầm định - IDE tự động thưc hiện: ép kiểu dữ liệu từ thấp lên cao
        //20: int --> float --> gán cho number1
        float number1 = 20;
        //2. Explicit - Tường minh - LTV phải tự ép kiểu: ép kiểu dữ liệu cao xuống thấp
        //8.5: double
        float number2 = (float)8.5;
        // Casting từ String sang các kiểu dữ liệu khác
        /*
        * String --> int: Integer.parseInt("String")
        * String --> float: Float.parseFloat("String")
        * String --> double: Double.parseDouble("String")
        * String --> boolean: Boolean.parseBoolean("String")
        * */
        number = Integer.parseInt(str);
        //String + otherDataType --> String
    }
}
