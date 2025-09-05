import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TesteSomar extends javax.swing.JFrame {

    public TesteSomar() {

        setTitle("Somar");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloExplicativo = new JLabel("Digite dois valores numericos");
        tituloExplicativo.setHorizontalAlignment(SwingConstants.CENTER);

        // Dois campo de texto para calcular o valor
        JTextField campoValor1 = new JTextField(13);
        JTextField campoValor2 = new JTextField(13);

        // Botão para somar, multiplicar
        JButton botaoSomar = new JButton("Calcular");
        JButton botaoMulti = new JButton("Multiplicar");

        // Local onde irá aparecer a resposta
        JLabel resposta = new JLabel("");
        resposta.setHorizontalAlignment(JLabel.CENTER);

        botaoSomar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try
                    {
                    double valor1 = Double.parseDouble(campoValor1.getText());
                    double valor2 = Double.parseDouble(campoValor2.getText());
                    double resultado = valor1 + valor2;

                    resposta.setText("Resultado: " + resultado);
                    resposta.setForeground(Color.GREEN);
                    }
                catch (Exception ex)
                    {
                        resposta.setText("Erro ao calcular, digite apenas numeros");
                        resposta.setForeground(Color.RED);
                    }

            }
        });

        botaoMulti.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try
                {
                    double valor1 = Double.parseDouble(campoValor1.getText());
                    double valor2 = Double.parseDouble(campoValor2.getText());
                    double resultado = valor1 * valor2;

                    resposta.setText("Resultado: " + resultado);
                }
                catch (Exception ex)
                {
                    resposta.setText("Erro ao calcular, digite apenas numeros");
                }

            }
        });

        add(tituloExplicativo);
        add(campoValor1);
        add(campoValor2);
        add(botaoSomar);
        add(botaoMulti);
        add(resposta);
        setVisible(true);

    }
}