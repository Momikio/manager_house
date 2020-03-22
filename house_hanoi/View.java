package learnoop2.bai2.manager_hour.house_hanoi;

import java.util.Scanner;

import learnoop2.bai2.manager_hour.house.Househ;

public class View {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println(" ");
            System.out.println("1. Nhập thông tin n ngôi nhà ở Hà Nội");
            System.out.println("2. Hiển thị thông tin của n ngôi nhà đó.");
            System.out.println("3. Sắp xếp theo trường địa chỉ và hiển thị thông tin sau khi sắp xếp.");
            System.out.println("4.Tìm kiếm nhà theo địa chỉ nhập vào.");
            System.out.println("5. Thoát.");
            System.out.println("Enter choice");
            choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    HouseofQuan house = new HouseofQuan();
                    house.input(scan);
                    HouseofQuan.add(house);
                    break;
                case 2:
                    HouseofQuan.getInfoHouse();
                    break;
                case 3:
                HouseofQuan.sortListHouse();
                HouseofQuan.getInfoHouse();
                break;
                case 4 :
                String diachi;
                System.out.println("nhap dia chi muon tim :");
                diachi=scan.nextLine();
                HouseofQuan.findDiaChi(diachi);
                break;
                case 5 :
                System.out.println("cam on da xu dung dich vu !");
            }
        } while (choice != 5);

    }
}