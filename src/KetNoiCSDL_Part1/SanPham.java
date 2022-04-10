package KetNoiCSDL_Part1;

import java.util.Scanner;

public class SanPham {
	private String maSP,tenSP,maLoaiSP;
	private int gia;
	
	public SanPham() {
	
	}

	public SanPham(String maSP, String tenSP, String maLoaiSP, int gia) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.maLoaiSP = maLoaiSP;
		this.gia = gia;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getMaLoaiSP() {
		return maLoaiSP;
	}

	public void setMaLoaiSP(String maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "SanPham [MaSP=" + maSP + ", TenSP=" + tenSP + ", MaLoaiSP=" + maLoaiSP + ", Gia=" + gia + "]";
	}
	
	public void display() {
        System.out.println(this);
    }
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma san pham: ");
		maSP = scan.nextLine();
		
		System.out.println("Nhap ten san pham");
		tenSP = scan.nextLine();
		
		/*System.out.println("Nhap ma loai san pham");
		maLoaiSP = scan.nextLine();*/
		
		System.out.println("Nhap gia tien");
		gia = scan.nextInt();
		
	}

}
