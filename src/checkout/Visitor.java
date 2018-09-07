package checkout;
import user.GoldenUser;
import user.RegularUser;

public interface Visitor {

	public int visit(GoldenUser user, int barcode);
	public int visit(RegularUser user, int barcode);
}
