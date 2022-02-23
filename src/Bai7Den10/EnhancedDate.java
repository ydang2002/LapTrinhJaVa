package Bai7Den10;
/*link tham khao: https://www.howkteam.vn/course/viet-chuong-trinh-so-sanh-2-thoi-gian-nhap-vao-va-in-ra-ket-qua/tim-ngay-truoc-va-sau-cua-mot-ngay-1306*/
public class EnhancedDate extends Date{
	public EnhancedDate() {
		
	}
	
	public EnhancedDate(int day, int month, int year) {
		super(day, month, year);
	}
	// ham kiem tra co phai nam nhuan k
	public boolean isLeapYear(int year) {
		if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)){
			return true;
		}else return false;
	}
	
	//ham tra ve so ngay trong thang nam cho truoc
	public int tinhSoNgayTrongThang(int month, int year) {
		int soNgay = 0;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			soNgay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			soNgay = 30;
			break;
		case 2:
				if(isLeapYear(year)) {
					soNgay = 29;
				}else {
					soNgay = 28;
				}
				break;
		}
		return soNgay;
	}
	
	//ham kiem tra ngay co hop le khong
	public boolean isValidDate(int day, int month, int year) {
		if(year < 0) {
			return false;
		}
		
		if(month < 1 || month > 12) {
			return false;
		}
		
		if(day <1 || day > tinhSoNgayTrongThang(month, year)) {
			return false;
		}
		return true;
	}
	
	public void prevDay(int day, int month, int year) {
		day--;
		if(day == 0) {
			month--;
			if(month == 0) {
				month = 12;
				year--;
			}
			day = tinhSoNgayTrongThang(month, year);
		}
	}
	
	public void nextDay(int day, int month, int year) {
		day++;
		if(day > tinhSoNgayTrongThang(month, year)) {
			day = 1;
			month++;
			if(month > 12) {
				month = 1;
				year++;
			}
		}
	}
	/*https://mkyong.com/java/how-to-compare-dates-in-java/*/
	public int compareTo(Date date1, Date date2) {
		int ketQua = date1.compareTo(date2);
		if(ketQua == 0) { 
			return 0;
		}else if(ketQua > 0) {
			return 1;
		}
		return -1;
		
	}
	
	public void nhapNgayThangNam() {
		
	}
}/*https://helpex.vn/question/lam-the-nao-de-so-sanh-ngay-trong-java-ban-sao-5cb1674dae03f6169c9e680e*/
