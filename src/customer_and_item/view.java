package customer_and_item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class view 
{

	public static void main(String[] args) 
	{
		controller controller=new controller();
		Scanner scan=new Scanner(System.in);
		customer cus=new customer();
		System.out.println("enter the Customer Id");
		int id=scan.nextInt();
		System.out.println("enter the Customer Name");
		String name=scan.next();
		System.out.println("enter the Customer phone number");  
		long phno=scan.nextLong();
		System.out.println("enter the Customer address");
		String address=scan.next();
		
		cus.setCustomeraddress(address);
		cus.setCustomerid(id);
		cus.setCustomerpho(phno);
		cus.setCustomername(name);
		boolean flag=true;
		while(flag){
			System.out.println("1.Add the items\n2.find item by name\n3.update Items \n4.delete Item\n5.display all\n0.exit");
			int choice=scan.nextInt();
			ArrayList<item> listofItems=new ArrayList<item>();
			switch(choice)
			{
			case 1:
				boolean flag3=true;
				while(flag3){
				item Item=new item();
				System.out.println("enter the Item Id");
				int pid=scan.nextInt();
				System.out.println("enter the Item name");
				String pname=scan.next();
				System.out.println("enter the price");
				double price=scan.nextDouble();
				System.out.println("enter the Quantity");
				int quantity=scan.nextInt();
				Item.setQuantity(quantity);
				Item.setItemname(pname);
				Item.setPrice(price);
				Item.setItemId(pid);
				listofItems.add(Item);
				List<item> listofItem;
				cus.setListofItem(listofItems);
				controller.addCustomer(cus);
				System.out.println("Data inserted...!");
				System.out.println("to add other item press 1 else press 0..................");
				int choice1=scan.nextInt();
				if(choice1==0)
				{
					flag3=false;
				}
				}
				break;
			case 2: 
				System.out.println("enter the name of the item:");
				String findname=scan.next();
				item returnedItem=controller.findItembyName(findname);
				System.out.println(returnedItem.getItemId());
				System.out.println(returnedItem.getItemname());
				System.out.println(returnedItem.getPrice());
				System.out.println(returnedItem.getQuantity());
				System.out.println();
			case 3:
				System.out.println("enter the Item name");
				String Updatename=scan.next();
				System.out.println("enter the quantity");
				int updatequan=scan.nextInt();
				controller.UpdateItem(Updatename, updatequan);
				System.out.println("Item updated...!");
				break ;
			case 4:
				System.out.println("enter the item name");
				String delname=scan.next();
				controller.deleteitem(delname);
				System.out.println("item deleted ........!");
				break;
			case 5:
				List<item> items=controller.displayall();
				for(item item2:items){
				System.out.println("Item ID :"+item2.getItemId());
				System.out.println("Item Name :"+item2.getItemname());
				System.out.println("Item Quantity :"+item2.getQuantity());
				System.out.println("Item price:"+item2.getPrice());
				System.out.println();
				}
				break;
			case 0:
				flag=false;
			
				
				default:
					break;	
				
			}
		}

	}

}
