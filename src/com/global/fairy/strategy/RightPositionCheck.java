// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   RightPositionCheck.java

package com.global.fairy.strategy;

import com.global.fairy.utils.MusicUtil;
import java.awt.Point;
import java.io.PrintStream;

// Referenced classes of package com.global.fairy.strategy:
//            Strategy

public class RightPositionCheck
    implements Strategy
{

    public RightPositionCheck(Point currPoint, Point rightPoint)
    {
        deviationX = 75;
        deviationY = 50;
        dValueX = 0;
        dValueY = 0;
        this.currPoint = currPoint;
        this.rightPoint = rightPoint;
    }

    public void strategyExecute()
    {
        dValueX = Math.abs(currPoint.x - rightPoint.x);
        dValueY = Math.abs(currPoint.y - rightPoint.y);
        System.out.println((new StringBuilder("dValueX")).append(dValueX).toString());
        System.out.println((new StringBuilder("dValueY")).append(dValueY).toString());
        if(dValueX < deviationX && dValueY < deviationY)
        {
            System.out.println("\u606D\u559C\uFF0C\u79FB\u52A8\u5230\u6B63\u786E\u4F4D\u7F6E\uFF01");
            (new MusicUtil()).start();
        }
    }

    public Point currPoint;
    public Point rightPoint;
    int deviationX;
    int deviationY;
    int dValueX;
    int dValueY;
}
