package bsu.rfe.java.group9.lab1.Minchyonok.varB9;

public class Apple extends Food {
   private String size;
	public Apple(String size) {
		super("Яблоко");
		this.size = size;
		// TODO Auto-generated constructor stub
		 
	}
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println(this + " съедено");
	    }
	
	public String getSize() {
		return size;
		}
	public void setSize(String size) {
		this.size = size;
		}
	
		@Override
	
		
	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
		}
}
