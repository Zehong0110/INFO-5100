package Assignment4;

import java.util.ArrayList;

public class Checkout {
	
	ArrayList<DessertItem> items=new ArrayList<DessertItem>();
	
	public Checkout()
	{
	
	}
	
	public ArrayList<DessertItem> enterItem(DessertItem dessertItem) {
		items.add(dessertItem);
		
		return items;
		
	}
	
	public int numberOfItems() {
		return items.size();
	}
	
	public void clear() {
		items.clear();
	}
	
	public float totalCost() {
		float totalBeforeTax=0;
		for(DessertItem item:items) {
			totalBeforeTax+=item.getCost();
			
		}
		return totalBeforeTax;
	}
	
	public float totalTax(){
		float totalTax=0;
		for(DessertItem item:items){
			totalTax+=(item.getCost()*(DessertShoppe.taxRate));
			
		}
		
		return totalTax;
		
		
	}	
	
	public String toString(){
		String receipt="\t"+DessertShoppe.storeName+"\t\n\t"+"- - - - - - - - - -\n";
		for(DessertItem item:items){
			receipt=receipt+item.toString()+"\n";
		}
		receipt=receipt+"Tax\t\t\t\t"+DessertShoppe.cents2dollarsAndCentsmethod(totalTax())+"\nTotal Cost\t\t\t"+DessertShoppe.cents2dollarsAndCentsmethod(totalCost()+totalTax());
		return receipt;
		
	}
	

}
