package test.PlaneWar;

import javax.swing.*;

/**
 * @author moci
 * @create 2018-01-26 3:16 PM
 **/
public class Plane {
    private int x;
    private int y;
    private int width;
    private int height;
    private JLabel jLabel;
    private Icon icon;

    public Plane(JFrame myJframe){

        jLabel = new JLabel();
        icon = new ImageIcon(getClass().getResource("/Plane.png"));
        jLabel.setIcon(icon);
        myJframe.add(jLabel);

        this.width = icon.getIconWidth();
        this.height = icon.getIconHeight();
        this.x = myJframe.getWidth()/2;
        this.y = myJframe.getHeight()-this.getHeight();
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public void setjLabel(JLabel jLabel) {
        this.jLabel = jLabel;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
