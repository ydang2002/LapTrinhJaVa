package KetNoiCSDL_Part1;

import java.util.Scanner;

public class LoaiSanPham {
	
	private String tenLoaiSP, maLoaiSP;

	public LoaiSanPham() {
		
	}

	public LoaiSanPham(String tenLoaiSP, String maLoaiSP) {
		this.tenLoaiSP = tenLoaiSP;
		this.maLoaiSP = maLoaiSP;
	}

	public String getTenLoaiSP() {
		return tenLoaiSP;
	}

	public void setTenLoaiSP(String tenLoaiSP) {
		this.tenLoaiSP = tenLoaiSP;
	}

	
	public String getMaLoaiSP() {
		return maLoaiSP;
	}

	public void setMaLoaiSP(String maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}

	@Override
	public String toString() {
		return "LoaiSanPham [tenLoaiSP=" + tenLoaiSP + ", maLoaiSP=" + maLoaiSP + "]";
	}
	
	public void display() {
        System.out.println(this);
    }

	public void input2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ten loai san pham: ");
		tenLoaiSP = scan.nextLine();
		System.out.println("Nhap ma loai san pham");
		maLoaiSP = scan.nextLine();
	}

}
