package ro.mta.se.proiect.models;

import javafx.scene.layout.Pane;

/**
 * Created by Sorin on 1/29/2017.
 */
public class Cell {
    int xRow;
    int yCol;


    public Cell(int xRow, int yCol) {
        this.xRow = xRow;
        this.yCol = yCol;
    }

    public int getxRow() {
        return xRow;
    }

    public void setxRow(int xRow) {
        this.xRow = xRow;
    }

    public int getyCol() {
        return yCol;
    }

    public void setyCol(int yCol) {
        this.yCol = yCol;
    }
}
