package codedevl;

class RRECTANGLE{
	private double width,height;
	private String color;
	public RRECTANGLE(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		color=color.toUpperCase();
		String col=color.charAt(0)+color.substring(1).toLowerCase();
		return col;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double finaArea() {
		return this.getHeight()*this.getWidth();
	}
	public double findPerimeter() {
		return 2*(this.getHeight()+this.getWidth());
	}
}
