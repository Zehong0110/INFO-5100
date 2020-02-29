package Assignment6;

public class Pet {
	private String PetName;
	private String OwnerName;
	private String Color;
	protected int Sex;
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	public static final int SPAYED = 2;
	public static final int NEUTERED = 3;

	Pet(String name, String ownerName, String color) {
		this.PetName = name;
		this.OwnerName = ownerName;
		this.Color = color;
	}

	public String getPetName() {
		return this.PetName;
	}

	public String getOwnerName() {
		return this.OwnerName;
	}

	public String getColor() {
		return this.Color;
	}

	public void setSex(int sexid) {
		this.Sex = sexid;
	}

	public String getSex() {
		switch (this.Sex) {

		case 1:
			return "MALE";
		case 2:
			return "FEMALE";
		case 3:
			return "SPAYED";
		case 4:
			return "NEUTERED";
		default:
			return "Not Sure";

		}

	}

	public String toString() {
		return this.PetName + " owned by " + this.OwnerName + "\nColor: " + getColor() + "\nSex: " + getSex();
	}
	
	public static void main(String[] argus) {
		
		Pet p=new Pet("dahuang", "zehong", "yellow");
		p.setSex(1);
		p.toString();
		System.out.print(p.toString());
		
	}

}
