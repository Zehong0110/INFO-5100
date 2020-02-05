package Assignment4;

public class IceCream extends DessertItem{
	
	float cost;
	
	public IceCream(String name, float cost) {
		super(name);
		this.cost=cost;
	}
	
	@Override
	public float getCost() {
		return this.cost;
	}
	
	//override toString method print object
	public String toString(){	
			
			
			String cost = DessertShoppe.cents2dollarsAndCentsmethod(getCost());
			String[] splitStr=name.split("\\s+");
			if (splitStr.length==1) {
			return this.name+"\t\t\t\t"+cost;
			}
			else if(splitStr.length==2) {
				return this.name+"\t\t\t"+cost;
			}
			else
			{return this.name+"\t\t"+cost;}
			//return this.name+"\t\t"+cost;
			
		}

	

}
