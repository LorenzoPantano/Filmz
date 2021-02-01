package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginView implements View {

    private VBox contentVBox;

    //UI
    private final Label emailLabel = new Label("Email");
    private final Label passwordLabel = new Label("Password");
    private final TextField emailTextField = new TextField();
    private final PasswordField passwordField = new PasswordField();

    //Buttons
    private final Button loginBtn = new Button("Login");
    private final Button registerAsTheatre = new Button("Register As Theatre");
    private final Button registerAsUser = new Button("Register As User");

    public LoginView() {
        this.contentVBox = buildContentVBox();
    }

    @Override
    public VBox buildContentVBox() {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(25));
        vBox.setSpacing(10);
        vBox.getChildren().addAll(emailLabel, emailTextField, passwordLabel, passwordField, loginBtn, registerAsTheatre, registerAsUser);
        return vBox;
    }

    public VBox getContentVBox() {
        return contentVBox;
    }
}
