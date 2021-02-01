package films;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.LoginView;

public class App extends Application {
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(new LoginView().getContentVBox());
        Scene scene = new Scene(borderPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
