import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI_Manager {


        private CompetitorList competitorList;

        public GUI_Manager() {
            competitorList = new CompetitorList();
        }

        public void GraphicalUserManager() {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    OpenGraph();
                }
            });
        }

        private void OpenGraph() {

            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    OpenInterface(competitorList);
                }
            });

        }

        private static void OpenInterface(CompetitorList competitorList) {
            JFrame frame = new JFrame("");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




            JPanel table = new JPanel();

            JButton buttonTable = new JButton("View Table");
            buttonTable.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Define column names
                    String[] columnNames = {"Competitor Number", "Age", "Date of Birth", "First Name", "Category"};

                    // Create data array
                    Object[][] data = new Object[competitorList.getCompetitors().size()][columnNames.length];
                    for (int i = 0; i < competitorList.getCompetitors().size(); i++) {
                        Competitor competitor = competitorList.getCompetitors().get(i);
                        data[i][1] = competitor.getAge();
                        data[i][2] = competitor.getDateOfBirth();
                        data[i][3] = competitor.getName().getFirstName();
                        data[i][6] = competitor.getCategory();
                    }

                    JTable table = new JTable(data, columnNames);

                    JFrame tableFrame = new JFrame("Competitors");
                    tableFrame.add(new JScrollPane(table));
                    tableFrame.pack();
                    tableFrame.setVisible(true);
                }
            });
            table.add(buttonTable);

            frame.getContentPane().add(table);




            JPanel panelregister = new JPanel();
            JLabel register = new JLabel("Register all your competitors");
            JButton buttonreg = new JButton("This will add the competitor");
            buttonreg.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {


                        String firstName = JOptionPane.showInputDialog("Enter the competitors first name:");

                        String middleName = JOptionPane.showInputDialog("Enter the competitors middle name:");

                        String lastName = JOptionPane.showInputDialog("Enter the competitors last name:");

                        Name name = new Name(firstName, middleName, lastName);

                        String level = JOptionPane.showInputDialog("Enter level:");


                        String email = JOptionPane.showInputDialog("Enter email:");


                        String competition = JOptionPane.showInputDialog("Enter competition:");


                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "");
                    }
                }
            });

            panelregister.add(register);
            panelregister.add(buttonreg);


            JPanel inputcomp = new JPanel();
            JLabel view = new JLabel("View competitor name");
            JTextField textField = new JTextField(10);
            JButton function = new JButton("View");
            function.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
            inputcomp.add(view);
            inputcomp.add(textField);
            inputcomp.add(function);










            frame.getContentPane().add(inputcomp);

            frame.getContentPane().setLayout(new GridLayout(3, 1));

            frame.getContentPane().add(panelregister);

            frame.pack();
            frame.setVisible(true);





        }


}
