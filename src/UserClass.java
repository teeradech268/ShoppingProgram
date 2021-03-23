
public class UserClass {

	public static String sUsername;
	public static String sName;
	public static String[] namePro = new String[6];
	public static double[] pricePro = new double[6];
	public static int gototopup;
	public static int countlist;
	public static int countnum;
	public static String namee = "";
	public static String pricee = "" ;

	// Username
	public void setUsername(String username) {
		sUsername = username;

	}

	public static String getUsername() {
		return sUsername;

	}

	// Name
	public void setName(String name) {
		sName = name;
	}

	public static String getName() {
		return sName;
	}

	// countname
	public void setCountNum(int countnum) {
		this.countnum = countnum;
	}

	public static int getCountNum() {
		return countnum;
	}

	// Product
	public void setNameProduct(String namePro) {
		this.namePro[countnum-1] = namePro;
	}

	public static String getNameProduct() {
		if (countlist >= 2) {
			for (int i = 0; i < countlist; i++) {
				namee += namePro[i] + ",";
			}
		}
		else if (countlist == 1)
			namee = namePro[0];
		return namee;
	}

	// product price
	public void setPriceProduct(double pricePro) {
		this.pricePro[countnum-1] = pricePro;
	}

	public static String getPriceProduct() {
		if (countlist >= 2) {
			for (int i = 0; i < countlist; i++) {
				pricee += Double.toString(pricePro[i]) + ",";
			}
		}
		else if (countlist == 1)
			pricee = Double.toString(pricePro[0]);
		return pricee;
	}

	// count for back button from topup
	public void setnumtoTopup(int gototopup) {
		this.gototopup = gototopup;
	}

	public static int getNumtotopup() {
		return gototopup;
	}

	// count to show list in Cart
	public void setCountList(int countlist) {
		this.countlist = countlist;
	}

	public static int getCountList() {
		return countlist;
	}
	
	public void clear(){
		for (int i = 0; i < 6 ; i++){
			this.namePro[i] = "";
			this.pricePro[i] = 0;
		}
	}
}