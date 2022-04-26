import java.util.Scanner;
public class Hesapmakinesi {
	public static void main(String[] args){
		
		
	
		int n1,n2,select;
		
		Scanner input= new Scanner (System.in);
		System.out.print("Ýlk sayý:");
		n1= input.nextInt();
		System.out.print("Ýkinci sayý:");
		n2= input.nextInt();
		System.out.print("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\n");
		System.out.print("seçiminiz:");
		select=input.nextInt();
		
		switch(select) {
		case 1:
		System.out.println("Toplamý:"+ (n1+n2));
		break;
		case 2:
		System.out.println("Çýkarma:"+ (n1-n2));
		break;
		case 3:
		System.out.println("Çarpým:"+ (n1*n2));
		break;
		case 4:
		System.out.println("Bölüm:"+ (n1/n2));
		break;
		default:		
			System.out.print("Geçerli deðer giriniz");
		
			
	
	
	}

}
	}