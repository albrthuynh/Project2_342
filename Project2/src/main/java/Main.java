import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Black Jack");

        Button play;
        Text welcomeMessage;
        TextField walletAmount, bettingAmount;
        VBox messagePrompts;
        HBox h1, h2;

        // setting the play button
        play = new Button("PLAY");

        // setting the two text fields for the user to input wallet amount and betting amount
        walletAmount = new TextField();
        walletAmount.setPromptText("Enter Wallet Amount Here!");

        bettingAmount = new TextField();
        bettingAmount.setPromptText("Enter Betting Amount Here!");

        // setting the vertical box to hold the three elements
        messagePrompts = new VBox(50, walletAmount, bettingAmount);
        messagePrompts.setSpacing(50);
        play.setAlignment(Pos.CENTER);
        play.setMinHeight(100);
        play.setMinWidth(300);

        welcomeMessage = new Text("WELCOME TO BLACK JACK");
        welcomeMessage.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        welcomeMessage.setLineSpacing(100);

        // creating a borderpane to hold our elements and format them
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(250));

        // creating and setting where the elements of the screen should be
        // "Welcome to Black Jack" Top and Center
        // prompting the user to input values in the center
        pane.setTop(welcomeMessage);
        BorderPane.setAlignment(welcomeMessage, Pos.CENTER);
        pane.setCenter(messagePrompts);

        pane.setBottom(play);
        BorderPane.setAlignment(play, Pos.CENTER);

        // setting the background color
        pane.setStyle("-fx-background-color: darkgreen");

//        b1.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                text[0] = tMiddle.getText() + textConcat;
//                tRight.setText(text[0]);
//                b1.setDisable(true);
//                b1.setText("Pressed!");
//            }
//        });
//
//        b2.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                tMiddle.clear();
//                tRight.clear();
//                tRight.setText("Final string goes here!");
//                b1.setDisable(false);
//                b1.setText("Button One");
//            }
//        });

        Scene scene = new Scene(pane, 700, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
