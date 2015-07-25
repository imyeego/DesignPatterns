package com.liu.adapter;

public class Notebook {
	private ThreePlugInter tpi;
	
	public Notebook(ThreePlugInter tpi) {
		super();
		this.tpi = tpi;
	}
	
	public void charge(){
		tpi.powerWithThree();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GBTwoPlug two = new GBTwoPlug();
		ThreePlugInter three = new TwoPlugAdapter(two);
		Notebook nb = new Notebook(three);
		nb.charge();
		
		ThreePlugInter three1 = new TwoPlugExtendsAdapter();
		nb = new Notebook(three1);
		nb.charge();
	}

}
