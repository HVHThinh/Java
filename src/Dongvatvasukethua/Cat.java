package Dongvatvasukethua;

public class Cat extends Animal {
	private String mauLong;
	private double height;

	public Cat(String name, int age, String type, String mauLong, Double height) {
		super(name, age, type);
		this.mauLong = mauLong;
		this.height = height;
	}

	public String getMauLong() {
		return mauLong;
	}

	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
