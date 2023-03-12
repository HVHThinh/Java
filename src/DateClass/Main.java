package DateClass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nam: ");
		int year = sc.nextInt();

		System.out.println("Nhap thang: ");
		int month = sc.nextInt();

		System.out.println("Nhap ngay: ");
		int day = sc.nextInt();
		
	    Kiemtrangaythang data = new Kiemtrangaythang(year, month, day);
	    data.kiemtraNamNhuan(year, month, day);
	}
}
