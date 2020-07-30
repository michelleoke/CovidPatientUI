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

public class PatientInfoPane extends Pane{
	public PatientInfoPane(String title){
		Pane patientPane = new Pane(); 
		patientPane.setStyle("-fx-background-color: white; " + "-fx-border-color: gray; " + "-fx-padding: 4 4;"); // margin spacing at bottom right
		// Create the labels and textfields
		Label label1 = new Label("Patient Name:"); 
		label1.relocate(10, 20); 
		label1.setPrefSize(100, 30);
		Label label2 = new Label("Address:"); 
		label2.relocate(10, 55); 
		label2.setPrefSize(100, 30);
		Label label3 = new Label("Phone Number: "); 
		label3.relocate(10, 90);
		label3.setPrefSize(100, 30);
		Label label4 = new Label("Health Number:");
		label4.relocate(10, 125);
		label4.setPrefSize(100, 30);
		
		TextField nameField = new TextField(); 
		nameField.relocate(130, 20); 
		nameField.setPrefSize(250, 30);
		TextField addressField = new TextField(); 
		addressField.relocate(130, 55); 
		addressField.setPrefSize(250, 30);
		TextField phoneNumberField = new TextField(); 
		phoneNumberField.relocate(130, 90); 
		phoneNumberField.setPrefSize(250, 30);
		TextField healthNumberField = new TextField(); 
		healthNumberField.relocate(130, 125); 
		healthNumberField.setPrefSize(250, 30);

		Button button1 = new Button("Add"); 
		button1.relocate(10, 160); 
		button1.setPrefSize(100, 30); 
		button1.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent actionEvent) {
				System.out.println("Patient Information" + "\n\n\n");
				System.out.println(nameField.getText());
			    System.out.println(addressField.getText());
			    System.out.println(phoneNumberField.getText());
			    System.out.println(healthNumberField.getText());
			} 

		});
		
		// Add all labels and textfields to the pane
		patientPane.getChildren().addAll(label1, label2, label3, label4, nameField, addressField, phoneNumberField, healthNumberField, button1);



		Label titleLabel = new Label(); 
		titleLabel.setText(title);
		titleLabel.setStyle("-fx-background-color: white; \n" + "-fx-translate-y: -8; \n" + "-fx-translate-x: 10;");
		getChildren().addAll(patientPane, titleLabel);


	}

}