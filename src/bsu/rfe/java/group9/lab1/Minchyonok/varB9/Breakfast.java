package bsu.rfe.java.group9.lab1.Minchyonok.varB9;
public class Breakfast {
	public static void main(String[] args) throws Exception {
	// Определение ссылок на продукты завтрака
	Food[] breakfast = new Food[20];
	// Анализ аргументов командной строки и создание для них
	// экземпляров соответствующих классов для завтрака
	int itemsSoFar = 0;  
        int t=0;
	for (String arg: args)  {
	String[] parts = arg.split("/");
	if (parts[0].equals("Cheese")) {
	// У сыра дополнительных параметров нет
	breakfast[itemsSoFar] = new Cheese(null);
	} else
	if (parts[0].equals("Apple")) {
	// У яблока – 1 параметр, который находится в parts[1]
	breakfast[itemsSoFar] = new Apple(parts[1]);
	} else
		if (parts[0].equals("Eggs")) {
			breakfast[itemsSoFar] = new Eggs(parts[1]);
			 t=getNumberFromParam(parts[1])+t;
			;}
	// ... Продолжается анализ других продуктов для завтрака
	itemsSoFar++;
	}
	
	int OverallTheNumbersCheese = 0;
	int OverallTheNumbersApple = 0;
	int OverallTheNumbersEggs = 0;
	Cheese overalCheese = new Cheese(null);
	Apple overalApple = new Apple("Яблоко");
	Eggs overalEggs = new Eggs("Яйцо");
	Food item;
	int v0;

	for(v0 = 0; v0 < breakfast.length; ++v0) {
		item = breakfast[v0];
		if (item != null) {
			if (item.equals(overalApple)) {
				OverallTheNumbersApple++;
			} else if (item.equals(overalCheese)) {
				OverallTheNumbersCheese++;
			} else if (item.equals(overalEggs)) {			
				
				OverallTheNumbersEggs=t;
			}

			// Если элемент не null - употребить продукт
			item.consume();
		} else {
			break;
		}
	}

     System.out.println("Всего сыра ");
     System.out.println(OverallTheNumbersCheese);
     System.out.println("Всего яблок");
     System.out.println(OverallTheNumbersApple);
     System.out.println("Всего яиц");
     System.out.println(OverallTheNumbersEggs);
    
		
	// Если дошли до элемента null – значит достигли конца
	// списка продуктов, ведь 20 элементов в массиве было
	// выделено с запасом, и они могут быть не
	// использованы все
	
	System.out.println("Всего хорошего!");
	}
	private static int getNumberFromParam(String param) {
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
