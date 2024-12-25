package com.example.movieticket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class MovieTicketApp extends JFrame implements ActionListener {
    private JLabel fullNameLabel, ticketLabel, messImage, maleImage;
    private JTextField fullNameTextField, userIdTextField, cityTextField, zipCodeTextField;
    private JPanel northPanel, westPanel, centerPanel, southPanel;
    private JCheckBox morningOption, dayOption, eveningOption;
    private JComboBox<String> snackOption;
    private JRadioButton messOption, maleOption;
    private ButtonGroup messGroup;
    private JButton submitButton, cancelButton;
    private ImageIcon messIcon, maleIcon;
    private JLabel streamingLabel;
    private JTextField creditCardTextField, expirationDateTextField, cvvTextField;

    public MovieTicketApp() {
        super("Movie Ticket App");
        initializeUI();
    }
