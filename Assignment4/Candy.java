package Assignment4;

public class Candy extends DessertItem {
	
	double weight;
	float pricePerPound;
	
	public Candy(String name, double weight, float pricePerPound){
		super(name);
		this.weight=weight;
		this.pricePerPound=pricePerPound;
		
	}
	
	@Override
	public float getCost() {
		double cost=this.weight*this.pricePerPound;
		return Math.round(cost);
		
	}

	
//override toString method print object, i'm hard coding the format
public String toString(){	
		
		String head = weight+" lbs. @ "+DessertShoppe.cents2dollarsAndCentsmethod(pricePerPound)+" /lb " + "\n";
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
