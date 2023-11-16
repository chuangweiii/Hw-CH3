package HW3;

public class sp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
	}

}

/*class Car{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是" +num);
		System.out.println("汽車油量" +gas);
	}
	
	void showCar()
	{
		System.out.println("開始顯示車子資料");
		this.show();
	}
}*/