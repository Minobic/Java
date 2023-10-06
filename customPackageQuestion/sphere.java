package com.mayank.shape;

public class sphere extends shape {
    sphere(int dim1, int dim2, int dim3) {
        super(dim1, -1, -1);
    }

    public void volume() {
		System.out.println(4/3 * Math.PI * this.dim1 * this.dim1 * this.dim1);
	}
	public void area() {
		System.out.println(4 * Math.PI * this.dim1 * this.dim1);
	}
}
