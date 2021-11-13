package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;

import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;

public class EnterFormController {
	@FXML
	private Button EnterButton;
	@FXML
	private Button RegButton;
	@FXML
	private Button OutButton;
	@FXML
	private PasswordField PassText;
	@FXML
	private TextField LoginText;

	
	ArrayList<Users> users = new ArrayList<Users>();

	// Event Listener on Button[#EnterButton].onAction
	@FXML
	public void Enter(ActionEvent event) {
		// TODO Autogenerated
		
		users.add(new Users("qwerty","12345"));
		users.add(new Users("12345","qwerty"));
				
		for (Users x: users)
		{
			if(LoginText.getText().equals(x.Login)&&PassText.getText().equals(x.Password)) 
			{
				try {
					
					GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("MainForm.fxml"));
					Scene scene = new Scene(root, 600, 400);
					
					Stage addStage = new Stage();
					addStage.setScene(scene);
					
					Stage mainStage = (Stage)(EnterButton.getScene().getWindow());
					addStage.initOwner(mainStage);
					addStage.initModality(Modality.APPLICATION_MODAL);
					addStage.show();
				
				} 
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	// Event Listener on Button[#RegButton].onAction
	@FXML
	public void Reg(ActionEvent event) {
		// TODO Autogenerated
		
		if(s(PassText.getText().toString())) {
			users.add(new Users(LoginText.getText(),PassText.getText()));
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("�������");
			alert.setHeaderText("������������ ������");
			alert.showAndWait();
		};
	}
	// Event Listener on Button[#OutButton].onAction
	@FXML
	public void Out(ActionEvent event) {
		// TODO Autogenerated
		Node sourse=(Node)event.getSource();
		Stage stage=(Stage)sourse.getScene().getWindow();
		stage.close();
	}
	
	Boolean s(String pass)
	{
		char[] chars = pass.toCharArray();
		Character[] ch = new Character[chars.length];
		
		int zaglav=0,cif=0,sim=0;
		for (int i = 0; i < chars.length; i++)
		{
			ch[i] = chars[i];
			if (Character.isUpperCase(chars[i]))
			{
				zaglav++;
			}
			if (!Character.isLetter(chars[i]))
			{
				cif++;
			}
			if (chars[i]=='+'||chars[i]=='{'||chars[i]=='}'||chars[i]=='|'||chars[i]=='*'||chars[i]=='&')
			{
				sim++;
			}
			ch[i] = chars[i];
		}
		if (zaglav<1||cif<1||sim>0||chars.length<4||chars.length>16)
		{
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("������");
			alert.setHeaderText("������ �� ������������� ��������");
			alert.setContentText("������ ������ ��������� �� 4 �� 16 ��������,\r\n"
					+ "��������� ����� � �����,\r\n"
					+ "�� ������ ���� �������� �� ������: * & { } | +\r\n"
					+ "");
			alert.showAndWait();
			return false;
		}
		return true;
	}
}