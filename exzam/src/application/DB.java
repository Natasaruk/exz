package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DB {
	public static ObservableList<Dog> dog=FXCollections.observableArrayList();
	static {
		DB.dog.add(new Dog("����","�������",3,"������",100));
		DB.dog.add(new Dog("�����","��������",8,"����������",150));
		
	}
}
