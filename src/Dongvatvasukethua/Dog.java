package Dongvatvasukethua;

public class Dog extends Animal {
    private String mauSac;
    private double weight;

    public Dog(String name, int age, String type, String mauSac, double weight) {
        super(name, age, type);
        this.mauSac = mauSac;
        this.weight = weight;
    }

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
    
}