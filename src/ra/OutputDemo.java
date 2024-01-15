package ra;

public class OutputDemo {
    public static void main(String[] args) {
        //1. System.out.println("String"): in ra xong xuống dòng
        System.out.println("Xin chào các bạn lớp JV230913");
        //2. System.out.print("String"): in ra không xuống dòng
        System.out.print("Chào mừng các bạn đến với Rikkei Academy");
        //3. System.out.printf("Control String",value...): In chuỗi có định dạng
        String studentId = "SV001";
        String studenName = "Nguyễn Văn A";
        int age = 18;
        float avgMark = 8.5F;
        boolean sex = true;
        /*
         * String: %s
         * int: %d
         * float, double: %f
         * boolean: %b
         * */
        System.out.printf("\nMã SV: %s - Tên sinh viên: %s - Tuổi: %d - Điểm TB: %f - Giới tính: %b\n",
                studentId, studenName, age, avgMark, sex);
        System.out.printf("\nMã SV: %s - Tên sinh viên: %s - Tuổi: %d - Điểm TB: %f - Giới tính: %s\n",
                studentId, studenName, age, avgMark, sex?"Nam":"Nữ");

    }
}
