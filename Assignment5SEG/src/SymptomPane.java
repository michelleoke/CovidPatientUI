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


public class SymptomPane extends Pane{
	public SymptomPane(String title){
		Pane symptomPane = new Pane(); //new pane
		symptomPane.setStyle("-fx-background-color: white; " + "-fx-border-color: gray; " + "-fx-padding: 4 4;"); // margin spacing at bottom right
		// Create the textfields, datepicker and buttons
		
		TextField s1Field = new TextField(); 
		s1Field.relocate(10, 20); 
		s1Field.setPrefSize(150, 30);
		TextField s2Field = new TextField(); 
		s2Field.relocate(10, 55); 
		s2Field.setPrefSize(150, 30);
		TextField s3Field = new TextField(); 
		s3Field.relocate(10, 90); 
		s3Field.setPrefSize(150, 30);
		TextField s4Field = new TextField(); 
		s4Field.relocate(10, 125); 
		s4Field.setPrefSize(150, 30);
		
		DatePicker a = new DatePicker();
		a.relocate(180, 20);
		DatePicker b = new DatePicker();
		b.relocate(180, 55);
		DatePicker c = new DatePicker();
		c.relocate(180, 90);
		DatePicker d = new DatePicker();
		d.relocate(180, 125);
		DatePicker e = new DatePicker();
		e.relocate(380, 20);
		DatePicker f = new DatePicker();
		f.relocate(380, 55);
		DatePicker g = new DatePicker();
		g.relocate(380, 90);
		DatePicker h = new DatePicker();
		h.relocate(380, 125);

		Button button3 = new Button("Add"); 
		button3.relocate(10, 170); 
		button3.setPrefSize(100, 30); 
		button3.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent actionEvent) {
				System.out.println("Symptoms:" + "\n\n\n")
				if (s1Field.getText().length() > 0) {
					System.out.println(s1Field.getText() + ":   " + a.getValue() + " to " + e.getValue());
				}
				if (s2Field.getText().length() > 0) {
					System.out.println(s2Field.getText() + ":   " + b.getValue() + " to " + f.getValue());
				}
				if (s3Field.getText().length() > 0) {
					System.out.println(s3Field.getText() + ":   " + c.getValue() + " to " + g.getValue());
				}
				if (s4Field.getText().length() > 0) {
					System.out.println(s4Field.getText() + ":   " +  d.getValue() + " to " + h.getValue());
				}
			} 

		});
		
		

		// Add all componenets to the pane
		symptomPane.getChildren().addAll(s1Field, s2Field, s3Field, s4Field, a, b, c, d, e, f, g, h, button3);


		Label titleLabel = new Label(); 
		titleLabel.setText(title);
		titleLabel.setStyle("-fx-background-color: white; \n" + "-fx-translate-y: -8; \n" + "-fx-translate-x: 10;");
		getChildren().addAll(symptomPane, titleLabel);


	}

}
