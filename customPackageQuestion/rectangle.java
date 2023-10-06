package com.mayank.shape;

public class rectangle extends shape {
    rectangle(int dim1, int dim2, int dim3) {
        super(dim1, dim2, dim3);
    }

    public void volume() {
		System.out.println(this.dim1 * this.dim2 * this.dim3);
	}
	public void area() {
		System.out.println(this.dim1 * this.dim2);
	}
}
