package controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
        this.primaryStage.setTitle("D&D For ME!");
        this.primaryStage.setResizable(false);
//        primaryStage.initStyle(StageStyle.UNDECORATED);
        getScene("MAIN", this.primaryStage, secondaryStage);

        secondaryStage.setTitle("New Character!");
//        secondaryStage.setX(screen.getMinX());
//        secondaryStage.setY(screen.getMinY());
//        secondaryStage.setWidth(screen.getWidth());
//        secondaryStage.setHeight(screen.getHeight());
    }

    public void getScene(String choice, Stage stage, Stage currentStage) {

        Scene scene = null;

        if (choice.equals("MAIN")) {
            MainMenuLayout layout = new MainMenuLayout();
            layout.setSceneListener(new SceneListener() {
                @Override
                public void sceneChanged(String choice) { getScene(choice, primaryStage, secondaryStage);
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
                    getScene(choice, secondaryStage, primaryStage);
                }
            });
            scene = new Scene(layout, screen.getWidth(), screen.getHeight());
            scenes.push(scene);
        }

        if (choice.equals("BACK")){
            scene = returnToPreviousScene();
        }

        if (choice.equals("EXIT"))
            System.exit(0);


        //TODO FIGURE OUT THE WEIRD STAGE TRANSITION THINGY IT TAKES A STEP TOO LONG
        stage.setScene(scene);
        stage.show();
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
        getScene("MAIN", primaryStage, secondaryStage);
    }
}
