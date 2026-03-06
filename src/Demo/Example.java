package Demo;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = inputInt(sc);
        float c = inputFloat(sc);
        String e = inputString(sc);
        boolean f = inputBoolean(sc);

    }

    public static int inputInt(Scanner sc){
        try{
            System.out.print("Nhập số nguyên int : ");
            int a = Integer.parseInt(sc.nextLine());
            return a;
        }catch(NumberFormatException e){
            System.out.println("Bạn cần nhập số nguyên int!");
        }finally{
            System.out.println("Kết thúc nhập!");
        }
        return -1;
    }

    public static float inputFloat(Scanner sc){
        try{
            System.out.print("Nhập số thực float : ");
            float a = Float.parseFloat(sc.nextLine());
            return a;
        }catch(NumberFormatException e){
            System.out.println("Bạn cần nhập số thực float!");
        }finally{
            System.out.println("Kết thúc nhập!");
        }
        return -1;
    }

    public static String inputString(Scanner sc){
        try{
            System.out.print("Nhập chuỗi kí tự : ");
            String a = sc.nextLine().trim();
            return a;
        }catch(RuntimeException e){
            System.out.println("Bạn cần nhập chuỗi kí tự!");
        }finally{
            System.out.println("Kết thúc nhập!");
        }
        return null;
    }

    public static boolean inputBoolean(Scanner sc){
        try{
            System.out.print("Nhập true/false : ");
            boolean a = sc.nextBoolean();
            return a;
        }catch(Exception e){
            System.out.println("Bạn cần nhập true/false!");
        }finally{
            System.out.println("Kết thúc nhập!");
        }
        return false;
    }


}
