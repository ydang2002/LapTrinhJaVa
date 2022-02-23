package BaiTapJaVa;

import java.util.Scanner;

public class Bai5TuDaiNhatVaViTri {

	public static void main(String[] args) {
		nhap();

	}

	static void nhap() {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.print("Xau vua nhap: "+ s+"\n");
		timTuDaiNhat(s);
	}
	
	static void timTuDaiNhat(String s) {
		int [] len;
		String[] ss;
		ss = s.split(" ");
		len = new int[ss.length];
		int max = 0;
		for(int i = 0; i< ss.length; i++) {
			int l = ss[i].length();
			len[i] = l;
			if(l>max) max =l;
		}
		int count = 0;
		for(int i = 0;i< ss.length;i++) {
			if(len[i] == max) {
				System.out.print(ss[i]);
				System.out.println(" vi tri: "+count);
			}
			count = count + len[i] + 1;
		}
	}

}
