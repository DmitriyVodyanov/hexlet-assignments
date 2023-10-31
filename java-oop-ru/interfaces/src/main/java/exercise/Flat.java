package exercise;

// BEGIN
class Flat implements Home {
	private double area;
	private double balconyArea;
	private int floor;

	public Flat(double area, double balconyArea, int floor) {
		this.area = area + balconyArea;
		this.balconyArea = balconyArea;
		this.floor = floor;
	}

	public double getArea() {
		return area;
	}

	public double getBalconyArea() {
		return balconyArea;
	}

	public int getFloor() {
		return floor;
	}

	public int compareTo(Home another) {
		if (this.getArea() > another.getArea()) {
			return 1;
		}
		if (this.area < another.getArea()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Квартира площадью " +
				area + " метров" +
				" на " + floor +
				" этаже";
	}


}
// END
