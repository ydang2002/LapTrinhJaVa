package BaiTapJaVa;

import java.util.Scanner;

public class TinhTongChuSo {
	
	public int tinhTongChhuSo(int n) {
		int soDu, tong = 0;
		while(n > 0) {
			soDu = n % 10;
			n = n / 10;
			tong = tong + soDu;
		}
		return tong;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap so nguyen: ");
		int Tong = 0;
		int n = sc.nextInt();
		TinhTongChuSo tinhTongChuSo = new TinhTongChuSo();
		Tong = tinhTongChuSo.tinhTongChhuSo(n);
		System.out.println(+Tong);
		

	}

}
