package Quan_ly_hoc_sinh;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String Lop;
	private ArrayList<Student> hocSinh;

	public School(String Lop) {
		this.Lop = Lop;
		this.hocSinh = new ArrayList<>();
	}

	public void themHocSinh(Student student) {
		hocSinh.add(student);
	}

	public void hocSinh20Tuoi() {
		System.out.println("Hoc sinh duoi 20 tuoi:");
		for (Student student : hocSinh) {
			if (student.getTuoi() == 20) {
				System.out.println(student.getHoTen() + " (" + student.getQueQuan() + ")");
			}
		}
	}

	public int hocSinhCoQueQuanDaNang(int tuoi, String queQuan) {
		int count = 0;
		for (Student student : hocSinh) {
			if (student.getTuoi() == 23 && student.getQueQuan().equals("Da Nang")) {
				count++;
			}
		}
		return count;
	}
}
