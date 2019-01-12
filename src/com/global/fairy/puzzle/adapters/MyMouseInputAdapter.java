// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MyMouseInputAdapter.java

package com.global.fairy.puzzle.adapters;

import com.global.fairy.puzzle.PicJLabel;
import com.global.fairy.strategy.RightPositionCheck;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

public class MyMouseInputAdapter extends MouseInputAdapter
{

    private MyMouseInputAdapter()
    {
        point = new Point(0, 0);
    }

    public MyMouseInputAdapter(JLabel pica, Rectangle retangle, Rectangle initRetangle)
    {
        point = new Point(0, 0);
        pic = pica;
        this.retangle = retangle;
        this.initRetangle = initRetangle;
    }

    public void mousePressed(MouseEvent e)
    {
        point = SwingUtilities.convertPoint(pic, e.getPoint(), pic.getParent());
        pic.setSize(retangle.width, retangle.height);
        if(e.isMetaDown())
            pic.setBounds(initRetangle);
    }

    public void mouseDragged(MouseEvent e)
    {
        Point newPoint = SwingUtilities.convertPoint(pic, e.getPoint(), pic.getParent());
        pic.setLocation(pic.getX() + (newPoint.x - point.x), pic.getY() + (newPoint.y - point.y));
        point = newPoint;
    }

    public void mouseReleased(MouseEvent e)
    {
        PicJLabel picJLable = (PicJLabel)pic;
        System.out.println((new StringBuilder("\u91CA\u653E\u7684\u4F4D\u7F6E")).append(point).toString());
        System.out.println((new StringBuilder("\u6B63\u786E\u7684\u4F4D\u7F6E")).append(picJLable.getRightPoint()).toString());
        rightPositionCheck = new RightPositionCheck(point, picJLable.getRightPoint());
        rightPositionCheck.strategyExecute();
    }

    Point point;
    JLabel pic;
    Rectangle retangle;
    Rectangle initRetangle;
    RightPositionCheck rightPositionCheck;
}
