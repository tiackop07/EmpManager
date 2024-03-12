import Model.CanBo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quản Lý Nhân Sự");
        System.out.println("1.Xem danh sách");
        System.out.println("2.Thêm Nhân Sự");
        System.out.println("3.Tìm Nhân Sự");
        int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    QLCB.show();
                    break;
                case 2:
                    QLCB.addEmp();
                    break;
                case 3:
                    QLCB.search();
                    break;
                case 4:
                    return;
                default:
                    System.out.printf("Bạn đã thoát");
            }
    }
}