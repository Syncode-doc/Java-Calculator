/*
   Synclaire Williams-Ridley
   Class: Comp 167  Section: 003
   Date: 15 April 2024
   Description: Creating a calculator using GUI components
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculating implements ActionListener {

    static double num1 = 0, num2 = 0;
    static String operator;

    public static void main(String[] args) {

        // making the frame for the calculator
        JFrame f = new JFrame("CI- Calculator");
        f.setSize(450, 600);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // Making a color for the panel.
        Color myColor = new Color(213,204,255);
        Color boxColor = new Color(235,235,255);
        Color buttonColor = new Color(224,234,255);
        Color trigButtColor = new Color(241,227,255);

        //f.setBackground(outline);


        JPanel content = new JPanel(null);
        content.setBackground(myColor);
        f.setContentPane(content);


        // Making a rectangle for the text fields.
        Rectangle inputBox = new Rectangle(5, 5, 430, 35);



        // Making rectangle for output box
        Rectangle outputBox = new Rectangle(5, 45, 430, 40);

        // Making the input text field
        JTextField textField1 = new JTextField();
        textField1.setSize(425, 30);
        textField1.setBounds(inputBox);
        textField1.setEditable(false);
        textField1.setBackground(boxColor);


        f.add(textField1);

        // making the output text field
        JTextField textField2 = new JTextField();
        textField2.setSize(425, 40);
        textField2.setBounds(outputBox);
        textField2.setEditable(false);
        textField2.setBackground(boxColor);
        f.add(textField2);


//************** My Number Buttons *******************

        JButton nine = new JButton("9");
        nine.setText("9");
        nine.setBounds(150, 150, 60, 40);
        nine.setFocusable(false);
        nine.setBackground(buttonColor);
        f.add(nine);
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nineText = textField1.getText() + nine.getText();
                textField1.setText(nineText);
            }
        });


        JButton eight = new JButton("8");
        eight.setText("8");
        eight.setBounds(80, 150, 60, 40);
        eight.setFocusable(false);
        eight.setBackground(buttonColor);
        f.add(eight);
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eightText = textField1.getText() + eight.getText();
                textField1.setText(eightText);
            }
        });


        JButton seven = new JButton("7");
        seven.setText("7");
        seven.setBounds(10, 150, 60, 40);
        seven.setFocusable(false);
        seven.setBackground(buttonColor);
        f.add(seven);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sevenText = textField1.getText() + seven.getText();
                textField1.setText(sevenText);
            }
        });


        JButton six = new JButton("6");
        six.setText("6");
        six.setBounds(150, 200, 60, 40);
        six.setFocusable(false);
        six.setBackground(buttonColor);
        f.add(six);
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sixText = textField1.getText() + six.getText();
                textField1.setText(sixText);
            }
        });


        JButton five = new JButton("5");
        five.setText("5");
        five.setBounds(80, 200, 60, 40);
        five.setFocusable(false);
        five.setBackground(buttonColor);
        f.add(five);
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fiveText = textField1.getText() + five.getText();
                textField1.setText(fiveText);
            }
        });


        JButton four = new JButton("4");
        four.setText("4");
        four.setBounds(10, 200, 60, 40);
        four.setFocusable(false);
        four.setBackground(buttonColor);
        f.add(four);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fourText = textField1.getText() + four.getText();
                textField1.setText(fourText);
            }
        });


        JButton three = new JButton("3");
        three.setText("3");
        three.setBounds(150, 250, 60, 40);
        three.setFocusable(false);
        three.setBackground(buttonColor);
        f.add(three);
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String threeText = textField1.getText() + three.getText();
                textField1.setText(threeText);
            }
        });


        JButton two = new JButton();
        two.setText("2");
        two.setBounds(80, 250, 60, 40);
        two.setFocusable(false);
        two.setBackground(buttonColor);
        f.add(two);
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String twoText = textField1.getText() + two.getText();
                textField1.setText(twoText);
            }
        });


        JButton one = new JButton();
        one.setText("1");
        one.setBounds(10, 250, 60, 40);
        one.setFocusable(false);
        one.setBackground(buttonColor);
        f.add(one);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oneText = textField1.getText() + one.getText();
                textField1.setText(oneText);
            }
        });


        JButton zero = new JButton();
        zero.setText("0");
        zero.setBounds(10, 300, 60, 40);
        zero.setFocusable(false);
        zero.setBackground(buttonColor);
        f.add(zero);

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String zeroText = textField1.getText() + zero.getText();
                textField1.setText(zeroText);
                //code for zero button
            }
        });
//************ End of Number Buttons ************************************



// *************************** Simple Operation buttons ************************

        JButton plus = new JButton("+");
        plus.setText("+");
        plus.setBounds(230, 200, 50, 40);
        plus.setFocusable(false);
        plus.setBackground(buttonColor);
        f.add(plus);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == plus) {
                    num1 = Double.parseDouble((textField1.getText()));
                    operator = "+";
                    textField1.setText(" ");

                }
            }
        });

        JButton minus = new JButton("-");
        minus.setText("-");
        minus.setBounds(290, 200, 50, 40);
        minus.setFocusable(false);
        minus.setBackground(buttonColor);
        f.add(minus);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == minus) {
                    num1 = Double.parseDouble((textField1.getText()));
                    operator = "-";
                    textField1.setText(" ");

                }
            }
        });

        JButton multi = new JButton("*");
        multi.setText("*");
        multi.setBounds(230, 150, 50, 40);
        multi.setFocusable(false);
        multi.setBackground(buttonColor);
        f.add(multi);
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == multi) {
                    num1 = Double.parseDouble((textField1.getText()));
                    operator = "*";
                    textField1.setText(" ");
                }
            }
        });

        JButton divide = new JButton("/");
        divide.setBounds(290, 150, 50, 40);
        divide.setFocusable(false);
        divide.setBackground(buttonColor);
        f.add(divide);
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == divide) {
                     num1 = Double.parseDouble((textField1.getText()));
                    operator = "/";
                    textField1.setText(" ");
                }
            }
        });

// ***************** End of simple operation buttons *****************



// ************************** Equals Sign **************************
        JButton equals = new JButton("=");
        equals.setBounds(230, 250, 110, 40);
        equals.setFocusable(false);
        equals.setBackground(buttonColor);
        f.add(equals);
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == equals) {

                    /* Switch function to add operations to the buttons. */
                    switch (operator) {
                        case "+":
                            num2 = num1 + Double.parseDouble((textField1.getText()));
                            break;
                        case "-":
                            num2 = num1 - Double.parseDouble((textField1.getText()));
                            break;
                        case "*":
                            num2 = num1 * Double.parseDouble((textField1.getText()));
                            break;
                        case "/":
                            if (num2 != 0) {
                                num2 = num1 / Double.parseDouble((textField1.getText()));
                            }
                            else {
                                textField2.setText("ERROR");
                            }
                            break;

                        case "sin":
                            num2 = Math.sin(Math.toRadians(num1));
                            break;
                        case "cos":
                            num2 = Math.cos(Math.toRadians(num1));
                            break;
                        case "tan":
                            num2 = Math.tan(Math.toRadians(num1));
                            break;
                        case "%":
                            num2 = num1 / 100;
                            break;
                        case "+-":
                            num2 = num1 * -1;
                            break;
                        case "pow2":
                            num2 = num1 * num1;
                            break;
                        case "pow3":
                            num2 = num1 * num1 * num1;
                            break;
                        case "log":
                            num2 = Math.log10(num1);
                            break;
                        case "1/n":
                            num2 = 1 / num1;
                            break;
                        case "asin":
                            num2 = Math.asin(num1);
                            break;
                        case "sinh":
                            num2 = Math.sinh(num1);
                            break;
                        case "acos":
                            num2 = Math.acos(num1);
                            break;
                        case "cosh":
                            num2 = Math.cosh(num1);
                            break;
                        case "atan":
                            num2 = Math.atan(num1);
                            break;
                        case "ln":
                            num2 = Math.log(num1);
                            break;
                        case "tanh":
                            num2 = Math.tanh(num1);
                            break;
                        case "10^n":
                            num2 = Math.pow(10,num1);
                            break;
                        case "radical":
                            num2 = Math.sqrt(num1);
                            break;
                        case "mod":
                            num2 = num1 % Double.parseDouble((textField1.getText()));
                            break;
                        case "abs":
                            num2 = Math.abs(num1);
                            break;

                    }
                    // printing the output on the second text field
                    textField2.setText(String.valueOf(num2));
                    num1 = num2;

                }
            }
        });


// ***************** End of equals sign *****************




// *************** Complicated operation buttons ***************************

        JButton clear = new JButton("C");
        clear.setText("C");
        clear.setVisible(true);
        clear.setBounds(360, 100, 60, 40);
        clear.setFocusable(false);
        clear.setBackground(buttonColor);
        //clear.setBorder((Border) new RoundedBorder(10));
        f.add(clear);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == clear) {
                    textField1.setText("");
                    textField2.setText("");
                }
            }
        });

        JButton powOf2 = new JButton("x²");
        powOf2.setBounds(360, 150, 60, 40);
        powOf2.setFocusable(false);
        powOf2.setBackground(buttonColor);
        f.add(powOf2);
        powOf2.addActionListener(e -> {
            operator = "pow2";
            num1 = Double.parseDouble(textField1.getText());
            String powOf2Text = textField1.getText() + powOf2.getText();
            textField1.setText(powOf2Text);
        });

        JButton powOf3 = new JButton("x³");
        powOf3.setBounds(360, 200, 60, 40);
        powOf3.setFocusable(false);
        powOf3.setBackground(buttonColor);
        f.add(powOf3);
        powOf3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "pow3";
                num1 = Double.parseDouble(textField1.getText());
                String powOf3Text = textField1.getText() + powOf3.getText();
                textField1.setText(powOf3Text);
            }
        });

        JButton mod = new JButton("mod");
        mod.setBounds(360, 250, 60, 40);
        mod.setFocusable(false);
        mod.setBackground(buttonColor);
        f.add(mod);

        mod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "mod";
                num1 = Double.parseDouble(textField1.getText());
                textField1.setText("");
                //num2 = Double.parseDouble(textField1.getText());
            }
        });

        JButton radical = new JButton();
        radical.setText("√");
        radical.setBounds(360, 300, 60, 40);
        radical.setFocusable(false);
        radical.setBackground(buttonColor);
        f.add(radical);
        radical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "radical";
                num1 = Double.parseDouble(textField1.getText());
                String radText = textField1.getText() + radical.getText();
                textField1.setText(radText);
            }
        });

        JButton percent = new JButton("%");
        percent.setBounds(290, 300, 50, 40);
        percent.setFocusable(false);
        percent.setBackground(buttonColor);
        f.add(percent);
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "%";
                num1 = Double.parseDouble(textField1.getText());
                String percentText = textField1.getText() + percent.getText();
                textField1.setText(percentText);

            }
        });

        JButton plusMinus = new JButton("±");
        plusMinus.setBounds(150, 300, 60, 40);
        plusMinus.setFocusable(false);
        plusMinus.setBackground(buttonColor);
        f.add(plusMinus);
        plusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "+-";
                num1 = Double.parseDouble(textField1.getText());
                String plusMinusText = textField1.getText() + plusMinus.getText();
                textField1.setText(plusMinusText);
            }
        });

        JButton decimal = new JButton(".");
        decimal.setBounds(80, 300, 60, 40);
        decimal.setFocusable(false);
        decimal.setBackground(buttonColor);
        f.add(decimal);

        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String decimalText = textField1.getText() + decimal.getText();
                textField1.setText(decimalText);
            }
        });


        JButton oneOverN = new JButton("1/n");
        //oneOverN.setText("1/n");
        oneOverN.setBounds(230, 300, 50, 40);
        oneOverN.setFocusable(false);
        oneOverN.setFont(new Font("Arial", Font.BOLD,11));
        oneOverN.setBackground(buttonColor);
        f.add(oneOverN);
        oneOverN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "1/n";
                num1 = Double.parseDouble(textField1.getText());
                String oneOverNText = textField1.getText() + oneOverN.getText();
                textField1.setText(oneOverNText);

            }
        });

 // ******************** End Complicated operation buttons ***************************




// ******************************** Trig Buttons ************************************

        JButton sin = new JButton("sin");
        sin.setBounds(10, 390, 75, 40);
        sin.setFocusable(false);
        sin.setBackground(trigButtColor);
        f.add(sin);
        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "sin";
                num1 = Double.parseDouble(textField1.getText());
                String sinText = textField1.getText() + sin.getText();
                textField1.setText(sinText);

            }
        });

        JButton cos = new JButton("cos");
        cos.setBounds(95, 390, 75, 40);
        cos.setFocusable(false);
        cos.setBackground(trigButtColor);
        f.add(cos);
        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "cos";
                num1 = Double.parseDouble(textField1.getText());
                String cosText = textField1.getText() + cos.getText();
                textField1.setText(cosText);
            }
        });

        JButton tan = new JButton("tan");
        tan.setBounds(180, 390, 75, 40);
        tan.setFocusable(false);
        tan.setBackground(trigButtColor);
        f.add(tan);
        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "tan";
                num1 = Double.parseDouble(textField1.getText());
                String tanText = textField1.getText() + tan.getText();
                textField1.setText(tanText);

            }
        });

        JButton log = new JButton("log");
        log.setBounds(265, 390, 75, 40);
        log.setFocusable(false);
        log.setBackground(trigButtColor);
        f.add(log);
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "log";
                num1 = Double.parseDouble(textField1.getText());
                String logText = textField1.getText() + log.getText();
                textField1.setText(logText);
            }
        });

        JButton ln = new JButton("ln");
        ln.setBounds(350, 390, 75, 40);
        ln.setFocusable(false);
        ln.setBackground(trigButtColor);
        f.add(ln);
        ln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "ln";
                num1 = Double.parseDouble(textField1.getText());
                String lnText = textField1.getText() + ln.getText();
                textField1.setText(lnText);
            }
        });

        JButton asin = new JButton("asin");
        asin.setBounds(10, 440, 75, 40);
        asin.setFocusable(false);
        asin.setBackground(trigButtColor);
        f.add(asin);
        asin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "asin";
                num1 = Double.parseDouble(textField1.getText());
                String asinText = textField1.getText() + asin.getText();
                textField1.setText(asinText);
            }
        });

        JButton acos = new JButton("acos");
        acos.setBounds(95, 440, 75, 40);
        acos.setFocusable(false);
        acos.setBackground(trigButtColor);
        f.add(acos);
        acos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "acos";
                num1 = Double.parseDouble(textField1.getText());
                String acosText = textField1.getText() + acos.getText();
                textField1.setText(acosText);
            }
        });

        JButton atan = new JButton("atan");
        atan.setBounds(180, 440, 75, 40);
        atan.setFocusable(false);
        atan.setBackground(trigButtColor);
        f.add(atan);
        atan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "atan";
                num1 = Double.parseDouble(textField1.getText());
                String atanText = textField1.getText() + atan.getText();
                textField1.setText(atanText);
            }
        });

        JButton a10PowN = new JButton("10^n");
        a10PowN.setBounds(265, 440, 75, 40);
        a10PowN.setFocusable(false);
        a10PowN.setBackground(trigButtColor);
        f.add(a10PowN);
        a10PowN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "10^n";
                num1 = Double.parseDouble(textField1.getText());
                String a10PowNText = textField1.getText() + a10PowN.getText();
                textField1.setText(a10PowNText);
            }
        });

        JButton abs = new JButton("abs");
        abs.setBounds(350, 440, 75, 40);
        abs.setFocusable(false);
        abs.setBackground(trigButtColor);
        f.add(abs);
        abs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "abs";
                String absText = textField1.getText() + abs.getText();
                textField1.setText(absText);
                num1 = Double.parseDouble(textField1.getText());
            }
        });

        JButton sinh = new JButton("sinh");
        sinh.setBounds(10, 490, 80, 40);
        sinh.setFocusable(false);
        sinh.setBackground(trigButtColor);
        f.add(sinh);
        sinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "sinh";
                num1 = Double.parseDouble(textField1.getText());
                String sinhText = textField1.getText() + sinh.getText();
                textField1.setText(sinhText);
            }
        });

        JButton cosh = new JButton("cosh");
        cosh.setBounds(95, 490, 75, 40);
        cosh.setFocusable(false);
        cosh.setBackground(trigButtColor);
        f.add(cosh);
        cosh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "cosh";
                num1 = Double.parseDouble(textField1.getText());
                String coshText = textField1.getText() + cosh.getText();
                textField1.setText(coshText);
            }
        });

        JButton tanh = new JButton("tanh");
        tanh.setBounds(180, 490, 75, 40);
        tanh.setFocusable(false);
        tanh.setBackground(trigButtColor);
        f.add(tanh);
        tanh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "tanh";
                num1 = Double.parseDouble(textField1.getText());
                String tanhText = textField1.getText() + tanh.getText();
                textField1.setText(tanhText);
            }
        });

        JButton exit = new JButton("EXIT");
        exit.setBounds(265, 490, 160, 40);
        exit.setFocusable(false);
        exit.setBackground(trigButtColor);
        f.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                System.exit(i);
            }
        });

// *********************** End Trig Buttons ******************************

        // making the frame visible
        f.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}



