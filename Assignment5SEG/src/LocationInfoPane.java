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

public class LocationInfoPane extends Pane{
	public LocationInfoPane(String title){
		Pane locationPane = new Pane(); 
		locationPane.setStyle("-fx-background-color: white; " + "-fx-border-color: gray; " + "-fx-padding: 4 4;"); // margin spacing at bottom right
		// Create the labels and textfields
		Label label1 = new Label("Test Location"); 
		label1.relocate(10, 20); 
		label1.setPrefSize(100, 30);
		Label label2 = new Label("Laboratory"); 
		label2.relocate(10, 55); 
		label2.setPrefSize(100, 30);
		Label label3 = new Label("Test Date"); 
		label3.relocate(10, 90);
		label3.setPrefSize(100, 30);
		Label label4 = new Label("Result Date");
		label4.relocate(10, 125);
		label4.setPrefSize(100, 30);
		
		TextField testLocation = new TextField(); 
		testLocation.relocate(130, 20); 
		testLocation.setPrefSize(200, 30);
		TextField laboratory = new TextField(); 
		laboratory.relocate(130, 55); 
		laboratory.setPrefSize(200, 30);
		DatePicker testDate = new DatePicker();
		testDate.relocate(130, 90); 
		testDate.setPrefSize(200, 30);
		DatePicker resultDate = new DatePicker();
		resultDate.relocate(130, 125); 
		resultDate.setPrefSize(200, 30);

		Button button1 = new Button("Add"); 
		button1.relocate(10, 160); 
		button1.setPrefSize(100, 30); 
		button1.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent actionEvent) {
				System.out.println("Location Information" + "\n\n");

				System.out.println("Test Location: " + testLocation.getText());
				System.out.println("Laboratory: " + laboratory.getText());
			    System.out.println("Test Date: " + testDate.getValue());
			    System.out.println("Result Date: " + resultDate.getValue());
			    
			} 

		});
		
		// Add all labels and textfields to the pane
		locationPane.getChildren().addAll(label1, label2, label3, label4, testLocation, laboratory, testDate, resultDate, button1);



		Label titleLabel = new Label(); 
		titleLabel.setText(title);
		titleLabel.setStyle("-fx-background-color: white; \n" + "-fx-translate-y: -8; \n" + "-fx-translate-x: 10;");
		getChildren().addAll(locationPane, titleLabel);


	}

}