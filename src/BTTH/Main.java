package BTTH;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập tuổi: ");
            String age = scanner.nextLine();

            System.out.print("Nhập email: ");
            String email = scanner.nextLine();

            User user = User.registerUser(name, age, email);

            saveUserToFile(user.toString());

            System.out.println("Đăng ký thành công.");

        } catch (InvalidAgeException e) {
            System.out.println("Lỗi tuổi: " + e.getMessage());
        } catch (InvalidEmailException e) {
            System.out.println("Lỗi email: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Tuổi phải là số hợp lệ.");
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi hệ thống khi lưu file: " + e.getMessage());
        } finally {

            System.out.println("Hoàn tất luồng xử lý đăng ký.");
            scanner.close();

        }
    }

    public static void saveUserToFile(String userData)
            throws FileNotFoundException {

        System.out.println("Đang lưu dữ liệu: " + userData);

        throw new FileNotFoundException("Không tìm thấy file để lưu dữ liệu.");
    }
}