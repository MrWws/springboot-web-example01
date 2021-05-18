package com.king.springboot.utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @author: jjk
 * @time: 2021-04-16-14:54
 * @description:
 * @function:
 */
public class ValidateImageCodeUtils {


    public static BufferedImage createImage(){
        int wigth=90;
        int heigth=32;
        BufferedImage image=new BufferedImage(wigth,heigth,BufferedImage.TYPE_3BYTE_BGR);
        //2.2 美化图片称为所需的样子
        //2.2.1构造画笔对象
        Graphics g=image.createGraphics();
        g.setColor(Color.orange);//设置画笔颜色
        g.fillRect(0,0,wigth,heigth);//填充成矩形，需要设置起点(0,0)指的是图片的左上角，矩形宽高
        //2.2.2 画边框，使用draw方法
        g.setColor(Color.black);
        g.drawRect(0,0,wigth-1,heigth-1);//画矩形，也就是描边
        //2.2.3 写验证码,还要能动态变化
        String str="ABCDEFGHIJK1234567890!@#$%^&*()";
        Random ran=new Random();
        //用循环生成
        for(int i=1;i<=4;i++){
            int index = ran.nextInt(str.length());
            char ch=str.charAt(index);
            g.drawString(ch+"",wigth/5*i,heigth/2);
        }
        //2.2.4 画干扰线
        g.setColor(Color.blue);
        for(int i=1;i<=6;i++){
            int index1 = ran.nextInt(wigth);
            int index2 = ran.nextInt(heigth);
            int index3 = ran.nextInt(wigth);
            int index4 = ran.nextInt(heigth);
            g.drawLine(index1,index2,index3,index4);
        }

        return image;
    }
}
