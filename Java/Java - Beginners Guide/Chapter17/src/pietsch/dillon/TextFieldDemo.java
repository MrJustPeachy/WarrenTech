package pietsch.dillon;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

/**
 * PROGRAM NAME: TextFieldDemo.java
 * PROGRAM PURPOSE: Shows text fields in JavaFX
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */

public class TextFieldDemo extends Application{

    TextField tf;
    Label response;

    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage myStage){

        myStage.setTitle("Demonstrate a TextField");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 230, 140);

        myStage.setScene(myScene);

        response = new Label("Enter Name: ");

        Button btnGetText = new Button("Get Name");

        tf = new TextField();

        tf.setPromptText("Enter a name.");

        tf.setPrefColumnCount(15);

        tf.setOnAction( (ae) -> response.setText("Enter pressed. Name is: " + tf.getText()));

        btnGetText.setOnAction((ae) -> response.setText("Button pressed. Name is: " + tf.getText()));

        Separator separator = new Separator();
        separator.setPrefWidth(180);

        rootNode.getChildren().addAll(tf, btnGetText, separator, response);

        myStage.show();

    }

}
