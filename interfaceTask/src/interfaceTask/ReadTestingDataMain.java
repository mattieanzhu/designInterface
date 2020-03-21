package interfaceTask;

import java.util.Scanner;

public class ReadTestingDataMain {
	private static final CSVReader csvReader = new CSVReader();
	private static final TXTReader txtReader = new TXTReader();
	private static final InputReader inputReader = new InputReader();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dataType;
		System.out.println("Enter data type");
		dataType = scan.nextLine();
		readData(dataType);
	}
	
	public static void readData(String dataType) {
		Scanner scan = new Scanner(System.in);
		if(dataType == "csv") {
			String filePath;
			System.out.println("Enter file path");
			filePath = scan.nextLine();
			csvReader.read(filePath);
		}
		else if(dataType == "txt") {
			String filePath;
			System.out.println("Enter file path");
			filePath = scan.nextLine();
			txtReader.read(filePath);
		}
		else if(dataType == "input") {
			String dataString;
			System.out.println("Enter data String");
			dataString = scan.nextLine();
			inputReader.read(dataString);
		}
		else {
			System.out.println("Error, invalid file type");
		}
	}
}





