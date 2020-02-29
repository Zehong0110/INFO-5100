package Assignment6;

import java.util.Calendar;

public class Cat extends Pet implements Boardable {

	private String hairLength;
	int StartMon, StartDay, StartYear;
	int EndMon, EndDay, EndYear;

	Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}

	public String getHairLength() {
		return this.hairLength;
	}

	public String toString() {
		return "CAT" + ":\n" + super.toString() + "\nHair:" + getHairLength();
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		this.StartMon = month;
		this.StartDay = day;
		this.StartYear = year;
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		this.EndMon = month;
		this.EndDay = day;
		this.EndYear = year;

	}

	@Override
	public boolean boarding(int month, int day, int year) {

		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		Calendar start = Calendar.getInstance();
		start.set(StartYear, StartMon, StartDay);
		Calendar end = Calendar.getInstance();
		end.set(EndYear, EndMon, EndDay);
		if ((c.compareTo(start) < 0) || (c.compareTo(end)>0))
			return false;
		else
			return true;

	}
	
	public static void main(String[] argus) {
		
		Cat c=new Cat("xiaohua", "zehong", "black", "short");
		System.out.println(c.toString());
		
		c.setBoardStart(2,3,1992);
		c.setBoardEnd(1, 5, 1995);
		System.out.println(c.boarding(3,4,1993));
		
	}

}
