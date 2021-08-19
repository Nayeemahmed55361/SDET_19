package Com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider="getValues")
  public void data(String S1, String S2)
  {
		System.out.println(S1+"+S2");
  }
	@DataProvider
	public Object[][] getValues()
	{
		Object[][] arr=new Object[5][2];
		arr[0][0]="nayeem1";
		arr[0][1]="ahmed1";
		arr[1][0]="nayeem2";
		arr[1][1]="ahmed2";
		arr[2][0]="nayeem3";
		arr[2][1]="ahmed3";
		arr[3][0]="nayeem4";
		arr[3][1]="ahmed4";
		arr[4][0]="nayeem5";
		arr[4][1]="ahmed5";
		return arr;
		
	}
}
