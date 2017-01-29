package ro.mta.se.proiect.models;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by Sorin on 1/29/2017.
 */
public class Anims {
    public static Node getAtoms(final int number) {
        Circle circle = new Circle(5, 5f, 2);
        circle.setFill(Color.RED);
        Group group = new Group();
        group.getChildren().add(circle);
//            SubScene scene = new SubScene(group, 40, 40);
//            scene.setFill(Color.TRANSPARENT);
        return group;
    }
}
