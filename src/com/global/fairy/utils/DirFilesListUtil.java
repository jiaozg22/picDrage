// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DirFilesListUtil.java

package com.global.fairy.utils;

import java.io.*;

public class DirFilesListUtil
{

    public DirFilesListUtil()
    {
    }

    public static void findByDepth(String pathName, int level, int depth)
        throws IOException
    {
        File dirFile = new File(pathName);
        if(!dirFile.exists())
        {
            System.out.println("do not exit");
            return;
        }
        if(!dirFile.isDirectory())
        {
            if(dirFile.isFile())
                System.out.println(dirFile.getCanonicalFile());
            return;
        }
        String fileList[] = dirFile.list();
        int currentDepth = level + 1;
        for(int j = 0; j < level; j++)
            System.out.print("  ");

        System.out.print("|--");
        System.out.println(dirFile.getName());
        for(int i = 0; i < fileList.length; i++)
        {
            if(currentDepth == depth)
                return;
            String string = fileList[i];
            File file = new File(dirFile.getPath(), string);
            String name = file.getName();
            if(file.isDirectory())
            {
                findByDepth(file.getCanonicalPath(), currentDepth, depth);
            } else
            {
                for(int j = 0; j < currentDepth; j++)
                    System.out.print("   ");

                System.out.print("|--");
                System.out.println(name);
            }
        }

    }

    public static void main(String args[])
        throws IOException
    {
        int level = 0;
        int depth = 2;
        findByDepth("f:\\pictest", level, depth);
    }
}
