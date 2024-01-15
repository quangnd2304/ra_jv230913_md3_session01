package ra;

public class DataType_Variable {
    public static void main(String[] args) {
        /*
         * Các kiểu dữ liệu        *
         * 1. Primitive: nguyên thủy
         * - Integer - int: số nguyên
         * - Float - float: số thực
         * - Double - double: số thực
         * - Character - char: ký tự
         * - Boolean - boolean: true - false
         * 2. Reference: tham chiếu
         * - String - String: chuỗi
         * - Array
         * - Object...
         * */
        //1. Khai báo biến: Datatype + variableName
        //- Khai báo biến mã sinh viên, tên sinh viên
        String studentId;
        String studentName;
        //2. Khởi tạo giá trị: variableName = value
        //- Khởi tạo giá trị cho biến mã sinh viên là SV001, tên SV là Nguyễn Văn A
        studentId = "SV001";
        studentName = "Nguyễn Văn A";
        //3. Khai báo và khởi tạo giá trị: Datatype + variableName = value
        //- khai báo và khởi tao giá trị cho biến tuổi sinh viên, giới tính sinh viên, địa chỉ sinh viên
        //Format code: Ctrl + Alt + L
        int age = 18;
        boolean sex = true;
        String address = "Nam Từ Liêm, Hà Nội";
        //4. Khai báo và khởi tạo giá trị cho nhiều biến cùng kiểu dữ liệu
        //- Khai báo và khởi tạo giá trị cho các biến điểm html, css, javascript
        //8.5 --> double: 8 bytes, float: 4 bytes
        float html = 8.5F, css = 7.2F, js = 6.8F;
        /*
         *  Khai báo và khởi tạo giá trị cho các biến sau:
         * Mã sách: String
         * Tên sách: String
         * Giá sách: float
         * Tác giả: String
         * Năm xuất bản: int
         * Trạng thái sách: hoạt động, không hoạt động: boolean
         * */
        //5. Khai báo hằng số không thể thay đổi giá trị: final Datatype constant_name = constant_value
        //- Khai báo hằng số điểm pass của các môn học có giá trị 5
        final float MARK_PASS = 5;
    }
}
