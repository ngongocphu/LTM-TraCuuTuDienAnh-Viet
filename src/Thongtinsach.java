
public class Thongtinsach extends Quanlimuontrasach {
	String tensach;
	String theloai;
	String tacgia;
	
	public Thongtinsach() {
		
	}
	public Thongtinsach(String tensach,String theloai,String tacgia) {
		this.tacgia=tacgia;
		this.tensach=tensach;
		this.theloai=theloai;
	}
	void nhap() {
		System.out.println("nhap ten sach:"+tensach);
		System.out.println("nhap the loai:"+theloai);
		System.out.println("nhap tac gia:"+tacgia);
		
	}
	void hien() {
		
		System.out.println("STT\tTên sách\t\t Thể loại\tTác giả\n");
		System.out.println("1\tĐắc nhân tâm\t\tGiáo dục\tDale Carnegie");
		System.out.println("2\tVợ nhặt\t\t\tTruyện ngắn\tKim Lân");
		System.out.println("3\tTruyện kiều\t\tThơ Nôm\t\tNguyễn Du");
		System.out.println("4\tDế mèn phiêu lưu kí\tVăn xuôi\tDế mèn phiêu lưu kí");
		System.out.println("5\tChí phèo\t\tTruyện ngắn\tNam Cao");
		System.out.println("6\tCái xó bếp\t\tTruyện ngắn\tLê Văn Trương");
		System.out.println("7\tĐôi mắt\t\t\tTruyện ngắn\tNam Cao");
		System.out.println("8\tTắt đèn\t\t\tVăn xuôi\tNgô Tất Tố");
		System.out.println("9\tSố đỏ\t\t\tTruyện ngẵn\tVũ Trọng Phụng");
		System.out.println("10\tNhững ngày thơ ấu\tTruyện ngắn\tNguyên Hồng");
		System.out.println("11\tKiêu hãnh và định kiến\tVăn xuôi\tJane Austen");
		System.out.println("12\tJane eyre\t\tTruyện ngắn\tCharlotte Brote");
		System.out.println("13\t1984\t\t\tTruyện ngắn\t George Orwell ");
		System.out.println("14\tGatsby Vĩ Đại\t\tTruyện ngắn\tF.Scott Fitzgerard");
		System.out.println("15\tBá tước Monte Cristo\tVăn xuôi\tAlexandre Dumas");
		System.out.println("16\tĐôn Kihôtê\t\tTruyện ngắn\tSaavedra");
		System.out.println("17\tNhững người khốn khổ\tTiểu thuyết\tVictor Hugo");  
		System.out.println("18\tNhà giả kim\t\tTiểu thuyết\tPaulo Coelho");
		System.out.println("19\tĐồi gió hú\t\tTiểu thuyết\tEmily Bronte");
		System.out.println("20\tBắt trẻ đồng xanh\tTiểu thuyết\tJ.D Salinger\n");
		
	}
}

