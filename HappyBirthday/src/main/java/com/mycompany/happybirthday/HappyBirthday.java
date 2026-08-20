/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.happybirthday;

/**
 *
 * @author VUSANI
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HappyBirthday{
    public static void main(String[] args){
        JFrame frame = new JFrame("Happy Birthday Vusani");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                        super.paintComponent(g);
                        g.setColor(Color.RED);
                        g.fillOval(150, 100, 40, 40);
                        
                        g.setColor(Color.BLUE);
                        g.setFont(new Font("Arial", Font.BOLD, 24));
                        g.setFont(new Font("Arial", Font.ITALIC, 18));
                        g.drawString("Happy Birthday Vusani!", 50, 50);
                        g.drawString("I love you alot!", 50, 80);
                    }
        };
                
                panel.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent e){
                    Graphics g = panel.getGraphics();
                    g.setColor(Color.WHITE);
                    g.fillOval(150, 100, 40, 40);
                    g.setColor(Color.BLACK);
                    g.setFont(new Font("Arial", Font.BOLD, 24));
                    g.drawString("Wuuuh!", 150, 150);
                }
                });
                
                frame.add(panel);
                frame.setVisible(true);
    }
    }

