package com.mayank.shape;

public class shape {
	int dim1, dim2, dim3;
	shape(int dim1, int dim2, int dim3) {
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.dim3 = dim3;
	}

	public void setDim1(int dim1) {
		this.dim1 = dim1;
	}
	public int getDim1() {
		return dim1;
	}

	public void setDim2(int dim2) {
		this.dim2 = dim2;
	}
	public int getDim2() {
		return dim2;
	}

	public void setDim3(int dim3) {
		this.dim3 = dim3;
	}
	public int getDim3() {
		return dim3;
	}
}