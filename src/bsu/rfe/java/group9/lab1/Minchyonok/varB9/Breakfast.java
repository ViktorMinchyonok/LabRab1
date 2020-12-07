package bsu.rfe.java.group9.lab1.Minchyonok.varB9;

public class Breakfast {
	
	public static void main(String[] args) throws Exception {
	// Определение ссылок на продукты завтрака
	Food[] breakfast = new Food[20];
	// Анализ аргументов командной строки и создание для них
	// экземпляров соответствующих классов для завтрака
	int itemsSoFar = 0;  
    int t=0;
    int z=0;
    int r=0;
	for (String arg: args)  {
	String[] parts = arg.split("/");
	if (parts[0].equals("Cheese")) {
	// У сыра дополнительных параметров нет
	breakfast[itemsSoFar] = new Cheese(null);
	r++;
	} else
	if (parts[0].equals("Apple")) {
	// У яблока – 1 параметр, который находится в parts[1]
	breakfast[itemsSoFar] = new Apple(parts[1]);
	z++;
	} else
		if (parts[0].equals("Eggs")) {
			breakfast[itemsSoFar] = new Eggs(parts[1]);
			 t=getNumberFromParam(parts[1])+t;
			;}
	// ... Продолжается анализ других продуктов для завтрака
	itemsSoFar++;
	}
	// Перебор всех элементов массива
	for (Food item: breakfast)
		if (item!=null)
		// Если элемент не null – употребить продукт
		item.consume();
		else
		// Если дошли до элемента null – значит достигли конца
		// списка продуктов, ведь 20 элементов в массиве было
		// выделено с запасом, и они могут быть не
		// использованы все
		break;
	

     System.out.println("Всего сыра ");
     System.out.println(r);
     System.out.println("Всего яблок");
     System.out.println(z);
     System.out.println("Всего яиц");
     System.out.println(t);
   
		
	// Если дошли до элемента null – значит достигли конца
	// списка продуктов, ведь 20 элементов в массиве было
	// выделено с запасом, и они могут быть не
	// использованы все
	
	System.out.println("Всего хорошего!");
	}
	
	private static Integer getNumberFromParam(String param) {
		switch (param.toLowerCase()) {
		case "одно":
			return 1;
		case "два":
			return 2;
		case "три":
			return 3; 

		default:
			System.out.println("Неопределенное количество яиц!");
			break;
		}
		return 0;
	}
}
