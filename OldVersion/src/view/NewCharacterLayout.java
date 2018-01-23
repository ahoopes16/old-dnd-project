package view;

import controller.SceneListener;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class NewCharacterLayout extends VBox {
    private SceneListener listener;
    private Button back;
    public NewCharacterLayout() {
        super(10);
        setId("newChar");

        back = new Button("Go back");
        back.setOnAction(e-> buttonClicked(e));
        getChildren().addAll(back);
    }

    public void buttonClicked(javafx.event.ActionEvent ae) {
        if (ae.getSource() == back) {
            if (listener != null)
                listener.sceneChanged("BACK");
        }
    }

    public void setSceneListener(SceneListener listener) {
        this.listener = listener;
    }
}
