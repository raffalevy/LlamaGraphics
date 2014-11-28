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

/**
 * Same as {@link Sprite}, but with acceleration and velocity.  In constructor,
 * <code>x, y, width, height, acceleration,</code> and <code>velocity</code> should be initialized.
 * @author raffa
 */
public abstract class DynamicSprite extends Sprite{
    double[] acceleration = new double[2];
    double[] velocity = new double[2];
    public void accelerate() {
        velocity[0] += acceleration[0];
        velocity[1] += acceleration[1];
    }
    public void movePosition() {
        x += velocity[0];
        collisionDetectX();
        y += velocity[1];
        colisionDetectY();
    }

    public abstract void collisionDetectX();

    public abstract void colisionDetectY();
}
