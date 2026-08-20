/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hedgeyourbet;

/**
 *
 * @author WAMASHUDU
 */


import javax.swing.*;
import java.awt.*;

public class HedgeYourBet1 extends JFrame {

    private JLabel questionLabel;
    private JCheckBox answer1;
    private JCheckBox answer2;
    private JCheckBox answer3;
    private JButton submitButton;

    private int questionNumber = 0;
    private int score = 0;

    // Five questions
    private String[] questions = {
        "Which language is mainly used for Android development?",
        "Which language is commonly used for data analysis?",
        "Which language is used to style web pages?",
        "Which language is known for object-oriented programming?",
        "Which language is commonly used for artificial intelligence?"
    };

    // Correct answers:
    // 0 = Java
    // 1 = Python
    // 2 = CSS
    private int[] correctAnswers = {
        0,
        1,
        2,
        0,
        1
    };

    public HedgeYourBet1() {

        setTitle("Hedge Your Bet");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        questionLabel = new JLabel();
        questionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        answer1 = new JCheckBox("Java");
        answer2 = new JCheckBox("Python");
        answer3 = new JCheckBox("CSS");

        submitButton = new JButton("Submit Answer");
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(Box.createVerticalStrut(30));
        panel.add(questionLabel);
        panel.add(Box.createVerticalStrut(20));

        panel.add(answer1);
        panel.add(answer2);
        panel.add(answer3);

        panel.add(Box.createVerticalStrut(20));
        panel.add(submitButton);

        add(panel);

        displayQuestion();

        submitButton.addActionListener(e -> checkAnswer());
    }

    private void displayQuestion() {

        questionLabel.setText(
            "Question " + (questionNumber + 1) + ": "
            + questions[questionNumber]
        );

        answer1.setSelected(false);
        answer2.setSelected(false);
        answer3.setSelected(false);
    }

    private void checkAnswer() {

        int numberSelected = 0;

        if (answer1.isSelected()) {
            numberSelected++;
        }

        if (answer2.isSelected()) {
            numberSelected++;
        }

        if (answer3.isSelected()) {
            numberSelected++;
        }

        boolean correctAnswerSelected = false;

        if (correctAnswers[questionNumber] == 0
                && answer1.isSelected()) {
            correctAnswerSelected = true;
        }

        if (correctAnswers[questionNumber] == 1
                && answer2.isSelected()) {
            correctAnswerSelected = true;
        }

        if (correctAnswers[questionNumber] == 2
                && answer3.isSelected()) {
            correctAnswerSelected = true;
        }

        // Calculate points
        if (correctAnswerSelected) {

            if (numberSelected == 1) {
                score += 5;
            } 
            else if (numberSelected == 2) {
                score += 2;
            } 
            else if (numberSelected == 3) {
                score += 1;
            }
        }

        questionNumber++;

        if (questionNumber < 5) {
            displayQuestion();
        } 
        else {
            showFinalScore();
        }
    }

    private void showFinalScore() {

        String message;

        if (score > 21) {
            message = "Fantastic!";
        } 
        else if (score > 15) {
            message = "Very good";
        } 
        else {
            message = "OK";
        }

        JOptionPane.showMessageDialog(
            this,
            "Your score is " + score + " out of 25.\n" + message
        );

        submitButton.setEnabled(false);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            HedgeYourBet1 game = new HedgeYourBet1();
            game.setVisible(true);
        });
    }
}