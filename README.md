Ver pro max:


import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.println("Menu");
            System.out.println("1. Tinh tong so le");
            System.out.println("2. Kiem tra so nguyen to");
            System.out.println("3. Tinh so ngay moi thang");
            System.out.print("Chon chuong trinh: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Nhap so de tinh tong so le: ");
                    int num = input.nextInt();
                    int sum = 0;
                    if (num > 10 && num < 100) {
                        for (int i = 1; i <= num; i++) {
                            if (i % 2 != 0) {
                                sum += i;
                            }
                        }
                        System.out.println("Tong so le = " + sum);
                    } else {
                        System.out.println("Vui long nhap lai");
                    }
                    break;
                case 2:
                    System.out.print("Nhap so de kiem tra so nguyen to: ");
                    int number = input.nextInt();
                    int i = 2;
                    boolean check = true;
                    while (i <= Math.sqrt(number)) {
                        if (number % i == 0) {
                            check = false;
                            break;
                        }
                        i++;
                    }
                    if (check)
                        System.out.println(number + " la so nguyen to");
                    else
                        System.out.println(number + " KHONG phai so nguyen to");
                    break;
                case 3:
                    System.out.print("Nhap so thang: ");
                    int month = input.nextInt();
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println("31 ngay");
                            break;
                        case 2:
                            System.out.println("28 hoac 29 ngay");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("30 ngay");
                            break;
                        default:
                            System.out.println("Thang khong hop le");
                    }
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai tu 1 den 3.");
            }

            // Yêu cầu người dùng chọn Y/N để quay lại menu
            System.out.print("Ban co muon chay lai menu khong? (Y/N): ");
            continueChoice = input.next(); // Đọc lựa chọn từ người dùng

        } while (continueChoice.equalsIgnoreCase("Y")); // Tiếp tục nếu người dùng chọn Y

        System.out.println("Chuong trinh ket thuc.");
    }
}
