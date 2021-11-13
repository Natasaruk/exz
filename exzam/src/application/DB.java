package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DB {
	public static ObservableList<Dog> dog=FXCollections.observableArrayList();
	static {
		DB.dog.add(new Dog("Рекс","Овчарка",3,"Петров",100));
		DB.dog.add(new Dog("Барик","Чихуахуа",8,"Саруханова",150));
		
	}
}
