package interfaceTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TXTReader implements ReadTestingData {
	
	@Override
	public void read(String dataInfo) {
		try {
			File file = new File(dataInfo);
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}

	}
	
	@Override
	public void print() {
		
	}
	
	@Override
	public void save() {
		
	}

}
