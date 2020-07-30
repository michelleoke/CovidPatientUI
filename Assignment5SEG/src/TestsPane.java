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

//unfinished
public class TestsPane extends Pane{
	public TestsPane(String title){
		Pane testPane = new Pane(); 
		testPane.setStyle("-fx-background-color: white; " + "-fx-border-color: gray; " + "-fx-padding: 4 4;"); // margin spacing at bottom right
		// Create the labels and textfields
		CheckBox checkBox1 = new CheckBox("Anti-Body Test");
		checkBox1.relocate(10,20);
		CheckBox checkBox2 = new CheckBox("Virus Test");
		checkBox2.relocate(10,40);

		Button button4 = new Button("Add"); 
		button4.relocate(10, 70); 
		button4.setPrefSize(100, 30); 
		button4.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent actionEvent) {
				System.out.println("Test(s) completed: ");

				if (checkBox1.isSelected()) {
					System.out.println("Anti-Body Test");
				}
				if (checkBox2.isSelected()) {
					System.out.println("VirusTest");
				}
				
			} 

		});
		
		testPane.getChildren().addAll(checkBox1, checkBox2, button4);

		Label titleLabel = new Label(); 
		titleLabel.setText(title);
		titleLabel.setStyle("-fx-background-color: white; \n" + "-fx-translate-y: -8; \n" + "-fx-translate-x: 10;");
		getChildren().addAll(testPane, titleLabel);




	}

}