package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;

public class MainMenu extends Application 
{
	private Button newButton;
	private Button loadButton;
	private Button exitButton;
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		primaryStage.setTitle("D&D For ME!");
		primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
		newButton = new Button("New Character Sheet");
		loadButton = new Button("Load Existing Character");
		exitButton = new Button("Exit");

		exitButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {
			@Override
			public void handle(javafx.event.ActionEvent event) {
				System.exit(0);
			}
		});
		
		VBox layout = new VBox(10);
		layout.setId("main");
		
		layout.getChildren().addAll(newButton, loadButton, exitButton);

		layout.setPadding(new Insets(75,0,75,150));
		
		Scene scene = new Scene(layout, 300, 300);
		scene.getStylesheets().add(this.getClass().getResource("main.css").toExternalForm());
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
