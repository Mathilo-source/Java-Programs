//Write a JavaFX program where a TextField allows the user to enter their name, and
//upon clicking a button, the entered name is displayed in a label. 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NameDisplay extends Application {

    @Override
    public void start(Stage stage) {

        // Create controls
        TextField textField = new TextField();
        textField.setPromptText("Enter your name");

        Button button = new Button("Display Name");

        Label label = new Label();

        // Button click event
        button.setOnAction(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name);
        });

        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(textField, button, label);

        // Scene and stage
        Scene scene = new Scene(layout, 300, 200);
        stage.setTitle("Name Display App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
