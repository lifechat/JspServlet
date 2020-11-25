package org.dsir.tools;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class GraphicHelper {
    /**
     * 以字符串形式返回生成的验证码，同时输出一个图片
     *
     * @param width
     *            图片的宽度
     * @param height
     *            图片的高度
     * @param imgType
     *            图片的类型
     * @param output
     *            图片的输出流(图片将输出到这个流中)
     * @return 返回所生成的验证码(字符串)
     */

    public static  String create(final int width, final int height, final String imgType, OutputStream output){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();

        graphics.setColor(Color.getColor("F8F8F8"));
        graphics.fillRect(0,0,width,height);

        Color[] colors = new Color[]{
                Color.BLUE, Color.GRAY, Color.GREEN, Color.RED, Color.BLACK, Color.ORANGE,
                Color.CYAN
        };
        //在花颜色的画板上进行绘制干扰线(50是线条个数);
        for(int i=0;i<50;i++){
            graphics.setColor(colors[random.nextInt(colors.length)]);
            final int x = random.nextInt(width);
            final int y = random.nextInt(height);
            final int w = random.nextInt(20);
            final int h = random.nextInt(20);
            final int signA = random.nextBoolean()?1:-1;
            final int signB = random.nextBoolean()?1:-1;
            graphics.drawLine(x,y,x+w*signA,y+h*signB);
        }
//                在画板上绘制字母
        graphics.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        for(int i=0;i<6;i++){
            final int temp = random.nextInt(26)+97;
            String s =  String.valueOf((char) temp);
            sb.append(s);
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawString(s,i*(width/6),height-(height/3));
        }
        graphics.dispose();
        try{
            ImageIO.write(image,imgType,output);
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
