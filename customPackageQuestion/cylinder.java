package com.mayank.shape;

public class cylinder extends shape {
    cylinder(int dim1, int dim2, int dim3) {
        super(dim1, dim2, -1);
    }

    public void volume() {
		System.out.println(Math.PI * this.dim1 * this.dim1 * this.dim2);
	}
	public void area() {
		System.out.println(2 * Math.PI * this.dim1 * this.dim2);
	}
}