package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.

		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};*/







//		try {
//			ConnectToSqlDB ct = new ConnectToSqlDB();
//			List<Integer> lowestList = new ArrayList<>(lowestNumber());
//			ct.insertDataFromArrayListToSqlTable(lowestList, "tbl_lowestNumber", "column_lowestNumber");
//			ct.readDataBase("tbl_lowestNumber", "column_lowestNumber");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
////		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
////		for(String st:lowestList){
////			System.out.println(st);
//		}
	}

	public static int lowestNumber(){

		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		int lowest = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (lowest > array[i]) {
				lowest = array[i];
			}
		}
		System.out.println("Smallest number in array is : " + lowest);
		return lowest;
	}


}
