package bsu.rfe.java.group9.lab1.Minchyonok.varB9;

public class Eggs extends Food {
	private Integer number;
	public Eggs(Integer number) {
		super("яйца");
		this.number=number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consume() {
		System.out.println(this + " съедены");
		// TODO Auto-generated method stub

	}
	public Integer getNumber() {
		return number;
		}
	public void setNumber(Integer number) {
		this.number = number;
		}
	
		@Override
	
		
	public String toString() {
		return super.toString()+ " количеством '" + number + "'";
		}
}

