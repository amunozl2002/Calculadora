import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    float num;
    float resultado;
    int opc;
    boolean isSum;
    boolean isDifference;
    boolean isMultiply;
    boolean isDivision;
    boolean isModule;
    private JPanel CalculatorTextField;
    private JPanel CalculatorPanel;
    private JButton button1;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton cButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button10;
    private JButton button11;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JLabel CalculatorLabel;
    private JTextField pantalla;

    public CalculadoraGUI() {

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + "9");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = "";
                // elimina el último caracter
                if (pantalla.getText() != null && pantalla.getText().length() > 0) {
                    mensaje = pantalla.getText().substring(0, pantalla.getText().length() - 1);
                }
                pantalla.setText(mensaje);
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
                num = 0;
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Float.parseFloat(pantalla.getText());
                isSum = true;
                opc = 1;
                pantalla.setText("");

            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Float.parseFloat(pantalla.getText());
                isDifference = true;
                opc = 2;
                pantalla.setText("");
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Float.parseFloat(pantalla.getText());
                isMultiply = true;
                opc = 3;
                pantalla.setText("");
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Float.parseFloat(pantalla.getText());
                isDivision = true;
                opc = 4;
                pantalla.setText("");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Float.parseFloat(pantalla.getText());
                isModule = true;
                opc = 5;
                pantalla.setText("");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText(pantalla.getText() + ".");
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* if (isSum) {
                    resultado = (num + Float.parseFloat(pantalla.getText()));
                } else if (isDifference) {
                    resultado = (num - Float.parseFloat(pantalla.getText()));
                } else if (isMultiply) {
                    resultado = (num * Float.parseFloat(pantalla.getText()));
                } else if (isDivision) {
                    resultado = (num / Float.parseFloat(pantalla.getText()));
                } else if (isModule) {
                    resultado = (num % Float.parseFloat(pantalla.getText()));
                }

                 */
                switch (opc) {
                    case 1:
                        resultado = (num + Float.parseFloat(pantalla.getText()));
                        break;
                    case 2:
                        resultado = (num - Float.parseFloat(pantalla.getText()));
                        break;
                    case 3:
                        resultado = (num * Float.parseFloat(pantalla.getText()));
                        break;
                    case 4:
                        resultado = (num / Float.parseFloat(pantalla.getText()));
                        break;
                    case 5:
                        resultado = (num % Float.parseFloat(pantalla.getText()));
                        break;
                    default:
                        pantalla.setText("Error");
                        break;


                }


                isSum = false;
                isDifference = false;
                isMultiply = false;
                isDivision = false;
                isModule = false;
                opc = 0;

                pantalla.setText(resultado + "");

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculadoraGUI");
        frame.setContentPane(new CalculadoraGUI().CalculatorPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
