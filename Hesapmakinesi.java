import java.util.Scanner;
public class Hesapmakinesi {
	public static void main(String[] args){
		
		
	
		int n1,n2,select;
		
		Scanner input= new Scanner (System.in);
		System.out.print("�lk say�:");
		n1= input.nextInt();
		System.out.print("�kinci say�:");
		n2= input.nextInt();
		System.out.print("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\n");
		System.out.print("se�iminiz:");
		select=input.nextInt();
		
		switch(select) {
		case 1:
		System.out.println("Toplam�:"+ (n1+n2));
		break;
		case 2:
		System.out.println("��karma:"+ (n1-n2));
		break;
		case 3:
		System.out.println("�arp�m:"+ (n1*n2));
		break;
		case 4:
		System.out.println("B�l�m:"+ (n1/n2));
		break;
		default:		
			System.out.print("Ge�erli de�er giriniz");
		
			
	
	
	}

}
	}