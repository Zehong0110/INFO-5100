package Assignment4;

public class Sundae extends IceCream{
	float costOftopping;
	String topping;
	
	public Sundae(String name, float cost,String topping, float costOftopping) {
		super(name,cost);
		this.topping=topping;
		this.costOftopping=costOftopping;
		
	}
	
	@Override
	public float getCost() {
		return this.cost+this.costOftopping;
		
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
