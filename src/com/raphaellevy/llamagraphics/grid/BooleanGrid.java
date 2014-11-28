package com.raphaellevy.llamagraphics.grid;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JPanel;



/**
 * An implementation of {@link Grid} displaying a two dimensional array of boolean values.  <b>True</b> values are displayed as black rectangles.  <b>False</b> values are not filled.
 * @author raffa
 */
public class BooleanGrid extends JPanel implements Grid<Boolean>{
    protected boolean[][] arr;
    protected int cellwidth;
    protected int cellheight;
    protected int rows;
    protected int columns;
    /**
     * Generates a blank {@link BooleanGrid}.
     * @param rows number of rows in the grid
     * @param columns number of columns in the grid
     * @param cellwidth the width in pixels of a cell in the grid
     * @param cellheight the height in pixels of a cell in the grid
     */
    public BooleanGrid(int rows, int columns, int cellwidth, int cellheight) {
        this.rows = rows;
        this.columns = columns;
        arr = new boolean[this.rows][this.columns];
        this.cellwidth = cellwidth;
        this.cellheight = cellheight;
        this.setFocusable(false);
    }
    /**
     * Generates a new {@link BooleanGrid} from a given array.
     * @param array the array of <b>boolean</b> values to use.
     * @param cellwidth the width in pixels of a cell in the grid
     * @param cellheight the height in pixels of a cell in the grid
     */
    public BooleanGrid(boolean[][] array, int cellwidth, int cellheight) {
        this.rows = array.length;
        this.columns = array[0].length;
        arr = array;
        this.cellwidth = cellwidth;
        this.cellheight = cellheight;
        this.setFocusable(false);
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        int in = 0;
        for (boolean[] i:getArray()) {
            int im = 0;
            for (boolean j:i) {
                
                if(j) {
                    g2d.fill(new Rectangle(getCellWidth()*im,getCellHeight()*in, getCellWidth(), getCellHeight()));
                }
                im++;
            }
            in++;
        }
        
    }
    @Override
    public void clear() {
        arr = new boolean[getNumberRows()][getNumberColumns()];
    }
    @Override
    public void setValue(int a,int b, Boolean value) {
        arr[a][b] = value;
    }
    @Override
    public Boolean getValue(int row,int column) {
        return getArray()[row][column];
    }

    
    public boolean[][] getArray() {
        return arr;
        
    }

    
    @Override
    public int getCellWidth() {
        return cellwidth;
    }

    
    @Override
    public void setCellWidth(int cellwidth) {
        this.cellwidth = cellwidth;
    }

    @Override
    public int getCellHeight() {
        return cellheight;
    }

    @Override
    public void setCellHeight(int cellheight) {
        this.cellheight = cellheight;
    }

    @Override
    public int getNumberRows() {
        return rows;
    }

    @Override
    public int getNumberColumns() {
        return columns;
    }
    @Override
    public int getWidth() {
        return cellwidth*columns;
        
    }
    @Override
    public int getHeight() {
        return cellheight*rows;
        
    }

    

    

    
}
