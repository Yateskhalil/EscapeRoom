
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EscapeRoom {

    JTextField enter;
    JPanel panel;
    JLabel displayQuestion;
    static  JButton start, choice1,choice2;




    public static void main(String[] args) {
        new EscapeRoom();
        firstProblem();

    }

    public EscapeRoom() {
        panel = new JPanel();

        JFrame frame = new JFrame("Escape Room");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        displayQuestion = new JLabel();
        start = new JButton("Click to start");
        enter = new JTextField(10);


        panel.setBackground(Color.BLACK);
        enter.setBounds(90, 250, 200, 30);

        start.setBounds(90, 150, 200, 30);
        displayQuestion.setBounds(200, 20, 200, 30);

        choice1.setBounds(60,200,100,100);
        choice2.setBounds(50,50,150,150);

         panel.add(choice1);
        panel.add(choice2);
        panel.add(enter);
        panel.add(start);
        panel.add(displayQuestion);







        start.addActionListener(new StartListener());

        enter.setVisible(false);
        panel.setLayout(null);


        frame.add(panel);

        frame.setVisible(true);
    }
        public static void firstProblem(){






        }

    public class StartListener implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(Color.GRAY);
            start.setVisible(false);


        choice1.setBounds(50,50,100,100);
        choice2.setBounds(50,50,150,150);

            panel.add(choice1);
            panel.add(choice2);





        }




    }








}

