import java.awt.*;
import static java.awt.event.InputEvent.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class RobotClicker {
    
    MouseListener mouse_listener;
    static MouseEvent me;
    int amount;
    
    Point location1;
    Point location2;
    Point location3;
    Point location4;
    Point location5;
    
    public static int x1;
    public static int x2;
    public static int x3;
    public static int x4;
    public static int x5;
    
    public static int y1;
    public static int y2;
    public static int y3;
    public static int y4;
    public static int y5;

    public RobotClicker() {
        this.mouse_listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                RobotClicker.me = me;
                int clickcount = me.getClickCount();
                while(clickcount < amount){
                        if(clickcount == 1){
                            location1 = me.getLocationOnScreen();
                            x1 = (int) location1.getX();
                            y1 = (int) location1.getY();
                        }
                        if(clickcount == 2){
                            location2 = me.getLocationOnScreen();
                            x2 = (int) location2.getX();
                            y2 = (int) location2.getY(); 
                        }
                        if(clickcount == 3){
                            location3 = me.getLocationOnScreen();
                            x3 = (int) location3.getX();
                            y3 = (int) location3.getY(); 
                        }
                        if(clickcount == 4){
                            location4 = me.getLocationOnScreen();
                            x4 = (int) location4.getX();
                            y4 = (int) location4.getY(); 
                        }
                        if(clickcount == 5){
                            location5 = me.getLocationOnScreen();
                            x5 = (int) location5.getX();
                            y5 = (int) location5.getY(); 
                        }
                    clickcount = me.getClickCount();
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void mouseReleased(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void mouseEntered(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public void mouseExited(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    
    public int getDelay(int delay){
        delay = Integer.parseInt(GUI.txt_delay.getText());
        return delay;
    }
    
    public int getRepetitions(int repetitions){
        repetitions = Integer.parseInt(GUI.txt_repetitions.getText());
        return repetitions;
    }
    
    public Robot initRobot(Robot robot) throws AWTException{
        robot = new Robot();
        return robot;
    }
    
    public void clickRobot(Robot robot){
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);
    }
    
    public void clickCoordinates(Robot robot){
         
        Point location = MouseInfo.getPointerInfo().getLocation();
        int x = (int) location.getX();
        int y = (int) location.getY();
        
        robot.delay(5000);
        robot.mouseMove(x, y);
        robot.mousePress(BUTTON1_MASK);
        robot.mouseRelease(BUTTON1_MASK);
    }
    
    public void multiple_click(Robot robot, MouseEvent me){
        amount = Integer.parseInt(GUI.txt_multipleAmount.getText());
        mouse_listener.mouseClicked(me);
        switch(amount){
            case 1:
                multiple_click_one(robot);
                break;
            case 2:
                multiple_click_two(robot);
                break;
            case 3:
                multiple_click_three(robot);
                break;
            case 4:
                multiple_click_four(robot);
                break;
            case 5:
                multiple_click_five(robot);
                break;
            default:
                GUI.lbl_error.setText("Error occurred!");
        }       
        
    }
    
    public void multiple_click_one(Robot robot){
        robot.mouseMove(x1, y1);
        clickRobot(robot);
        int delay = Integer.parseInt(GUI.txt_delaymultiple.getText());
        robot.delay(delay);
    }
    
    public void multiple_click_two(Robot robot){
        robot.mouseMove(x1, y1);
        clickRobot(robot);
        int delay = Integer.parseInt(GUI.txt_delaymultiple.getText());
        robot.delay(delay);
        robot.mouseMove(x2, y2);
        clickRobot(robot);
    }
    
    public void multiple_click_three(Robot robot){
        robot.mouseMove(x1, y1);
        clickRobot(robot);
        int delay = Integer.parseInt(GUI.txt_delaymultiple.getText());
        robot.delay(delay);
        robot.mouseMove(x2, y2);
        clickRobot(robot);
        robot.delay(delay);
        robot.mouseMove(x3, y3);
        clickRobot(robot);
    }
    
    public void multiple_click_four(Robot robot){
        robot.mouseMove(x1, y1);
        clickRobot(robot);
        int delay = Integer.parseInt(GUI.txt_delaymultiple.getText());
        robot.delay(delay);
        robot.mouseMove(x2, y2);
        clickRobot(robot);
        robot.delay(delay);
        robot.mouseMove(x3, y3);
        clickRobot(robot);
        robot.delay(delay);
        robot.mouseMove(x4, y4);
        clickRobot(robot);
        robot.delay(delay);
    }
    
    public void multiple_click_five(Robot robot){
        robot.mouseMove(x1, y1);
        clickRobot(robot);
        int delay = Integer.parseInt(GUI.txt_delaymultiple.getText());
        robot.delay(delay);
        robot.mouseMove(x2, y2);
        clickRobot(robot);
        robot.delay(delay);
        robot.mouseMove(x3, y3);
        clickRobot(robot);
        robot.delay(delay);
        robot.mouseMove(x4, y4);
        clickRobot(robot);
        robot.delay(delay);
        robot.mouseMove(x5, y5);
        clickRobot(robot);
        robot.delay(delay);
    }
}