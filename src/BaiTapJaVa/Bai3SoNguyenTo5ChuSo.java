package BaiTapJaVa;

public class Bai3SoNguyenTo5ChuSo {
	public static int KTSoNguyenTo(long n)
	{
	    if (n<2)
	    {
	        return 0;
	    }
	    
	        for (int i = 2; i < n; i++)
	        {
	            if (n % i == 0)
	            {
	                return 0;
	            }
	        }
	    
	    return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bai3SoNguyenTo5ChuSo bai3SoNguyenTo5ChuSo = new Bai3SoNguyenTo5ChuSo();
		System.out.println("so nguyen to co 5 chu so la: ");
		for(long i=10000; i<100000;i++) {
			if(KTSoNguyenTo(i)==1) {
				System.out.println(i);
			}
		}
	}

}
