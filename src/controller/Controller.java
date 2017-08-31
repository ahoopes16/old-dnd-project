package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import view.MainMenuLayout;
import view.NewCharacterLayout;

import java.util.Stack;

public class Controller extends Application {
    private Stack<Scene> scenes = new Stack<Scene>();
    private double windowWidth, windowHeight;
    private Stage primaryStage;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("D&D For ME!");
        primaryStage.setResizable(false);
//        primaryStage.initStyle(StageStyle.UNDECORATED);
        Scene scene = getScene("MAIN");
        windowWidth = scene.getWidth();
        windowHeight = scene.getHeight();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Scene getScene(String choice) {

        Scene scene = null;

        if (choice.equals("MAIN")) {
            MainMenuLayout layout = new MainMenuLayout();
            layout.setSceneListener(new SceneListener() {
                @Override
                public void sceneChanged(String choice) {
                    setScene(choice);
                }
            });
            scene = new Scene(layout, 300, 300);
            scenes.push(scene);
        }

        if (choice.equals("NEWCHAR")) {
            NewCharacterLayout layout = new NewCharacterLayout();
            layout.setSceneListener(new SceneListener() {
                @Override
                public void sceneChanged(String choice) {
                    setScene(choice);
                }
            });
            scene = new Scene(layout, 700, 700);
            scenes.push(scene);
        }

        if (choice.equals("BACK"))
            returnToPreviousScene();

        if (choice.equals("EXIT"))
            System.exit(0);

        return scene;
    }

    public void setScene(String choice) {
        primaryStage.setScene(getScene(choice));
        primaryStage.show();
    }

    public void returnToPreviousScene() {
        //--First remove the scene from which we come.
        scenes.pop();
        //--Then push the scene where we are going and go there.
        //--But this is equivalent to just using peek().
        primaryStage.setScene(scenes.peek());
    }

    public void returnToMainScreen() {
        //--Clear the scene stack.
        scenes.clear();
        //--Bring up the splash screen
        setScene("MAIN");
    }
}
