package ro.mta.se.proiect.models;

/**
 * Created by Sorin on 1/29/2017.
 */
public class PlaneFactory {

    public Plane createPlane(int x, int y){
        Cell h = new Cell(x,y);
        Head head = new Head(h);
        Plane plane = new Plane(head);

        //VERIFICARI

        return plane;
    }

}
