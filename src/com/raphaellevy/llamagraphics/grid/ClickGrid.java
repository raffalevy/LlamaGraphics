package com.raphaellevy.llamagraphics.grid;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * A {@link BooleanGrid} with click responce.  when clicked, a cell will switch value.
 * @author raffa
 */
public class ClickGrid extends BooleanGrid{
    /**
     * Generates a blank {@link ClickGrid} with a given number of rows and columns.
     * @param rows the number of rows
     * @param columns the number of columns
     * @param cellwidth the width of each cell
     * @param cellheight the height of each cell
     */
    public ClickGrid(int rows, int columns, int cellwidth, int cellheight) {
        super(rows, columns, cellwidth, cellheight);
        this.addMouseListener(new ClickGridListener());
        this.setFocusable(false);
        //this.setFocusable(true);
    }
    /**
     * Generates a new {@link ClickGrid} with a given two dimensional array.
     * @param array the array to use.
     * @param cellwidth the width of each cell
     * @param cellheight the height of each cell
     */
    public ClickGrid(boolean[][] array, int cellwidth, int cellheight) {
        super(array, cellwidth, cellheight);
        this.addMouseListener(new ClickGridListener());
        this.setFocusable(false);
        //this.setFocusable(true);
    }
    /**
     * The listener for the ClickGrid.
     */
    protected class ClickGridListener implements MouseListener {
        
        @Override
        public void mouseClicked(MouseEvent e) {
            
            try {
                int row = (int) Math.floor(e.getY() / cellheight);
                System.out.println(row);
                int column = (int) Math.floor(e.getX() / cellwidth);
                System.out.println(column);
                ClickGrid.this.setValue(row, column, !ClickGrid.this.getValue(row, column));
            } catch (Exception ex) {
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
}
