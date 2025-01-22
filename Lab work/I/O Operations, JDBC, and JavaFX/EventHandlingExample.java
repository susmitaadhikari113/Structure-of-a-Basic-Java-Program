import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlingExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label to display messages
        Label messageLabel = new Label("Click the button!");

        // Create a button
        Button clickMeButton = new Button("Click Me!");

        // Set an action for the button
        clickMeButton.setOnAction(event -> {
            messageLabel.setText("Button was clicked!");
        });

        // Create a layout and add the label and button
        VBox layout = new VBox(10); // 10 pixels of spacing
        layout.getChildren().addAll(messageLabel, clickMeButton);

        // Create a scene with the layout
        Scene scene = new Scene(layout, 300, 200);

        // Set up the stage
        primaryStage.setTitle("JavaFX Event Handling Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}