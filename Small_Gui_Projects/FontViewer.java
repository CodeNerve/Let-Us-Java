import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.GraphicsEnvironment;


class FontFrame extends JFrame{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private JLabel label;
    private JCheckBox italiCheckBox;
    private JCheckBox boldCheckBox;
    private JRadioButton smallButton;
    private JRadioButton mediumButton;
    private JRadioButton largeButton;
    private JComboBox<String> facenameCombo;
    private ActionListener listener;

    public FontFrame(){
        label = new JLabel("Big Java");
        add(label, BorderLayout.CENTER);
        listener = new ChoiceListener();
        createControlPanel();
        setLabelFont();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }


    class ChoiceListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            setLabelFont();
        }
    }

    public void createControlPanel(){
        JPanel facenamePanel = createComboBox();
        JPanel sizeGroupPanel = createCheckBoxes();
        JPanel styleGroupPanel = createRadioButtons();


        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3,1));
        controlPanel.add(facenamePanel);
        controlPanel.add(sizeGroupPanel);
        controlPanel.add(styleGroupPanel);

        add(controlPanel, BorderLayout.SOUTH);
    }

    public JPanel createComboBox(){
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        facenameCombo = new JComboBox<String>();
        for(String fontFamilyName: fonts){
            facenameCombo.addItem(fontFamilyName);
        }
        facenameCombo.addActionListener(listener);
        JPanel panel = new JPanel();
        panel.add(facenameCombo);
        return panel; 
    }

    public JPanel createCheckBoxes(){
        italiCheckBox = new JCheckBox("Italic");
        italiCheckBox.addActionListener(listener);
        boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.addActionListener(listener);

        JPanel panel = new JPanel();
        panel.add(italiCheckBox);
        panel.add(boldCheckBox);

        panel.setBorder(new TitledBorder(new EtchedBorder(),"Style"));

        return panel;
    }

    public JPanel createRadioButtons(){
        smallButton = new JRadioButton("Small");
        smallButton.addActionListener(listener);
        mediumButton = new JRadioButton("Medium");
        mediumButton.addActionListener(listener);
        largeButton = new JRadioButton("Large");
        largeButton.addActionListener(listener);

        ButtonGroup group = new ButtonGroup();

        group.add(smallButton);
        group.add(mediumButton);
        group.add(largeButton);

        JPanel panel = new JPanel();

        panel.add(smallButton);
        panel.add(mediumButton);
        panel.add(largeButton);
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));
        return panel;
    }

    public void setLabelFont(){
        String facename = (String) facenameCombo.getSelectedItem();
        
        int style = 0;
        if(italiCheckBox.isSelected()){
            style = style + Font.ITALIC;
        }
        if(boldCheckBox.isSelected()){
            style = style + Font.BOLD;
        }

        int size = 0;
        final int SMALL_SIZE = 24;
        final int MEDIUM_SIZE = 36;
        final int LARGE_SIZE = 48;

        if(smallButton.isSelected()){
            size = SMALL_SIZE;
        }
        else if (mediumButton.isSelected()){
            size = MEDIUM_SIZE;
        }else if (largeButton.isSelected()){
            size = LARGE_SIZE;
        }
        label.setFont(new Font(facename, style, size));
        label.repaint();
    }
}

public class FontViewer{
    public static void main(String[] args) {
        JFrame frame = new FontFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Font Viewer");
        frame.setVisible(true);
    }
}