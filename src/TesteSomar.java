import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TesteSomar extends javax.swing.JFrame {

    public TesteSomar() {

        setTitle("Somar");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(15, 15));

        // Titulo da Calculadora
        JPanel panelTitulo = new JPanel(new FlowLayout());
        JLabel tituloTela = new JLabel("Calculadora Java:");
        panelTitulo.add(tituloTela);

        // Campos de entradas, dois
        JPanel panelCampo = new JPanel(new FlowLayout());
        JTextField campoValor1 = new JTextField(15);
        campoValor1.setOpaque(true);
        JTextField campoValor2 = new JTextField(15);
        campoValor2.setOpaque(true);
        JLabel tituloCampo = new JLabel("Calcular");


        // Botões par multiplicar, somar, subtrair e dividir
        JButton botaoSomar = new JButton("Somar");
        JButton botaoSubtrair = new JButton("Subtrair");
        JButton botaoMultiplicar = new JButton("Multiplicar");
        JButton botaoDividir = new JButton("Dividir");

        // Campo de resposta
        JPanel panelResultado = new JPanel (new FlowLayout());
        JLabel resultadoTela = new JLabel("");


        // Paineis recebem seus respectivos objetos
        panelCampo.add(tituloCampo);
        panelCampo.add(campoValor1);
        panelCampo.add(campoValor2);
        panelCampo.add(botaoSomar);
        panelCampo.add(botaoSubtrair);
        panelCampo.add(botaoMultiplicar);
        panelCampo.add(botaoDividir);
        panelResultado.add(resultadoTela);

        // Funções de cada botão
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try
                    {
                    double valor1 = Double.parseDouble(campoValor1.getText());
                    double valor2 = Double.parseDouble(campoValor2.getText());

                    resultadoTela.setText("Resultado: " + (valor1 + valor2));
                    resultadoTela.setForeground(Color.GREEN);
                    }
                catch (Exception ex) {
                    resultadoTela.setText("Erro com o resultado, digite apenas numeros");
                    resultadoTela.setForeground(Color.RED);
                }
            }
        });

        botaoSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    double valor1 = Double.parseDouble(campoValor1.getText());
                    double valor2 = Double.parseDouble(campoValor2.getText());

                    resultadoTela.setText("Resultado: " + (valor1 - valor2));
                    resultadoTela.setForeground(Color.GREEN);
                }
                catch (Exception ex) {
                    resultadoTela.setText("Erro com o resultado, digite apenas numeros ");
                    resultadoTela.setForeground(Color.RED);
                }
            }
        });

        botaoDividir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(campoValor1.getText());
                    double valor2 = Double.parseDouble(campoValor2.getText());
                    if (valor2 == 0 || valor1 == 0) {
                        resultadoTela.setText("Resultado: 0 (Divisão por zero não é permitida)");
                    }
                    else {
                        resultadoTela.setText("Resultado: " + (valor1 / valor2));
                        resultadoTela.setForeground(Color.GREEN);
                    }
                } catch (Exception ex) {
                    resultadoTela.setText("Erro com o resultado, digite apenas numeros ");
                    resultadoTela.setForeground(Color.RED);
                }
            }
        });

        botaoMultiplicar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(campoValor1.getText());
                    double valor2 = Double.parseDouble(campoValor2.getText());

                    resultadoTela.setText("Resultado: " + (valor1 * valor2));
                    resultadoTela.setForeground(Color.GREEN);
                }
                catch (Exception ex) {
                    resultadoTela.setText("Erro com o resultado, digite apenas numeros ");
                    resultadoTela.setForeground(Color.RED);
                }
            }
        });

        // adicionando a Tela
        add(panelTitulo, BorderLayout.NORTH);
        add(panelCampo, BorderLayout.CENTER);
        add(panelResultado, BorderLayout.SOUTH);






        setVisible(true);

    }
}