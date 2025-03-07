package customer_and_item;

import java.util.List;

public class customer
{
	private int customerid;
	private String customername;
	private long customerpho;
	private String customeraddtress;
	private List<item> listofItem;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getCustomerpho() {
		return customerpho;
	}
	public void setCustomerpho(long customerpho) {
		this.customerpho = customerpho;
	}
	public String getCustomeraddtress() {
		return customeraddtress;
	}
	public void setCustomeraddress(String customeraddtress) {
		this.customeraddtress = customeraddtress;
	}
	public List<item> getListofItem() {
		return listofItem;
	}
	public void setListofItem(List<item> listofItem) {
		this.listofItem = listofItem;
	}
	@Override
	public String toString() {
		return "customer [customerid=" + customerid + ", customername="
				+ customername + ", customerpho=" + customerpho
				+ ", customeraddtress=" + customeraddtress + ", listofItem="
				+ listofItem + "]";
	}
	public customer() {
		super();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	
	}
	

}
