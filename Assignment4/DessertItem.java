package Assignment4;

public abstract class DessertItem {
	String name;
	
	DessertItem(){
		
	}
	
	public DessertItem(String name) {
		this.name=name;
	}
	
	public abstract float getCost(); 
	
	

}
