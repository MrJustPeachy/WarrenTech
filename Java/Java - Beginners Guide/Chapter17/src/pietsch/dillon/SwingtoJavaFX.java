package pietsch.dillon;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import java.io.*;

/**
 * PROGRAM NAME: SwingtoJavaFX.java
 * PROGRAM PURPOSE: Convert 16-1 from Swing to JavaFX
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/28/2017
 */
public class SwingtoJavaFX extends Application{

    TextField firstFileName, secondFileName;

    Label firstFile, secondFile, resultMessage;

    Button compareFilesButton;

    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage myStage){

        myStage.setTitle("Compare two files using JavaFX");
        FlowPane rootNode = new FlowPane(20, 20);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 300, 300);
        myStage.setScene(myScene);

        firstFileName = new TextField();
        secondFileName = new TextField();
        firstFileName.setPrefColumnCount(22);
        secondFileName.setPrefColumnCount(23);
        firstFileName.setPromptText("Type first file name: ");
        secondFileName.setPromptText("Type second file name: ");
        firstFileName.setOnAction( (e) -> compareFilesButton.fire());
        secondFileName.setOnAction( (e) -> compareFilesButton.fire());


        compareFilesButton = new Button("Click to compare files");

        firstFile = new Label("First file: ");
        secondFile = new Label("Second file: ");
        resultMessage = new Label("");

        compareFilesButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int i = 0;
                int j = 0;
                try(FileInputStream firstFile = new FileInputStream(firstFileName.getText());
                    FileInputStream secondFile = new FileInputStream(secondFileName.getText())){

                    do{
                        i = firstFile.read();
                        j = secondFile.read();
                        if(i != j) break;
                    } while(i != -1 && j != -1);

                    if(i != j)
                        resultMessage.setText("File are different.");
                    else
                        resultMessage.setText("Files are the same.");
                } catch(IOException exc){
                    resultMessage.setText("Error occurred.");
                }

            }
        });

        rootNode.getChildren().addAll(firstFile, firstFileName, secondFile, secondFileName,
                                      compareFilesButton, resultMessage);

        myStage.show();

    }

}
