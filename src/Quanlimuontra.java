
public class Quanlimuontra  extends Quanlimuontrasach{
	int MaSV;
	String hoten;
	int sachdamuon;
	String trasach,muonsach;
	int ngaymuon,thangmuon,nammuon;
	int ngaytra,thangtra,namtra;
	public Quanlimuontra() {

	}
	public Quanlimuontra(int MaSV,String hoten,int ngaymuon, int ngaytra,String trasach, int sachdamuon, String muonsach) {
		this.hoten=hoten;
		this.MaSV=MaSV;
		this.muonsach=muonsach;
		this.sachdamuon=sachdamuon;
		this.trasach= trasach;
		this.ngaymuon=ngaymuon;
		this.ngaytra=ngaytra;
	}
	void muon() {
		System.out.println("tên người mượn"+hoten);
		System.out.println("Mã SV:"+MaSV);
		System.out.println("mượn sách số:"+sachdamuon);
		System.out.println("ngày mượn:"+ngaymuon);
		System.out.println("tháng :"+thangmuon);
		System.out.println("năm:"+nammuon);
		System.out.println("ngày trả:"+ngaytra);
		System.out.println("tháng"+thangtra);
		
	}
	void tra() {
		System.out.println("tên người trả"+hoten);
		System.out.println("Mã SV:"+MaSV);
		System.out.println("trả sách số:"+sachdamuon);
		System.out.println("ngày đã mượn:"+ngaymuon);
		System.out.println("tháng :"+thangmuon);
		System.out.println("năm:"+nammuon);
	}
	void hien1() {
		Scanner ip=new Scanner(System.in);
		Date ngay= new Date();
		System.out.println("tên người mượn: ");
		String hoten=ip.nextLine();
		System.out.println("Mã SV:");
		int MaSV=ip.nextInt();
		System.out.println("mượn sách số:");
		int sachdamuon= ip.nextInt();
		System.out.println("ngày mượn:");
		int ngaymuon=ip.nextInt();
		System.out.println("tháng:");
		int thangmuon=ip.nextInt();
		System.out.println("năm:");
		int nammuon=ip.nextInt();
		System.out.println("ngày trả:");
		int ngaytra=ip.nextInt();
		System.out.println("tháng:");
		int thangtra=ip.nextInt();
		System.out.println("năm:");
		int namtra=ip.nextInt();
		
	}
	void hien2() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Tên người trả sách: ");
		String hoten=ip.nextLine();
		System.out.println("Mã SV:");
		int MaSV=ip.nextInt();
		System.out.println("Đã mượn sách số:");
		int sachdamuon= ip.nextInt();
		System.out.println("Ngày đã mượn:");
		int ngaymuon=ip.nextInt();
		System.out.println("Tháng:");
		int thangmuon=ip.nextInt();
		System.out.println("Năm:");
		int nammuon=ip.nextInt();
		
	}
	
}


