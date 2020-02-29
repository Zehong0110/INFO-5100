package Assignment6;

import java.util.Calendar;

public class Dog extends Pet implements Boardable {
	
	private String size;
	int StartMon, StartDay, StartYear;
	int EndMon, EndDay, EndYear;
	
	Dog (String name, String ownerName, String color, String size){
		super(name,ownerName,color);
		this.size=size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public String toString() {
		return "DOG" + ":\n" + super.toString()+"\nSize:"+getSize();
	}
	
	@Override
	public void setBoardStart(int month, int day, int year) {
		this.StartMon=month;
		this.StartDay=day;
		this.StartYear=year;
	}
	
	@Override
	public void setBoardEnd(int month, int day, int year) {
		this.EndMon=month;
		this.EndDay=day;
		this.EndYear=year;
		
	}
	
	@Override
	public boolean boarding(int month, int day, int year) {
		
		Calendar c = Calendar.getInstance();
		//order is different than the parameter		
		c.set(year, month, day);		
		Calendar start= Calendar.getInstance();
		start.set(StartYear, StartMon, StartDay);
		Calendar end= Calendar.getInstance();
		end.set(EndYear, EndMon, EndDay);
		if((c.compareTo(start)<0)||(c.compareTo(end)>0))
				return false;
		else
				return true;
		
	}
	
public static void main(String[] argus) {
		
		Dog d=new Dog("dahuang", "zehong", "black", "short");
		d.setSex(1);
		System.out.println(d.toString());
		
		d.setBoardStart(2,3,1992);
		d.setBoardEnd(1, 5, 1995);
		System.out.println(d.boarding(3,4,1993));
		
	}
	

}
