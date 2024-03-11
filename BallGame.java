/*
import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame {
    //创建二个图片对象
    Image ball = Toolkit.getDefaultToolkit().getImage("picture/ball.png");
    Image table = Toolkit.getDefaultToolkit().getImage("picture/table.jpg");
    double x = 100; //小球的横坐标
    double y = 100;//小球的纵坐标
    boolean right = true;//方向
    //图片加载的方法
    public void paint(Graphics g){
        System.out.println("窗口被画了一次!");
        g.drawImage(table,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        if(right){
            x=x+10;
        }else{
            x=x-10;
        }
        if(x>856-30-40){
            right = false;
        }
        if(x<40+2){
            right = true;
        }


    }


    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);
        //重画窗口1秒25次
        while(true){
            repaint();
            try{
                Thread.sleep(40);//40ms
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] arg){
    BallGame game = new BallGame();
    game.launchFrame();
    }
}
*/
