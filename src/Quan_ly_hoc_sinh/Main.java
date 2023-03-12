package Quan_ly_hoc_sinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		School school = new School("THPT Thua Luu");

		school.themHocSinh(new Student("Ho Van Hung Thinh", 24, "Quang Ngai"));
		school.themHocSinh(new Student("Tran Mua Phi Bao", 23, "Da Nang"));
		school.themHocSinh(new Student("Duong Quang Trinh", 22, "Hue"));
		school.themHocSinh(new Student("Truong Xuan Nguyen", 20, "Quang Nam"));

		school.hocSinh20Tuoi();

		int count = school.hocSinhCoQueQuanDaNang(23, "Da Nang");
		System.out.println("So luong hoc sinh que o DN va 23 tuoi: " + count);
	}
}
