package BarcodeReader;

import java.util.Scanner;

public class BarcodeReaderByInput  implements Reader {

	public int readBarcode() {
		
		System.out.println("Please insert the desired barcode: ");
		
		Scanner scanner = new Scanner(System.in);
		
		return scanner.nextInt();
		
	}

}
