package com.raphaellevy.llamagraphics.grid;

import java.awt.Graphics;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * A grid to display data on the screen.
 * @author raffa
 */
public interface Grid<T>{
    /**
    * Clear the array.
    */
    public void clear();
    /**
    * Set the value in the given row and column.
    * @param    row the row of the index to set
    * @param    column the column of the index to set
    * @param    value the value to set the index to
    */
    public void setValue(int row,int column, T value);
    /**
     * 
     * @param   row the row of the index to get
     * @param   column the column of the index to get
     * @return  the value of the index given
     */
    public T getValue(int row, int column);
    /**
     * 
     * @return the cell width in this {@link Grid}
     */
    public int getCellWidth();
    /**
     * 
     * @return the cell height in this {@link Grid}
     */
    public int getCellHeight();
    /**
     * Set the cell width in this {@link Grid}
     * @param width the value to set the cell width to
     */
    public void setCellWidth(int width);
    /**
     * Set the cell height in this {@link Grid}
     * @param height the value to set the cell height to
     */
    public void setCellHeight(int height);
    /**
     * 
     * @return the number of rows in this {@link Grid}
     */
    public int getNumberRows();
    /**
     * 
     * @return the number of columns in this {@link Grid}
     */
    public int getNumberColumns();
    /**
     * Called when the {@link Grid} is created.  Put this.repaint() in your main loop to refresh the Grid.
     * @param g the {@link Graphics} object provided at runtime
     */
    public void paint(Graphics g);
    
}
