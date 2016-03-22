package test;

public class O1D {
	private int a;
	
	public void methode01(){
		O2D o2 = new O2D(100);
		this.a = o2.methodeO2();
	}
	
	public void methodeO1(O2D o2){
		this.a = o2.methodeO2();
	}

	public int getA() {
		return a;
	}
	
	
}
