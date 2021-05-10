package Excelread;

import java.io.IOException;

public class ExcelMain {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	ExcelCode ec=new ExcelCode();
		String data=ec.readData(1,1);
		System.out.println(data);
		for (int i=0;i<ec.rowSize();i++) {
			for(int j=0;j<2;j++) {
				String n=ec.readData(i, j);
				System.out.println(n);
			}
		}
		
	
	}
		
	}
	

