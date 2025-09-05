import java.util.Scanner;
import java.util.Date;
public class BTL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Thông tin sách cho mượn:");
		Thongtinsach a= new Thongtinsach();
		a.hien();
		System.out.println("Bạn muốn mượn sách:");
		String muonsach=sc.nextLine();
		System.out.println("Thông tin người mượn:");
		Quanlimuontra b= new Quanlimuontra();	
		b.hien1();
		System.out.println("Đăng kí mượn sách thành công!!!\n");
		System.out.println("Bạn muốn trả sách:");
		String trasach=sc.nextLine();
		System.out.println("Nhập thông tin người trả");
		Quanlimuontra c= new Quanlimuontra();
		c.hien2();
		System.out.println("Bạn đã trả sách !!!");
	}

}
	