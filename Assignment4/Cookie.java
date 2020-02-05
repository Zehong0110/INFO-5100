package Assignment4;

public class Cookie extends DessertItem {
	int number;
	float pricePerDozen;
	
	public Cookie(String name, int number, float pricePerDozen){
		super(name);
		this.number=number;
		this.pricePerDozen=pricePerDozen;
	}
	
	@Override
	public float getCost(){
		float cost=this.number*this.pricePerDozen/12;
		return Math.round(cost);
		
	}
	
	//override toString method print object
	public String toString(){	
			
			String head = number+" lbs. @ "+DessertShoppe.cents2dollarsAndCentsmethod(pricePerDozen)+" /lb " + "\n";
			String cost = DessertShoppe.cents2dollarsAndCentsmethod(getCost());
			String[] splitStr=name.split("\\s+");
			if (splitStr.length==1) {
			return head+this.name+"\t\t\t\t"+cost;
			}
			else if(splitStr.length==2) {
				return head+this.name+"\t\t\t"+cost;
			}
			else
			{return head+this.name+"\t\t"+cost;}
			
		}

}
