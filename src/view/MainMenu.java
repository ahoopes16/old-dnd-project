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

		newButton.setOnAction(e-> buttonClicked(e));
		loadButton.setOnAction(e-> buttonClicked(e));
        exitButton.setOnAction(e-> buttonClicked(e));
		
		VBox layout = new VBox(10);
		layout.setId("main");
		
		layout.getChildren().addAll(newButton, loadButton, exitButton);

		layout.setPadding(new Insets(75,0,75,150));
		
		Scene scene = new Scene(layout, 300, 300);
		scene.getStylesheets().add(this.getClass().getResource("main.css").toExternalForm());
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void buttonClicked(javafx.event.ActionEvent ae) {
	    if (ae.getSource() == exitButton)
                System.exit(0);
    }

}
