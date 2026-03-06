package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckedException checkedException = new CheckedException("Lỗi 1");
        UncheckedException uncheckedException = new UncheckedException("Lỗi 2");
        inputInt();
    }

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        // nhập đến khi nào thoả mãn là 1 số nguyên dương thì trả về
        try {
            // khối code sinh ra ngoại lệ
            System.out.println("Nhập 1 số nguyên : ");
            int a = scanner.nextInt();
            return a;
        }catch (InputMismatchException e){ // tên ngoại lệ muốn bắt
            // logic xử lý ngoại lệ
            System.out.println("Bạn phải nhập 1 số nguyên!");
        }finally {
            // luôn luôn chạy sau khi xử lý, dọn dẹp, đóng các kết nối
            System.out.println("Kết thúc xử lý!");
            scanner.close();
        }
        return -1;
    }
}
