package HW3;

public class sp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);
	}

}

/*class Car{
	int num;
	double gas;
	
	void setNumGas(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" +num+ ", 將汽油量設為" +gas);
	}
	
	void show()
	{
		System.out.println("車號是" +num);
		System.out.println("汽車油量" +gas);
	}
}*/