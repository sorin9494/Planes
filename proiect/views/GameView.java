package ro.mta.se.proiect.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import ro.mta.se.proiect.models.Cell;

import java.util.List;


/**
 * Created by Sorin on 12/29/2016.
 */
public class GameView extends HBox {

    private final int columns = 15;
    private final int rows = 15;


    //Elements
    public GridPane playerBoard = loadPlayerGridPane();
    public GridPane enemyBoard = loadEnemyGridPane();
    public VBox menu = loadPlayerVBox();

//    public ObservableList<Pane> playerCells;
//    public ObservableList<Pane> enemyCells;
//    public ObservableList<Cell> enemyCells;
//    public ObservableList<Cell> playerCells;



    public GameView(){
        layoutForm();
    }

    private void layoutForm(){
        this.getChildren().add(menu);
        this.getChildren().add(playerBoard);
        this.getChildren().add(enemyBoard);
    }

    private VBox loadPlayerVBox() {
        //Vbox - for display left buttons and connect fields
        VBox vbox = new VBox(20);
        vbox.setPrefWidth(500);

        //Labels
        Label statusBarLabel = new Label("Status Bar LabeL");
        Label ipLabel = new Label("Ip");

        TextField ipTextField = new TextField();

        //Buttons
        Button connectButton = new Button("Connect");

        Button startButton = new Button("Start");

        Button shootButton = new Button("Shoot");


        HBox innerHbox = new HBox();
        innerHbox.getChildren().addAll(ipLabel, ipTextField);

        vbox.getChildren().addAll(innerHbox, connectButton, startButton, shootButton, statusBarLabel);

        return vbox;
    }

    private GridPane loadPlayerGridPane() {
        GridPane grid = new GridPane();
        grid.getStyleClass().addAll("game-grid");

        for (int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(20);
            grid.getColumnConstraints().add(column);
        }

        for (int i = 0; i < rows; i++) {
            RowConstraints row = new RowConstraints(20);
            grid.getRowConstraints().add(row);
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                Pane pane = new Pane();
  //              Cell cell = new Cell(j,i);
  //              playerCells.add(pane);

//                pane.setOnMouseReleased(e -> {
//                    pane.getChildren().add(Anims.getAtoms(1));
//                });

                pane.getStyleClass().add("game-grid-cell");
                if (i == 0) {
                    pane.getStyleClass().add("first-column");
                }
                if (j == 0) {
                    pane.getStyleClass().add("first-row");
                }
                grid.add(pane, i, j);
            }
        }



        return grid;


    }

    private GridPane loadEnemyGridPane() {
        GridPane grid = new GridPane();
        grid.getStyleClass().addAll("game-grid");

        for (int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(20);
            grid.getColumnConstraints().add(column);
        }

        for (int i = 0; i < rows; i++) {
            RowConstraints row = new RowConstraints(20);
            grid.getRowConstraints().add(row);
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                Pane pane = new Pane();
//                Cell cell = new Cell(j,i);
//                enemyCells.add(cell);
//                pane.setOnMouseReleased(e -> {
//                    pane.getChildren().add(Anims.getAtoms(1));
//                });

                pane.getStyleClass().add("game-grid-cell");
                if (i == 0) {
                    pane.getStyleClass().add("first-column");
                }
                if (j == 0) {
                    pane.getStyleClass().add("first-row");
                }
                grid.add(pane, i, j);
            }
        }



        return grid;


    }

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
