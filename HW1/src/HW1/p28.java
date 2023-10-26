package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p28 {

	public static void main(String[] args)throws IOException 
	{
		
		System.out.print("請輪入一個整數");
		
		BufferedReader br1 = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		
		int num = Integer.parseInt(str1);
		
		System.out.print("您輪入的數字是：" + num+"\n請輪入字串：");
		BufferedReader br2 = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = br2.readLine();
		
		System.out.print("剛剛輪入的字串是" + str2);
			
	}

}
