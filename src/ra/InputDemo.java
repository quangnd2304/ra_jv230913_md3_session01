package ra;


import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //B1: Khởi tạo đối tượng Scanner (java.util.Scanner)
        Scanner scanner = new Scanner(System.in);
        //B2: Thông báo nhập dữ liệu --> sử dụng các câu lệnh xuất
        System.out.println("Nhập vào mã sinh viên:");
        //B3: Lấy dữ liệu nhập từ bàn phím và lưu vào biến
        String studentId = scanner.nextLine();
        //Nhập tên sinh viên
        System.out.println("Nhập vào tên sinh viên:");
        String studentName = scanner.nextLine();
        //Nhập tuổi sinh viên
        System.out.println("Nhập vào tuổi sinh viên:");
//        int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());
        //Nhập điểm trung bình sinh viên
        System.out.println("Nhập vào điểm trung bình của sinh viên:");
//        float avgMark = scanner.nextFloat();
        float avgMark = Float.parseFloat(scanner.nextLine());
        //Nhập vào giới tính sinh viên
        System.out.println("Nhập vào giới tính sinh viên:");
//        boolean sex = scanner.nextBoolean();
        boolean sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên:");
        String address = scanner.nextLine();
        //In thông tin sinh viên
        System.out.printf("Mã sinh viên: %s - Tên SV: %s - Điểm TB: %f\n", studentId, studentName, avgMark);
        System.out.printf("Giới tính: %b - Địa chỉ: %s\n", sex, address);
    }
}
