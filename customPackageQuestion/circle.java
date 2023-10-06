package com.mayank.shape;

public class circle extends shape {
    circle(int dim1, int dim2, int dim3) {
        super(dim1, -1, -1);
    }

    public void parameter() {
		System.out.println(2 * Math.PI * this.dim1);
	}
	public void area() {
		System.out.println(Math.PI * this.dim1 * this.dim1);
	}
}
