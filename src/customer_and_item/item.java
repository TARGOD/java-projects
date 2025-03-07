package customer_and_item;

public class item 
{
private int itemId;
private String itemname;
private double price;
private int quantity;
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
@Override
public String toString() {
	return "item [itemId=" + itemId + ", itemname=" + itemname + ", price="
			+ price + ", quantity=" + quantity + "]";
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public item() {
	super();
	
}


}
