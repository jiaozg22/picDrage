// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Config.java

package com.global.fairy.puzzle;

import java.awt.Point;

public class Config {

	public static String puzzleTitle = "教学课件－脑图-联系方式:qq:1512632289";
	public static int X1 = 0;
	public static int Y1 = 0;
	public static int W1;
	public static int H1;
	public static int X2 = 0;
	public static int Y2 = 100;
	public static int W2;
	public static int H2;
	public static int X3 = 0;
	public static int Y3 = 200;
	public static int W3;
	public static int H3;
	public static int X4 = 0;
	public static int Y4 = 300;
	public static int W4;
	public static int H4;
	public static int X5 = 0;
	public static int Y5 = 400;
	public static int W5;
	public static int H5;
	public static int X6 = 0;
	public static int Y6 = 500;
	public static int W6;
	public static int H6;
	public static int XF = 150;
	public static int YF = 100;
	public static int WF = 100;
	public static int HF = 100;
	public static int PIC_INIT_X = 0;
	public static int PIC_INIT_Y = 0;
	public static int PIC_INIT_W;
	public static int PIC_INIT_H;
	public static final Point RIGHT_POINT_1 = new Point(550, 220);
	public static final Point RIGHT_POINT_2 = new Point(705, 360);
	public static final Point RIGHT_POINT_3 = new Point(462, 256);
	public static final Point RIGHT_POINT_4 = new Point(451, 446);
	public static final Point RIGHT_POINT_5 = new Point(726, 249);
	public static final Point RIGHT_POINT_6 = new Point(344, 307);

	public static String basePath = "c:/picDrage";

	public static final String PIC_URL_1 = basePath + "/pictest/pic_1.PNG";
	public static final String PIC_URL_2 = basePath + "/pictest/pic_2.PNG";
	public static final String PIC_URL_3 = basePath + "/pictest/pic_3.PNG";
	public static final String PIC_URL_4 = basePath + "/pictest/pic_4.PNG";
	public static final String PIC_URL_5 = basePath + "/pictest/pic_5.PNG";
	public static final String PIC_URL_6 = basePath + "/pictest/pic_6.PNG";
	public static final String PIC_URL_FULL = basePath + "/pictest/pic_full.PNG";

	public static String MUS_SUCCESS = basePath + "/music/9414.mp3";

	static {
		W1 = PIC_INIT_W;
		H1 = PIC_INIT_H;
		W2 = PIC_INIT_W;
		H2 = PIC_INIT_H;
		W3 = PIC_INIT_W;
		H3 = PIC_INIT_H;
		W4 = PIC_INIT_W;
		H4 = PIC_INIT_H;
		W5 = PIC_INIT_W;
		H5 = PIC_INIT_H;
		W6 = PIC_INIT_W;
		H6 = PIC_INIT_H;
		PIC_INIT_W = 100;
		PIC_INIT_H = 100;
	}
}
