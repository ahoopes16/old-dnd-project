package view;

import controller.SceneListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainMenuLayout extends VBox {
    private SceneListener listener;
    private Button newButton;
    private Button loadButton;
    private Button exitButton;

    public MainMenuLayout() {
        super(10);
        setId("main");
        setPadding(new Insets(75,0,75,150));
        getStylesheets().add(this.getClass().getResource("main.css").toExternalForm());

        newButton = new Button("New Character Sheet");
        loadButton = new Button("Load Existing Character");
        exitButton = new Button("Exit");

        newButton.setOnAction(e-> buttonClicked(e));
        loadButton.setOnAction(e-> buttonClicked(e));
        exitButton.setOnAction(e-> buttonClicked(e));

        getChildren().addAll(newButton, loadButton, exitButton);
    }

    public void buttonClicked(javafx.event.ActionEvent ae) {
        if (ae.getSource() == exitButton) {
            if (listener != null)
                listener.sceneChanged("EXIT");
        }

        if (ae.getSource() == newButton) {
            if (listener != null) {
                listener.sceneChanged("NEWCHAR");
            }
        }
    }

    public void setSceneListener(SceneListener listener) {
        this.listener = listener;
    }
}
