package application;

public class Dog {
	String Name;
	String Breed; //Порода
	public Dog(String name, String breed, int age, String owner, int price) {
		super();
		Name = name;
		Breed = breed;
		Age = age;
		Owner = owner;
		Price = price;
	}
	int Age;
	String Owner; //Владелец
	int Price;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}

}
