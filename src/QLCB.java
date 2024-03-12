import Model.CanBo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QLCB {
    static ArrayList<CanBo> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void addEmp() {
        System.out.println("Xin chào");
        System.out.println("Nhap ten can bo: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        list.add(new CanBo(name, age, sex));
    }

    public static void show(){
        System.out.printf("Danh sách nhân sự:");
        for (int i = 0; i < list.size(); i++){
            System.out.printf(String.valueOf(list.get(i)));
        }
    }

    public static void search(){
        System.out.println("Nhap ten can tim: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (int i = 0; i< list.size();i++){
            if (list.get(i).getName().equals(name)){
                System.out.println(list.get(i));
            }
        }
    }
}
