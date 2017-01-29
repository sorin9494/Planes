package ro.mta.se.proiect;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import ro.mta.se.proiect.controllers.GameController;
import ro.mta.se.proiect.views.GameView;


/**
 * Created by Sorin on 12/19/2016.
 */
public class Main extends Application {

    private final int columns = 15;
    private final int rows = 15;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Planes");


        GameView root = new GameView();
        root.setPrefWidth(1000);
        root.setAlignment(Pos.CENTER);
        root.getStylesheets().add("style.css");

        GameController controller = new GameController(root);
  //      root.getChildren().addAll(loadPlayerVBox(),loadPlayerGridPane(),loadPlayerGridPane());


        primaryStage.setScene(new Scene(root,1000,500));
        primaryStage.show();
    }







//
//    private VBox loadPlayerVBox() {
//        //Vbox - for display left buttons and connect fields
//        VBox vbox = new VBox(20);
//        vbox.setPrefWidth(500);
//
//
//        HBox innerHbox = new HBox();
//        Label ipLabel = new Label("Ip");
//        TextField ipTextField = new TextField();
//        innerHbox.getChildren().addAll(ipLabel, ipTextField);
//
//        Button connectButton = new Button("Connect");
//        //Trebuie disable-uit
//
//   //     Label dragAndDropPlanes = new Label("Drag and drop the planes");
//
//        Button startButton = new Button("Start");
//
//        Button shootButton = new Button("Shoot");
//
//        Label statusBarLabel = new Label("Status Bar LabeL");
//
//
//
//
//
//        vbox.getChildren().addAll(innerHbox, connectButton, dragPlane(), startButton, shootButton, statusBarLabel);
//
//        return vbox;
//    }
//
//    private GridPane loadPlayerGridPane() {
//        GridPane grid = new GridPane();
//        grid.getStyleClass().addAll("game-grid");
//
//        for (int i = 0; i < columns; i++) {
//            ColumnConstraints column = new ColumnConstraints(20);
//            grid.getColumnConstraints().add(column);
//        }
//
//        for (int i = 0; i < rows; i++) {
//            RowConstraints row = new RowConstraints(20);
//            grid.getRowConstraints().add(row);
//        }
//
//        for (int i = 0; i < columns; i++) {
//            for (int j = 0; j < rows; j++) {
//                Pane pane = new Pane();
//
////                pane.setOnMouseReleased(e -> {
////                    pane.getChildren().add(Anims.getAtoms(1));
////                });
//
//                pane.getStyleClass().add("game-grid-cell");
//                if (i == 0) {
//                    pane.getStyleClass().add("first-column");
//                }
//                if (j == 0) {
//                    pane.getStyleClass().add("first-row");
//                }
//                grid.add(pane, i, j);
//            }
//        }
//
//
//
//        return grid;
//
//
//    }
//
//    private GridPane dragPlane(){
//        GridPane grid = new GridPane();
//        grid.getStyleClass().addAll("game-grid");
//
//        for (int i = 0; i < 5; i++) {
//            ColumnConstraints column = new ColumnConstraints(20);
//            grid.getColumnConstraints().add(column);
//        }
//
//        for (int i = 0; i < 4; i++) {
//            RowConstraints row = new RowConstraints(20);
//            grid.getRowConstraints().add(row);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4; j++) {
//                Pane pane = new Pane();
//
//                pane.getStyleClass().add("game-grid-cell");
//                if (i == 0) {
//                    pane.getStyleClass().add("first-column");
//                }
//                if (j == 0) {
//                    pane.getStyleClass().add("first-row");
//                }
//                grid.add(pane, i, j);
//            }
//        }
//
//
//
//
//
//        return grid;
//    }


}
