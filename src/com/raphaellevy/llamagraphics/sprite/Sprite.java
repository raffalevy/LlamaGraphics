/*
 * Copyright (C) 2014 raffa
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.raphaellevy.llamagraphics.sprite;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;

/**
 * Represents an object to be used in an animation or game.<br><br>
 * Position setter methods are not part of <code>Sprite</code>.  Implement only if necessary.  In constructor,
 * <code>x, y, width,</code> and <code>height</code> should be initialized.
 * @author raffa
 */
public abstract class Sprite{
    int x;
    int y;
    int width;
    int height;
    SpritePanel panel;
    private String group;
    String name;
    /**
     * Call whenever a new position should be calculated for the {@link Sprite}.
     */
    public abstract void move();
    /**
     * Call whenever the {@link Sprite} must be rendered.
     * @param g the {@link Graphics} object provided at runtime to the {@link JPanel} or other {@link JContainer}.
     */
    public abstract void paint(Graphics g);
    /**
     * Get the bounds of the {@link Sprite}.
     * @return a {@link Rectangle} representing the bounds of the object.
     */
    public Rectangle getBounds() {
        
        return new Rectangle(x,y,width,height);
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public boolean intersects(Sprite s) {
        return this.getBounds().intersects(s.getBounds());
    }
    public boolean intersects(Shape s) {
        return this.getBounds().intersects(s.getBounds());
    }
    

    /**
     * @return the name
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param name the name to set
     */
    protected void Group(String name) {
        this.group = name;
    }

    /**
     * @return the panel
     */
    public SpritePanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    void setPanel(SpritePanel panel) {
        this.panel = panel;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
}
