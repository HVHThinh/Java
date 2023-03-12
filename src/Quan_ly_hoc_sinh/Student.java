package Quan_ly_hoc_sinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String hoTen;
	private int tuoi;
	private String queQuan;

	public Student(String hoTen, int tuoi, String queQuan) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.queQuan = queQuan;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

}
