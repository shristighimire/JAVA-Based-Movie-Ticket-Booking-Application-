    private void setupSouthPanel() {
        southPanel = new JPanel(new GridLayout(4, 2));

        creditCardTextField = new JTextField(15);
        expirationDateTextField = new JTextField(7);
        cvvTextField = new JTextField(3);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);

        addComponents(southPanel,
            new JLabel("Credit Card Number:"), creditCardTextField,
            new JLabel("Expiration Date (MM/YY):"), expirationDateTextField,
            new JLabel("CVV Code:"), cvvTextField,
            submitButton, cancelButton
        );

        add(southPanel, BorderLayout.SOUTH);
    }
