// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MusicUtil.java

package com.global.fairy.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

import org.apache.log4j.Logger;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.mp3.MP3AudioHeader;
import org.jaudiotagger.audio.mp3.MP3File;

import com.global.fairy.puzzle.Config;

public class MusicUtil extends Thread {

	private static Logger logger = Logger.getLogger(MusicUtil.class);

	public MusicUtil() {
	}

	public static void play(String position) {
		logger.info("播放地址：" + position);
		try {
			
			BufferedInputStream buffer = new BufferedInputStream(
					new FileInputStream(new File(position)));
			Player player = new Player(buffer);
			player.play();
		} catch (Exception e) {
			
			e.printStackTrace();
			logger.error(position);
			logger.error(e);
		}
	}

	public static int getDuration(String position) {
		logger.info("getDuration播放地址：" + position);
		int length = 0;
		logger.info(position);
		try {
			MP3File mp3File = (MP3File) AudioFileIO.read(new File(position));
			MP3AudioHeader audioHeader = (MP3AudioHeader) mp3File
					.getAudioHeader();
			length = audioHeader.getTrackLength();
			return length;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(position);
			logger.error(e);
		}
		return length;
	}

	public void run() {
		String position = Config.MUS_SUCCESS;
		getDuration(Config.MUS_SUCCESS);
		play(position);
	}
}
