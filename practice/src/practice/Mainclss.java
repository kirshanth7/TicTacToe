package practice;

import java.io.FileWriter;

public class Mainclss {

	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("output.txt");
			fw.write("Hello");
			fw.close();
			System.out.println("wow");
		}catch (Exception e) {
			System.out.println("AA");
			System.out
		}

	}

}
