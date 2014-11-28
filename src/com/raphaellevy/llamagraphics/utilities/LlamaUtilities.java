/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.raphaellevy.llamagraphics.utilities;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Assorted Utilities
 * @author raffa
 */
public final class LlamaUtilities {
    private LlamaUtilities() {
        throw new RuntimeException();
    }
    /**
     * Show a dialog box
     * @param message the message to show
     * @param title  the title of the window
     */
    public static void showDialog(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    /**
     * Lists the {@link Field}s in object o and their values.
     * @param o the object to list the fields of
     * @return a hashmap containing the fields and their values
     */
    public static HashMap<Field, Object> listFields(Object o) {
        Class c = o.getClass();
        HashMap<Field,Object> h = new HashMap<>();
        for (Field f:c.getFields()) {
            try {
                h.put(f, f.get(o));
            } catch (    IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(LlamaUtilities.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return h;
        
    }
    /**
     * Get a random 2 dimensional boolean array with a given number of rows and columns
     * @param rows the number of rows in the array
     * @param columns the number of columns in the array
     * @return a random 2D boolean array
     */
    public static boolean[][] randomBoolArray(int rows, int columns) {
        boolean[][] a = new boolean[rows][columns];
        int i = 0;
        for (boolean[] b : a) {
            int j = 0;
            for (boolean c : b) {
                a[i][j] = LlamaUtilities.randomBoolean();
                j++;
            }
            i++;
        }
        return a;
    }
    /**
     * Get a random boolean array with a given length.
     * @param length the length of the array
     * @return a random boolean array
     */
    public static boolean[] randomBoolArray(int length) {
        boolean[] a = new boolean[length];
        int i = 0;
        for (boolean b : a) {
            a[i] = randomBoolean();
            i++;
        }
        return a;
    }
    /**
     * Get a random <b>boolean</b> value.
     * @return a random boolean value.  The probability of getting <b>true</b> is equal to the probability of <b>false,</b> 1/2.
     */
    public static boolean randomBoolean() {
        if (Math.random() > .5) {
            return true;
        } else {
            return false;
        }
        
    }
    
}
