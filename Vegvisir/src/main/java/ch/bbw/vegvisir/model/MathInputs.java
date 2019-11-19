package ch.bbw.vegvisir.model;

import java.awt.Point;

public class MathInputs {
	private Point a = new Point();
	private Point b = new Point();
	private Point vector = new Point();
	private double magnitude = 0.0d;
	
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getVector() {
		return vector;
	}
	public void setVector(Point vector) {
		this.vector = vector;
	}
	public double getMagnitude() {
		return magnitude;
	}
	public void setMagnitude(double magnitude) {
		this.magnitude = magnitude;
	}
}
