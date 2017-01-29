package ro.mta.se.proiect.models;

/**
 * Created by Sorin on 1/29/2017.
 */
public class Head {
    private Cell headCell;
    private Plane headPlane;

    public Head(Cell headCell) {
        this.headCell = headCell;
    }

    public Cell getHeadCell() {
        return headCell;
    }

    public void setHeadCell(Cell headCell) {
        this.headCell = headCell;
    }

    public Plane getHeadPlane() {
        return headPlane;
    }

    public void setHeadPlane(Plane headPlane) {
        this.headPlane = headPlane;
    }
}
