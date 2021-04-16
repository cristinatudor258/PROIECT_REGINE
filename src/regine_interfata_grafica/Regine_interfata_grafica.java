package regine_interfata_grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import static javax.swing.JOptionPane.showMessageDialog;
import regine_interfata_grafica.Fereastra;

public class Regine_interfata_grafica {

    public static int nrB;
    public static int numar;
    public static String s;

    public static void main(String[] args) {
        s = JOptionPane.showInputDialog("Introduceti dimensiunea n a tablei:");
        numar = Integer.parseInt(s);
        while (numar < 4 || numar > 10) {
            JOptionPane.showMessageDialog(null, "Ati introdus un numar incorect! Introduceti un numar cuprins in intervalul [4,10]!");
            s = JOptionPane.showInputDialog("Introduceti o alta dimensiune n a tablei:");
            numar = Integer.parseInt(s);
        }
        nrB = numar * numar;
        Fereastra f = new Fereastra(nrB);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
