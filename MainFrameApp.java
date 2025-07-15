/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainframeapp;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;

/**
 *
 * @author Arthur
 */
public class MainFrameApp extends JFrame{
    public MainFrameApp(){
       super("Interfaces Graficas");    //Super adiciona Título a Janela da Interface;
       Container Tela = getContentPane();
        setSize(400,400);
        setVisible(true);
        
        JLabel Text = new JLabel("Gráfico na Tela");   //Printa um Texto dentro da Janela
        Text.setFont(new Font("Serif", Font.BOLD,50)); //COMANDO e parametros da fonte do texto
        Text.setForeground(Color.red);   
        
        setLayout(null); //necessário p/ setBounds()
        
         JButton botaoSair ; //Cria Botões JButton 
            botaoSair = new JButton ("Sair");
            botaoSair.setBounds(145, 145, 100, 30);       //(pos_x,pos_y,largura,altura)
            botaoSair.addActionListener(
            new ActionListener(){
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Você saiu do Programa!");
            System.exit(0);
            }
            }
            );
        
        
        Tela.add(Text);
        Tela.add(botaoSair);
        setVisible(true);
        setLocationRelativeTo(null); //posiciona a janela no centro da tela
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        MainFrameApp mainFrameApp = new MainFrameApp();
        mainFrameApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
