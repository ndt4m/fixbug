package application.gui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class RunGui extends Application{

    private static Scene scene;

    public void start(Stage stage) {
        try {
            FileReader fr = new FileReader("src/resources/application/MainScreen.fxml");
            fr.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("file does not exist: ");
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("src/resources/application/MainScreen.fxml"));
        System.out.println(getClass().getClassLoader().getResource("src/resources/application/MainScreen.fxml"));
        Parent rootParent;
        try {
            rootParent = loader.load();
            scene = new Scene(rootParent, 1100, 600);
            stage.setTitle("History of Vietnam");
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/images/logo.png")));
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Scene getScene() {
        return scene;
    }

}