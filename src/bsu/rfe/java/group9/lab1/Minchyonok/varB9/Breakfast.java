package bsu.rfe.java.group9.lab1.Minchyonok.varB9;

public class Breakfast {
	
	public static void main(String[] args) throws Exception {
	// Определение ссылок на продукты завтрака
	Food[] breakfast = new Food[20];
	// Анализ аргументов командной строки и создание для них
	// экземпляров соответствующих классов для завтрака
	int itemsSoFar = 0;  
      String[] v6 = args;
      int OverallTheNumbersEggs = args.length;

      int OverallTheNumbersApple;
      for(OverallTheNumbersApple = 0; OverallTheNumbersApple < OverallTheNumbersEggs; ++OverallTheNumbersApple) {
         String arg = v6[OverallTheNumbersApple];
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
			breakfast[itemsSoFar] = new Eggs(parts[1]);}
	// ... Продолжается анализ других продуктов для завтрака
	itemsSoFar++;
	}
	// Перебор всех элементов массива
	 int OverallTheNumbersCheese = 0;
      OverallTheNumbersApple = 0;
      OverallTheNumbersEggs = 0;
      Cheese overalCheese = new Cheese(null);
      Apple overalApple = new Apple("Яблоко");
      Eggs overalEggs = new Eggs("Яйца");
      Food[] v2 = breakfast;
     int v1 = breakfast.length;
	Food item;
     int v0;
     for(v0 = 0; v0 < v1; ++v0) {
        int k=1;
    	 item = v2[v0];
        if (item != null) {
           if (item.equals(overalApple)) {
              ++OverallTheNumbersApple;
           }

           if (item.equals(overalCheese)) {
        	   
              ++OverallTheNumbersCheese;
           }

           if (item.equals(overalEggs)) {
        	  k++;
              OverallTheNumbersEggs=OverallTheNumbersEggs+k;
              
           }
        }
     }

     v2 = breakfast;
     v1 = breakfast.length;

     for(v0 = 0; v0 < v1; ++v0) {
        item = v2[v0];
        if (item == null) {
           break;
        }
       
	// Если элемент не null – употребить продукт
	item.consume();}

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
	}
	
