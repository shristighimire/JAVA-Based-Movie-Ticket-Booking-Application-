    private void setupWestPanel() {
        westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(10, 1));

        ticketLabel = new JLabel("Select Ticket Type:");
        morningOption = new JCheckBox("Morning Show (09:00-10:30)");
        dayOption = new JCheckBox("Afternoon Show (12:30-2:00)");
        eveningOption = new JCheckBox("Evening Show (6:30 to 8)");

        String[] snackList = {
            "Select Snacks Combo", "Popcorn & Soda", "Candy & Popcorn",
            "Soda & Candy", "Hot Asian Meal", "Oreo Dessert & Milkshake",
            "Hot Indian Food", "Mo:Mo", "Veg Platter", "Spicy Chicken Wings"
        };
        snackOption = new JComboBox<>(snackList);

        userIdTextField = new JTextField(15);
        cityTextField = new JTextField(15);
        zipCodeTextField = new JTextField(15);

        addComponents(westPanel, ticketLabel, morningOption, dayOption, eveningOption, snackOption);
        addComponents(westPanel, new JLabel("User ID:"), userIdTextField, new JLabel("City:"), cityTextField);
        addComponents(westPanel, new JLabel("Zip Code:"), zipCodeTextField);

        add(westPanel, BorderLayout.WEST);
    }
