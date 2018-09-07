package client;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartViewerHashMap implements ShoppingCartViewer{

	Map<Integer, ProductViewer> map = new HashMap<Integer, ProductViewer>();

	@Override
	public void addItem(String str) {
		
	}

	@Override
	public void removeItem(int barCode) {
		
	}
	
	
}
