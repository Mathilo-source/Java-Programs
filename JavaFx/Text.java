import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TextExample extends Application {
    @Override
    public void start(Stage stage) {
        Text text = new Text(50, 100, "JavaFX Text Example");
        text.setFont(Font.font("Arial", 24));
        text.setFill(Color.DARKBLUE);

        Group root = new Group(text);
        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("JavaFX Text");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
