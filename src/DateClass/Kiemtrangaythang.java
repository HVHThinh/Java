package DateClass;

public class Kiemtrangaythang {
	private int year;
	private int month;
	private int day;

	public Kiemtrangaythang(int year, int month, int day) {
		if (year <= 0 || month <= 0 || (day <= 0 && day > 31)) {
			System.out.println("Ngay thang nam nhap vao khong hop le");
			return;
		}
		System.out.println("Ngay thang nam nhap vao hop le");
	}

	public void kiemtraNamNhuan(int year, int month, int day) {
		if (month == 2 && year % 4 == 0 || year % 400 == 0) {
			if (day == 29) {
				System.out.println("Nam" +year+ "la nam nhuan");
				return;
			}
			if (day > 29) {
				System.out.println("Ngay thang nam nhap vao hop le");
				return;
			}
			System.out.println("Nam" +year+ "khong phai la nam nhuan");
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31) {
				System.out.println("Ngay thang nam nhap vao hop le");
				return;
			}
			System.out.println("Ngay thang nam la " + day + "/" + month + "/" + year);
			return;
		}
		if (day > 30) {
			System.out.println("Ngay thang nam nhap vao hop le");
			return;
		}
		System.out.println("Ngay thang nam la " + day + "/" + month + "/" + year);
		return;
	}

}
