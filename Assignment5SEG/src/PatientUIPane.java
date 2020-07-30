import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
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

public class PatientUIPane extends Application { 
	public void start (Stage primaryStage) {
		Pane patientUIPane = new Pane(); 
		
		PatientInfoPane aPane = new PatientInfoPane("Patient Information");
		aPane.relocate(10,30);
		aPane.setPrefSize(300, 200);

		ContactListPane bPane = new ContactListPane("Contact List");
		bPane.relocate(620, 270);

		SymptomPane cPane = new SymptomPane("Symptoms");
		cPane.relocate(10, 270);

		TestsPane dPane = new TestsPane("Tests");
		dPane.relocate(10, 500);

		LocationInfoPane ePane = new LocationInfoPane("Location Information");
		ePane.relocate(450, 30);


		Button button5 = new Button("Add all"); 
		button5.relocate(450, 550); 
		button5.setPrefSize(100, 30); 
		button5.setOnAction( new EventHandler<ActionEvent>() {
			public void handle(ActionEvent actionEvent) {
				Stage newWindow = new Stage();
				newWindow.setTitle("COVID-19 test patient");
				newWindow.setX(primaryStage.getX() + 200);
				newWindow.setY(primaryStage.getY() + 100);
				newWindow.show();
			} 

		});




		// Add all labels and textfields to the pane
		patientUIPane.getChildren().addAll(aPane, bPane, cPane, dPane, ePane, button5);

		primaryStage.setTitle("Patient UI");// Set title of window 
		primaryStage.setResizable(false); 
		primaryStage.setScene(new Scene(patientUIPane, 900, 900)); // Set size of window
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

