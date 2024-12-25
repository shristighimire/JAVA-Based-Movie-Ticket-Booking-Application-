    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == submitButton) {
            handleSubmission();
        } else if (event.getSource() == cancelButton) {
            handleCancel();
        }
    }

    private void handleSubmission() {
        String fullName = fullNameTextField.getText();
        String userId = userIdTextField.getText();
        String city = cityTextField.getText();
        String zipCode = zipCodeTextField.getText();
        String snack = snackOption.getSelectedItem().toString();
        boolean morning = morningOption.isSelected();
        boolean day = dayOption.isSelected();
        boolean evening = eveningOption.isSelected();

        String output = String.format(
            "Full Name: %s%nUser ID: %s%nCity: %s%nZip Code: %s%nSnack: %s%nTickets: Morning [%b], Day [%b], Evening [%b]",
            fullName, userId, city, zipCode, snack, morning, day, evening
        );
        JOptionPane.showMessageDialog(this, output);
    }

    private void handleCancel() {
        fullNameTextField.setText("");
        userIdTextField.setText("");
        cityTextField.setText("");
        zipCodeTextField.setText("");
        snackOption.setSelectedIndex(0);
        morningOption.setSelected(false);
        dayOption.setSelected(false);
        eveningOption.setSelected(false);
        messGroup.clearSelection();
        creditCardTextField.setText("");
        expirationDateTextField.setText("");
        cvvTextField.setText("");
    }
}
