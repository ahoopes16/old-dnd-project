package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import view.LoadCharacterLayout;
import view.MainMenuLayout;
import view.NewCharacterLayout;

import javafx.geometry.Rectangle2D;
import java.util.Stack;

public class Controller extends Application {
    private Stack<Scene> scenes = new Stack<Scene>();
    private Rectangle2D screen = Screen.getPrimary().getVisualBounds();
    private Stage primaryStage;
    private Stage secondaryStage = new Stage();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        getScene("MAIN", this.primaryStage, secondaryStage);

        secondaryStage.setMinHeight(800);
        secondaryStage.setMinWidth(800);
        secondaryStage.setMaximized(true);

    }

    public void getScene(String choice, Stage stage, Stage currentStage) {

        Scene scene = null;

        if (choice.equals("MAIN")) {
            MainMenuLayout layout = new MainMenuLayout();
            layout.setSceneListener(new SceneListener() {
                @Override
                public void sceneAndStageChanged(String choice) {
                    getScene(choice, secondaryStage, primaryStage);
                }

                @Override
                public void sceneChanged(String choice) {
                    //never changing only the scene from main
                }
            });
            scene = new Scene(layout, 300, 300);
            scenes.push(scene);
        }

        if (choice.equals("NEWCHAR")) {
            NewCharacterLayout layout = new NewCharacterLayout();
            layout.setSceneListener(new SceneListener() {
                @Override
                public void sceneAndStageChanged(String choice) {
                    getScene(choice, primaryStage, secondaryStage);
                }

                @Override
                public void sceneChanged(String choice) {
                    getScene(choice, secondaryStage, secondaryStage);
                }
            });
            scene = new Scene(layout);
            scenes.push(scene);
            stage.setTitle("New Character");
        }

        if (choice.equals("LOADCHAR")) {
            LoadCharacterLayout layout = new LoadCharacterLayout();
            layout.setSceneListener(new SceneListener() {
                @Override
                public void sceneAndStageChanged(String choice) {
                    getScene(choice, primaryStage, secondaryStage);
                }

                @Override
                public void sceneChanged(String choice) {
                    getScene(choice, secondaryStage, secondaryStage);
                }
            });

            scene = new Scene(layout);
            scenes.push(scene);
            secondaryStage.setTitle("Load Character!");
        }

        if (choice.equals("BACK")){
            scene = returnToPreviousScene();
        }

        if (choice.equals("EXIT"))
            System.exit(0);

        stage.setScene(scene);
        stage.show();
        if (stage != currentStage)
            currentStage.hide();
    }

    public Scene returnToPreviousScene() {
        //--First remove the scene from which we come.
        scenes.pop();
        //--Then push the scene where we are going and go there.
        //--But this is equivalent to just using peek().
        return scenes.peek();
    }

    public void returnToMainScreen() {
        //--Clear the scene stack.
        scenes.clear();
        //--Bring up the splash screen
        getScene("MAIN", secondaryStage, primaryStage);
    }
}
