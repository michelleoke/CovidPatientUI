import javafx.geometry.Pos; 
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.*; 
import javafx.stage.Stage; 
import javafx.scene.control.Alert.AlertType; 
import java.time.LocalDate; 



//Author: Michelle Oluwabunmi Oke - moke052@uottawa.ca
public class ContactListPane extends Pane{
	public ContactListPane(String title){
		//Create new pane
		Pane contactListPane = new Pane(); 
		contactListPane.setStyle("-fx-background-color: white; " + "-fx-border-color: gray; " + "-fx-padding: 4 4;"); // margin spacing at bottom right
		// Create the labels, textfields, buttons

		TextField name1 = new TextField(); 
		name1.relocate(10, 20); 
		name1.setPrefSize(150, 30);
		TextField name2 = new TextField(); 
		name2.relocate(10, 50); 
		name2.setPrefSize(150, 30);
		TextField name3 = new TextField(); 
		name3.relocate(10, 80); 
		name3.setPrefSize(150, 30);
		TextField name4 = new TextField(); 
		name4.relocate(10, 110); 
		name4.setPrefSize(150, 30);
		TextField name5 = new TextField(); 
		name5.relocate(10, 140); 
		name5.setPrefSize(150, 30);
		TextField name6 = new TextField(); 
		name6.relocate(10, 170); 
		name6.setPrefSize(150, 30);

		Button button2 = new Button("Add"); 
		button2.relocate(10, 200); 
		button2.setPrefSize(100, 30); 
		button2.setOnAction( new EventHandler<ActionEvent>() { //Getting the button to print the information inputted
			public void handle(ActionEvent actionEvent) {
				System.out.println("Contact Trace:");

				if (name1.getText().length() > 0) {
					System.out.println(name1.getText());
				}
				if (name2.getText().length() > 0) {
					System.out.println(name2.getText());
				}
				if (name3.getText().length() > 0) {
					System.out.println(name3.getText());
				}
				if (name4.getText().length() > 0) {
					System.out.println(name4.getText());
				}
				if (name5.getText().length() > 0) {
					System.out.println(name5.getText());
				}
				if (name6.getText().length() > 0) {
					System.out.println(name6.getText());
				}
			} 

		});
		contactListPane.getChildren().addAll(name1, name2, name3, name4 ,name5, name6, button2); // adding all the components to the pane

		//creating the title label
		Label titleLabel = new Label(); 
		titleLabel.setText(title);
		titleLabel.setStyle("-fx-background-color: white; \n" + "-fx-translate-y: -8; \n" + "-fx-translate-x: 10;");
		getChildren().addAll(contactListPane, titleLabel);
	}
}
