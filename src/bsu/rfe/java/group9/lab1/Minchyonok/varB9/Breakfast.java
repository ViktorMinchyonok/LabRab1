package bsu.rfe.java.group9.lab1.Minchyonok.varB9;

public class Breakfast {
	
	public static void main(String[] args) throws Exception {
	// ����������� ������ �� �������� ��������
	Food[] breakfast = new Food[20];
	// ������ ���������� ��������� ������ � �������� ��� ���
	// ����������� ��������������� ������� ��� ��������
	int itemsSoFar = 0;  

	for (String arg: args)  {
	String[] parts = arg.split("/");
	if (parts[0].equals("Cheese")) {
	// � ���� �������������� ���������� ���
	breakfast[itemsSoFar] = new Cheese(null);
	} else
	if (parts[0].equals("Apple")) {
	// � ������ � 1 ��������, ������� ��������� � parts[1]
	breakfast[itemsSoFar] = new Apple(parts[1]);
	} else
		if (parts[0].equals("Eggs")) {
			breakfast[itemsSoFar] = new Eggs(getNumberFromParam(parts[1]));
			;}
	// ... ������������ ������ ������ ��������� ��� ��������
	itemsSoFar++;
	}
	// ������� ���� ��������� �������
	int OverallTheNumbersCheese = 0;
	int OverallTheNumbersApple = 0;
	int OverallTheNumbersEggs = 0;
	Cheese overalCheese = new Cheese(null);
	Apple overalApple = new Apple("������");
	Eggs overalEggs = new Eggs(0);
	Food item;
	int v0;

	for(v0 = 0; v0 < breakfast.length; ++v0) {
		item = breakfast[v0];
		if (item != null) {
			if (item.equals(overalApple)) {
				++OverallTheNumbersApple;
			} else if (item.equals(overalCheese)) {
				++OverallTheNumbersCheese;
			} else if (item.equals(overalEggs)) {
				OverallTheNumbersEggs=((Eggs)item).getNumber()+OverallTheNumbersEggs;
			}

			// ���� ������� �� null - ���������� �������
			item.consume();
		} else {
			break;
		}
	}

     System.out.println("����� ���� ");
     System.out.println(OverallTheNumbersCheese);
     System.out.println("����� �����");
     System.out.println(OverallTheNumbersApple);
     System.out.println("����� ���");
     System.out.println(OverallTheNumbersEggs);
    
		
	// ���� ����� �� �������� null � ������ �������� �����
	// ������ ���������, ���� 20 ��������� � ������� ����
	// �������� � �������, � ��� ����� ���� ��
	// ������������ ���
	
	System.out.println("����� ��������!");
	}
	private static Integer getNumberFromParam(String param) {
		switch (param.toLowerCase()) {
		case "����":
			return 1;
		case "���":
			return 2;
		case "���":
			return 3; 

		default:
			System.out.println("�������������� ���������� ���!");
			break;
		}
		return 0;
	}
}