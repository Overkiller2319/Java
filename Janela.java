/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.janela;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.*;
/**
 *
 * @author Arthur
 */
public class Janela extends JFrame{
    public Janela(){
    super("Game");
    setSize(600,400);
    setVisible(true);
    
    Container tela = getContentPane();
    tela.setBackground(Color.black);
    
    JLabel h1 = new JLabel("GAME PLAY", JLabel.CENTER);
    h1.setFont( new Font("Segoe UI",Font.BOLD,50));
    h1.setForeground(Color.green);
    
    tela.add(h1);
    setLocationRelativeTo(null); //posiciona a janela no centro da tela
    }
    public static void main(String[] args) {
        System.out.println("Play VideoGAMES!");
        Janela j1 = new Janela();
         j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
