package Utility.java;

public class Utility1 {
	public static void main(String[] args) {
		String name = new String("Deepak is boy ");
		
		System.out.println("The name is :");
		System.out.println(name.replace('e','v'));
		System.out.println(name.startsWith("Dr"));
		System.out.println(name.endsWith("ka"));
		System.out.println(name.charAt(2));	
		System.out.println(name.indexOf("pa"));
		String modiefiedName = "Deeepppak";
		System.out.println(modiefiedName.indexOf("pa"));
		System.out.println(modiefiedName.lastIndexOf("pa"));
		System.out.println(modiefiedName.equals("Deeepak"));
		System.out.println(modiefiedName.equalsIgnoreCase("DeeepPpak"));
		
		}

}
    