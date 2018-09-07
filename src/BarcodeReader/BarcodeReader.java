package BarcodeReader;

public class BarcodeReader {

	private Reader reader;
	
	public BarcodeReader() {
		this.reader = new BarcodeReaderByInput();
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	
	public int readBarcode() {
		return reader.readBarcode();
	}
}
