package com.mayank.shape;

public class square extends shape{
    square(int dim1, int dim2, int dim3) {
        super(dim1, -1, -1);
    }

	public void volume() {
		System.out.println(this.dim1 * this.dim1 * this.dim1);
	}
	public void area() {
		System.out.println(this.dim1 * this.dim1);
	}
}
