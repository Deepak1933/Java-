package oops;

public interface Interf {
	public void m1();
	public void m2();	

}
 class Service implements Interf {
	public static void main(String[] args) {
		System.out.println("*******");  
	}	
	public void m1()
	{
		System.out.println("*******");

     }
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}
