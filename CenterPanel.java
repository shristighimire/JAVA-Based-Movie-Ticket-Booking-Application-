    private void setupCenterPanel() {
        centerPanel = new JPanel(new GridLayout(2, 2));

        messOption = new JRadioButton("Don't Mess With Her");
        messIcon = resizeImage("images/mess_image.png", 400, 500);
        messImage = new JLabel(messIcon);

        maleOption = new JRadioButton("Male Lead");
        maleIcon = resizeImage("images/male_image.png", 400, 500);
        maleImage = new JLabel(maleIcon);

        messGroup = new ButtonGroup();
        messGroup.add(messOption);
        messGroup.add(maleOption);

        centerPanel.add(messOption);
        centerPanel.add(messImage);
        centerPanel.add(maleOption);
        centerPanel.add(maleImage);

        add(centerPanel, BorderLayout.CENTER);
    }
