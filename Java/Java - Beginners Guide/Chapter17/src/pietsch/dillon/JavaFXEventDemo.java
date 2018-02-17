package pietsch.dillon;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

/**
 * PROGRAM NAME: JavaFXEventDemo.java
 * PROGRAM PURPOSE: Showcases JavaFX event handling with a button
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */

public class JavaFXEventDemo extends Application{

    Label response;

    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage myStage){

        myStage.setTitle("Use JavaFX Buttons and Events.");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 100);

        myStage.setScene(myScene);

        response = new Label("Push a Button");

        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");
        Button btnExit = new Button("Exit");

        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("You pressed Up.");
            }
        });

        btnDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("You pressed Down.");
            }
        });

        btnExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });

        rootNode.getChildren().addAll(btnUp, btnDown, btnExit, response);

        myStage.show();

    }

}
