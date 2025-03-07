package customer_and_item;

import java.util.List;

public class controller
{
	customer Customer=new customer();
	public void addCustomer(customer Cus)
	{
		
		Customer=Cus;
	}
	public item findItembyName(String name)
	{
		List<item> list=Customer.getListofItem();
		for (item item : list) {
			if(item.getItemname().equalsIgnoreCase(name)){
				return item;	
			}
		
		}
		return null;
	}
	public void UpdateItem(String name, int quantity)
	{
		item Items= findItembyName(name);
		if (Items !=null)
		{
			Items.setQuantity(quantity);
		}
	}
	public void deleteitem(String name)
	{
		item deleteitem=findItembyName(name);
		if(deleteitem !=null)
		{
			Customer.getListofItem().remove(deleteitem);
					
		}
	}
	public List<item> displayall(){
		
		List<item> Item=Customer.getListofItem();
		return Item;
	}
}
