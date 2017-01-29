package ro.mta.se.proiect.models;

import java.util.List;

/**
 * Created by Sorin on 1/29/2017.
 */
public class Plane {
    Head planeHead;
    List<Cell> planeCells;

    public Plane(Head planeHead) {
        this.planeHead = planeHead;
    }

    public List<Cell> getPlaneCells() {
        return planeCells;
    }

    public void setPlaneCells(List<Cell> planeCells) {
        this.planeCells = planeCells;
    }

    public Head getPlaneHead() {
        return planeHead;
    }

    public void setPlaneHead(Head planeHead) {
        this.planeHead = planeHead;
    }
}
