import java.awt.Color;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

public class NumberGrid extends Application{
	@Override
	
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5,5,5,5)); //set top,right,bottom,left border
		pane.setHgap(5); //set Horizontal gap between objects
		pane.setVgap(5); //set vertical gap between objects
		pane.setStyle("-fx-border-color: red;"); //set the pane border to red just for kicks
		
		for (int i=0; i < 10; i++) {
			for (int j=0; j < 10; j++) {
				int randomNumber = (int)(Math.random() * 100);
				String setColor;
				
				TextField numbers = new TextField(Integer.toString(randomNumber));
				numbers.setPrefWidth(30);
				pane.add(numbers, i, j);
				numbers.setStyle("-fx-border-color: green;");
				
				setColor = colorIt(randomNumber);
				numbers.setStyle("-fx-background-color:" + setColor + ";");

			}
		}

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Number Grid");
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
	}
	
	public String colorIt(int number) {
		String color = "white";
		
		if (number % 2 == 0) {
			color = "lightblue";
		}
		if (number % 3 == 0) {
			color = "yellow";
		}
		if (number % 6 == 0) {
			color = "green";
		}
		return color;
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
