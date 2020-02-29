package Assignment6;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {
	private String title;
	private ArrayList<Integer> ratings; 
	
	Mreview(){
		this.title="";
		this.ratings=new ArrayList<Integer>();
	}
	
	Mreview(String title){
		this.title=title;
		this.ratings=new ArrayList<Integer>();
		
	}
	
	Mreview(String title, int firstRating){
		this.title=title;
		this.ratings=new ArrayList<>(1);
		ratings.add(firstRating);
		
	}
	
	public void addRating(int r) {
		ratings.add(r);
	}
	
	public double aveRating() {
		int size=ratings.size();
		double total=0;
		for(int i=0;i<size;i++) {
			total+=ratings.get(i);
		}
		return total/size;
	}
	
	@Override
	public int compareTo(Mreview obj) {
		return this.title.compareTo(obj.title);
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		Mreview movieobj = (Mreview)obj;
		return this.title.toLowerCase().compareTo(movieobj.title.toLowerCase())==0;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public int numRatings() {
		return ratings.size();
	}
	
	@Override
	public String toString() {
		if(numRatings()==0) {
			String title=getTitle();
			return title+" doesn't have a rating";
		}
		double aveRating=aveRating();
		int size=numRatings();
		return title + ',' + " average "+ aveRating+ " out of " + size;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mreview m1=new Mreview("kill Bill");
		//Mreview m2=new Mreview("kill Bills",1);
		//System.out.print(m1.equals(m2));
		//System.out.print(m1.getTitle());
		m1.addRating(1);
		m1.addRating(2);
		m1.addRating(3);
		System.out.print(m1.toString());
		
	}

}
