package comp1011.inheritance;

public class Tester {
	public static void main(String[] args){
		ComissionEmployee ce = new ComissionEmployee("Anju", "Chawla", "123456789", 1000.0, 0.5);
		BasePlusComissionEmployee bce = new BasePlusComissionEmployee("Luis", "Acevedo", "987654321", 2000.0, 0.2, 2000.0);
		ComissionEmployee ce2 = bce;
		
		System.out.println("CE: ComissionEmployee");
		System.out.println(ce);
		System.out.printf("\n");
		System.out.println("BCE: BaseComissionEmployee");
		System.out.println(bce);
		System.out.printf("\n");
		System.out.println("CE2: ComissionEmployee aiming at BCE");
		System.out.println(ce2);
		
		
	}
	
}
