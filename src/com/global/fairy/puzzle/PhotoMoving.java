// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PhotoMoving.java

package com.global.fairy.puzzle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import com.global.fairy.puzzle.adapters.MyMouseInputAdapter;

public class PhotoMoving {

	private static Logger logger = Logger.getLogger(PhotoMoving.class);
	
	JLabel pic_full;
	JLabel pic_1;
	JLabel pic_2;
	JLabel pic_3;
	JLabel pic_4;
	JLabel pic_5;
	JLabel pic_6;
	JFrame frame;
	JPanel panel;
	Rectangle ret_pic_1;
	Rectangle ret_pic_2;
	Rectangle ret_pic_3;
	Rectangle ret_pic_4;
	Rectangle ret_pic_5;
	Rectangle ret_pic_6;

	public PhotoMoving() {
		logger.info("初始化。。。");
		ret_pic_1 = new Rectangle(Config.X1, Config.Y1, Config.PIC_INIT_W,
				Config.PIC_INIT_H);
		ret_pic_2 = new Rectangle(Config.X2, Config.Y2, Config.PIC_INIT_W,
				Config.PIC_INIT_H);
		ret_pic_3 = new Rectangle(Config.X3, Config.Y3, Config.PIC_INIT_W,
				Config.PIC_INIT_H);
		ret_pic_4 = new Rectangle(Config.X4, Config.Y4, Config.PIC_INIT_W,
				Config.PIC_INIT_H);
		ret_pic_5 = new Rectangle(Config.X5, Config.Y5, Config.PIC_INIT_W,
				Config.PIC_INIT_H);
		ret_pic_6 = new Rectangle(Config.X6, Config.Y6, Config.PIC_INIT_W,
				Config.PIC_INIT_H);
		frame = new JFrame(Config.puzzleTitle);
		panel = new JPanel();
		panel.setLayout(null);
		ImageIcon img1 = new ImageIcon(Config.PIC_URL_1);
		pic_1 = new PicJLabel(img1, Config.RIGHT_POINT_1);
		panel.setBackground(Color.white);
		pic_1.setBounds(ret_pic_1);
		panel.add(pic_1);
		ImageIcon img2 = new ImageIcon(Config.PIC_URL_2);
		pic_2 = new PicJLabel(img2, Config.RIGHT_POINT_2);
		panel.setBackground(Color.white);
		pic_2.setBounds(ret_pic_2);
		panel.add(pic_2);
		ImageIcon img3 = new ImageIcon(Config.PIC_URL_3);
		pic_3 = new PicJLabel(img3, Config.RIGHT_POINT_3);
		panel.setBackground(Color.white);
		pic_3.setBounds(ret_pic_3);
		panel.add(pic_3);
		ImageIcon img4 = new ImageIcon(Config.PIC_URL_4);
		pic_4 = new PicJLabel(img4, Config.RIGHT_POINT_4);
		panel.setBackground(Color.white);
		pic_4.setBounds(ret_pic_4);
		panel.add(pic_4);
		ImageIcon img5 = new ImageIcon(Config.PIC_URL_5);
		pic_5 = new PicJLabel(img5, Config.RIGHT_POINT_5);
		panel.setBackground(Color.white);
		pic_5.setBounds(ret_pic_5);
		panel.add(pic_5);
		ImageIcon img6 = new ImageIcon(Config.PIC_URL_6);
		pic_6 = new PicJLabel(img6, Config.RIGHT_POINT_6);
		panel.setBackground(Color.white);
		pic_6.setBounds(ret_pic_6);
		panel.add(pic_6);
		ImageIcon imgf = new ImageIcon(Config.PIC_URL_FULL);
		pic_full = new JLabel(imgf);
		panel.setBackground(Color.white);
		System.out.println(imgf.getIconWidth());
		pic_full.setBounds(Config.XF, Config.YF, imgf.getIconWidth(),
				imgf.getIconHeight());
		panel.add(pic_full);
		MyMouseInputAdapter listener_1 = new MyMouseInputAdapter(pic_1,
				new Rectangle(img1.getIconWidth(), img1.getIconHeight()),
				ret_pic_1);
		pic_1.addMouseListener(listener_1);
		pic_1.addMouseMotionListener(listener_1);
		MyMouseInputAdapter listener_2 = new MyMouseInputAdapter(pic_2,
				new Rectangle(img2.getIconWidth(), img2.getIconHeight()),
				ret_pic_2);
		pic_2.addMouseListener(listener_2);
		pic_2.addMouseMotionListener(listener_2);
		MyMouseInputAdapter listener_3 = new MyMouseInputAdapter(pic_3,
				new Rectangle(img3.getIconWidth(), img3.getIconHeight()),
				ret_pic_3);
		pic_3.addMouseListener(listener_3);
		pic_3.addMouseMotionListener(listener_3);
		MyMouseInputAdapter listener_4 = new MyMouseInputAdapter(pic_4,
				new Rectangle(img4.getIconWidth(), img4.getIconHeight()),
				ret_pic_4);
		pic_4.addMouseListener(listener_4);
		pic_4.addMouseMotionListener(listener_4);
		MyMouseInputAdapter listener_5 = new MyMouseInputAdapter(pic_5,
				new Rectangle(img5.getIconWidth(), img5.getIconHeight()),
				ret_pic_5);
		pic_5.addMouseListener(listener_5);
		pic_5.addMouseMotionListener(listener_5);
		MyMouseInputAdapter listener_6 = new MyMouseInputAdapter(pic_6,
				new Rectangle(img6.getIconWidth(), img6.getIconHeight()),
				ret_pic_6);
		pic_6.addMouseListener(listener_6);
		pic_6.addMouseMotionListener(listener_6);
		logger.info("初始化成功");
		frame.add(panel);
		frame.setSize(950, 700);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = frame.getSize();
		frame.setLocation((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
	}

	public static void main(String args[]) {
		new PhotoMoving();
	}

}
