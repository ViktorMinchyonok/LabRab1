package bsu.rfe.java.group9.lab1.Minchyonok.varB9;

public class Eggs extends Food {
	private String number;
	public Eggs(String number) {
		super("Яйца");
		this.number=number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consume() {
		System.out.println(this + " съедены");
		// TODO Auto-generated method stub

	}
	public String getNumber() {
		return number;
		}
	public void setNumber(String number) {
		this.number = number;
		}
	
		@Override
	
		
	public String toString() {
		return super.toString()+ " количеством '" + number + "'";
		}
}

