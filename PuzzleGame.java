
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class PuzzleGame  implements ActionListener {

//    Creating a Frame
    Frame frame = new Frame("Puzzle Game");

//    Creating Objects of Buttons and a label
final Label label = new Label("Welcome to Puzzle Game");

Button b1= new Button("7");
Button b2= new Button("2");
Button b3= new Button("3");
Button b4= new Button("4");
Button b5= new Button("");
Button b6= new Button("6");
Button b7= new Button("1");
Button b8= new Button("8");

Button b9 = new Button("5");
Button refresh= new Button("New Game");

public void designFrame(){
    frame.setSize(310,450);
    frame.setLayout(null);
    frame.setBackground(new Color(255, 149, 81));
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

    }

    public void addComponents(){
//    Adding Buttons and setting their properties
        label.setBounds(10,40,250,30);
        label.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(label);

        b1.setBounds(10,80,100,100);
        b1.setBackground(new Color(137, 207, 253));
        b1.setFont(new Font("Arial",Font.BOLD,80));
        b1.setFocusable(false);
        frame.add(b1);

        b2.setBounds(110,80,100,100);
        b2.setBackground(new Color(137, 207, 253));
        b2.setFont(new Font("Arial",Font.BOLD,80));
        b2.setFocusable(false);
        frame.add(b2);

        b3.setBounds(210,80,100,100);
        b3.setBackground(new Color(137, 207, 253));
        b3.setFont(new Font("Arial",Font.BOLD,80));
        b3.setFocusable(false);
        frame.add(b3);

        b4.setBounds(10,180,100,100);
        b4.setBackground(new Color(137, 207, 253));
        b4.setFont(new Font("Arial",Font.BOLD,80));
        b4.setFocusable(false);
        frame.add(b4);

        b5.setBounds(110,180,100,100);
        b5.setBackground(new Color(137, 207, 253));
        b5.setFont(new Font("Arial",Font.BOLD,80));
        b5.setFocusable(false);
        frame.add(b5);

        b6.setBounds(210,180,100,100);
        b6.setBackground(new Color(137, 207, 253));
        b6.setFont(new Font("Arial",Font.BOLD,80));
        b6.setFocusable(false);
        frame.add(b6);

        b7.setBounds(10,280,100,100);
        b7.setBackground(new Color(137, 207, 253));
        b7.setFont(new Font("Arial",Font.BOLD,80));
        b7.setFocusable(false);
        frame.add(b7);

        b8.setBounds(110,280,100,100);
        b8.setBackground(new Color(137, 207, 253));
        b8.setFont(new Font("Arial",Font.BOLD,80));
        b8.setFocusable(false);
        frame.add(b8);

        b9.setBounds(210,280,100,100);
        b9.setBackground(new Color(137, 207, 253));
        b9.setFont(new Font("Arial",Font.BOLD,80));
        b9.setFocusable(false);
        frame.add(b9);




        refresh.setBounds(110,400,120,40);
        refresh.setBackground(new Color(137, 207, 253));
        refresh.setFont(new Font("Arial",Font.BOLD,20));
        refresh.setFocusable(false);
        frame.add(refresh);
    }

    public void ActionPerformed(){
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        refresh.addActionListener(this);
    }
  PuzzleGame(){
    addComponents();
    designFrame();
    ActionPerformed();
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source= e.getSource();

        if(source==b1){
            String number = b1.getLabel();
            if(b2.getLabel().equals("")){
                b2.setLabel(number);
                b1.setLabel("");
            }
            if (b4.getLabel().equals("")){
                b4.setLabel(number);
                b1.setLabel("");
            }

        }
        if(source==b2){
            String number=b2.getLabel();
            if(b1.getLabel().equals("")){
                b1.setLabel(number);
                b2.setLabel("");
            }
            if(b3.getLabel().equals("")){
                b3.setLabel(number);
                b2.setLabel("");
            }
            if(b5.getLabel().equals("")){
                b5.setLabel(number);
                b2.setLabel("");
            }
        }
        if(source==b3){
            String number=b3.getLabel();
            if(b2.getLabel().equals("")){
                b2.setLabel(number);
                b3.setLabel("");
            }
            if(b6.getLabel().equals("")){
                b6.setLabel(number);
                b3.setLabel("");
            }
        }
        if(source==b4){
            String number=b4.getLabel();
            if(b1.getLabel().equals("")){
                b1.setLabel(number);
                b4.setLabel("");
            }
            if(b7.getLabel().equals("")){
                b7.setLabel(number);
                b4.setLabel("");
            }
            if(b5.getLabel().equals("")){
                b5.setLabel(number);
                b4.setLabel("");
            }
        }
        if(source==b5){
            String number=b5.getLabel();
            if(b2.getLabel().equals("")){
                b2.setLabel(number);
                b5.setLabel("");
            }
            if(b6.getLabel().equals("")){
                b6.setLabel(number);
                b5.setLabel("");
            }
            if(b4.getLabel().equals("")){
                b4.setLabel(number);
                b5.setLabel("");
            }
            if(b8.getLabel().equals("")){
                b8.setLabel(number);
                b5.setLabel("");
            }
        }
        if(source==b6){
            String number=b6.getLabel();
            if(b9.getLabel().equals("")){
                b9.setLabel(number);
                b6.setLabel("");
            }
            if(b3.getLabel().equals("")){
                b3.setLabel(number);
                b6.setLabel("");
            }
            if(b5.getLabel().equals("")){
                b5.setLabel(number);
                b6.setLabel("");
            }
        }
        if(source==b7){
            String number=b7.getLabel();
            if(b4.getLabel().equals("")){
                b4.setLabel(number);
                b7.setLabel("");
            }
            if(b8.getLabel().equals("")){
                b8.setLabel(number);
                b7.setLabel("");
            }
        }
        if(source==b8){
            String number=b8.getLabel();
            if(b9.getLabel().equals("")){
                b9.setLabel(number);
                b8.setLabel("");
            }
            if(b7.getLabel().equals("")){
                b7.setLabel(number);
                b8.setLabel("");
            }
            if(b5.getLabel().equals("")){
                b5.setLabel(number);
                b8.setLabel("");
            }
        }
        if(source==b9){
            String number=b9.getLabel();
            if(b6.getLabel().equals("")){
                b6.setLabel(number);
                b9.setLabel("");
            }
            if(b8.getLabel().equals("")){
                b8.setLabel(number);
                b9.setLabel("");
            }

    }
        if(source==refresh){
            b1.setLabel("7");
            b2.setLabel("2");
            b3.setLabel("3");
            b4.setLabel("4");
            b5.setLabel("");
            b6.setLabel("6");
            b7.setLabel("1");
            b8.setLabel("8");
            b9.setLabel("5");
        }

        if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()
                .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")
                &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()
                .equals("8")&&b9.getLabel().equals("")){
            JOptionPane.showMessageDialog(frame,"Congrats You won Hooray");
        }

}

    public static void main(String[] args) {
        PuzzleGame newGame= new PuzzleGame();
    }


}
