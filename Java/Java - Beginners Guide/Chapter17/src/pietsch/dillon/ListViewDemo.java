package pietsch.dillon;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

/**
 * PROGRAM NAME: ListViewDemo.java
 * PROGRAM PURPOSE: List view with JavaFX
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */
public class ListViewDemo extends Application{

    Label response;

    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage myStage){

        myStage.setTitle("ListView Demo");

        FlowPane rootNode = new FlowPane(10, 10);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 200, 120);

        response = new Label("Select Computer Type");

        ObservableList<String> computerTypes = FXCollections.observableArrayList("Smartphone", "Tablet",
                "Notebook", "Desktop");

        ListView<String> lvComputers = new ListView<String>(computerTypes);

        lvComputers.setPrefSize(100, 70);

        MultipleSelectionModel<String> lvSelModel = lvComputers.getSelectionModel();

        lvSelModel.selectedItemProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                        response.setText("Computer selected is " + newValue);
                    }
                });

        rootNode.getChildren().addAll(lvComputers, response);

        myStage.show();
    }

}
