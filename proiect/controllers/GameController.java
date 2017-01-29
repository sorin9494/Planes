package ro.mta.se.proiect.controllers;

import javafx.beans.InvalidationListener;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import ro.mta.se.proiect.Main;
import ro.mta.se.proiect.models.Anims;
import ro.mta.se.proiect.models.Cell;
import ro.mta.se.proiect.views.GameView;

import java.awt.event.MouseEvent;
import java.util.InvalidPropertiesFormatException;
import java.util.Observable;

/**
 * Created by Sorin on 12/29/2016.
 */
public class GameController {
//
//    private final GameView view;
//
//    public GameController(GameView view){
//        this.view = view;
//        attachEvents();
//    }
//
//    public void attachEvents(){
//        view.playerBoard
//    }
//
//
//    private void playerBoardClick(MouseEvent event){
//        Cell cell = (Cell) event.getSource();
//
//        cell.setOnMouseReleased(e -> {
//                    cell.getChildren().add(Anims.getAtoms(1));
//                });
//    }
//
//    public static class Anims {
//
//        public static Node getAtoms(final int number) {
//            Circle circle = new Circle(5, 5f, 2);
//            circle.setFill(Color.RED);
//            Group group = new Group();
//            group.getChildren().add(circle);
////            SubScene scene = new SubScene(group, 40, 40);
////            scene.setFill(Color.TRANSPARENT);
//            return group;
//        }
//
//    }


    private GameView gameView;


    public GameController(GameView gameView) {
        this.gameView = gameView;
        initSomething();
    }


    public void initSomething(){




        for (Node pane :
                gameView.playerBoard.getChildren()) {
            if(pane instanceof Pane){

                pane.setOnMouseClicked(e->{
                    ((Pane) pane).getChildren().add(Anims.getAtoms(1));
                });
            }


        }
    }




}
