package interfaceTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.util.LinkedList;

public class CSVReader implements ReadTestingData  {
	
	@Override
	public void read(String dataInfo) {
		try (Scanner scan = new Scanner(new File(dataInfo));) {
			while(scan.hasNextLine()) {
				String line = scan.next();
				String[] data = line.split(",");
				for(int i=0; i<data.length; i++) {
					System.out.println(data[i] + " ");
				}
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
