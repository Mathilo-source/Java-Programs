import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels
        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");

        // Create text fields
        TextField nameField = new TextField();
        TextField ageField = new TextField();

        // Create submit button
        Button submitButton = new Button("Submit");

        // Handle button click
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Form Data");
            alert.setHeaderText(null);
            alert.setContentText("Name: " + name + "\nAge: " + age);
            alert.showAndWait();
        });

        // Create a layout
        GridPane grid = new GridPane();
        grid.setVgap(10); // Vertical gap between rows
        grid.setHgap(10); // Horizontal gap between columns

        // Add components to the grid
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(ageLabel, 0, 1);
        grid.add(ageField, 1, 1);
        grid.add(submitButton, 1, 2);

        // Create scene and set stage
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("Simple Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
