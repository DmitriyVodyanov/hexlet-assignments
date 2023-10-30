package exercise;

// BEGIN
class Segment {
	private Point beginPoint;
	private Point endPoint;
	private Point midPoint;

	public Segment(Point beginPoint, Point endPoint) {
		this.beginPoint = beginPoint;
		this.endPoint = endPoint;
	}

	public Point getBeginPoint() {
		return beginPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public Point getMidPoint() {
		return midPoint;
	}
}
// END
