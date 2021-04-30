import java.awt.*;
import javax.swing.*;


public class BallGame extends JFrame {
//    加载图片
    Image desk = Toolkit.getDefaultToolkit().getImage("images/zhuo.jpeg");
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    double x = 100; //小球的横坐标
    double y = 100; //小球的从坐标
    boolean right = true; // 向右
    public void  paint(Graphics g){
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);
        if (right){
            x = x + 10;
        } else{
            x = x - 10;
        }
        if (x > 856 -40 -30){
            right = false;
        }
        if (x < 40){
            right = true;
        }

    }

//    加载窗口
    void launchFrame(){
        setSize(856,500);
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
        BallGame game = new BallGame();
        game.launchFrame();

    }
}
