// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PicJLabel.java

package com.global.fairy.puzzle;

import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PicJLabel extends JLabel
{

    public PicJLabel(ImageIcon imageIcon, Point rightPoint)
    {
        super(imageIcon);
        this.rightPoint = rightPoint;
    }

    public Point getRightPoint()
    {
        return rightPoint;
    }

    private static final long serialVersionUID = 0x61f8f7201525da25L;
    public Point rightPoint;
}
