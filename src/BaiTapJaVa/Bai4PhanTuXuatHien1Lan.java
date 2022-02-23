package BaiTapJaVa;

import java.util.Scanner;

public class Bai4PhanTuXuatHien1Lan {
	
	public static void NhapMang(int n,int a[]){
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<n; i++){
			System.out.print("\nnhap phan tu thu a["+i+"]: ");
			a[i]=scanner.nextInt();
		}
	}
	
	public static void InPhanTuXuatHien1Lan(int n, int a[]) {
		/*for(int i = 0;i<n-1;i++) {
			for(int j =i+1; j<n; j++) {
				if(a[i] != a[j]) {
					System.out.println(a[i]);
				}
			}
		}*/
		System.out.println("Phan tu xuat hien dung 1 lan: ");
		int i,j,dem;
	    for(i=0;i<n;i++)
	    {
	       dem =0;
	       for(j=0;j<n;j++)
	       {
	           if(a[i]==a[j]&&i!=j)
	              dem =1;
	       }
	       if(dem==0)
	          System.out.println(a[i]);
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap so phan tu: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		NhapMang(n,a);
		InPhanTuXuatHien1Lan(n,a);
	}

}
