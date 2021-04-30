import java.awt.*;
import javax.swing.*;


public class BallGame2 extends JFrame {
    //    加载图片
    Image desk = Toolkit.getDefaultToolkit().getImage("images/zhuo.jpeg");
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    double x = 100; //小球的横坐标
    double y = 100; //小球的从坐标
    double degree = 3.14 / 3;


    public void  paint(Graphics g){
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);
        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);
        if(y > 500 -40 -30 || y < 40 + 40){ //40 桌子边框， 30球宽度， 40标题栏高度
            degree = -degree;
        }
        if(x < 40||x>856 -40 -40){
            degree =3.14 -degree;
        }
    }

    //    加载窗口
    void launchFrame(){
        setSize(856,500/* 这是注释*/);
        setLocation(50,50);
        setVisible(true);
        while(true){
            repaint();
            try{
                Thread.sleep(40);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //    main入口
    public static void main(String[] args){
        System.out.println("桌球游戏开始");
        BallGame2 game = new BallGame2();
        game.launchFrame();

    }
}
