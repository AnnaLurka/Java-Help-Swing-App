package r04;

import javax.swing.*;
import java.awt.*;

public class HelpSwing {

    public HelpSwing() {
        String[] keyWords = new String[]{"if", "switch", "for", "while", "do-while", "break", "continue"};

        JFrame frame = new JFrame("Java Help Center - Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,700);
        frame.setLocation(700,200);
        frame.setVisible(true);

        JList<String> options = new JList<>(keyWords);
        options.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane  optionsScrollPane = new JScrollPane(options);
        optionsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        optionsScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        optionsScrollPane.setPreferredSize(new Dimension(100, 160));
        options.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel help = new JLabel("Choose an option:");
        JScrollPane helpScrollPane = new JScrollPane(help);
        helpScrollPane.setPreferredSize(new Dimension(500, 400));
        helpScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        helpScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        help.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        Font font = new Font("courier new", Font.BOLD, 18);
        help.setFont(font);
        options.setFont(font);

        Color optionsColour = new Color(255,255,204);
        options.setBackground(optionsColour);

        frame.add(BorderLayout.NORTH, optionsScrollPane);
        frame.add(BorderLayout.CENTER, helpScrollPane);

        options.addListSelectionListener(e -> {
            int index = options.getSelectedIndex();
            String choice = keyWords[index];
            switch(choice) {
                case "if":
                    help.setText("<html>If statement:" +
                            "<br>" +
                            "<br><pre>if(booleanExpression) {</pre>" +
                            "<br><pre>    instructions;</pre>" +
                            "<br><pre>} else {</pre>" +
                            "<br><pre>    instructions;</pre>" +
                            "<br>}</html>");
                    break;
                case "switch":
                    help.setText("<html>Switch statement:" +
                            "<br>" +
                            "<br><pre>switch(variableToTest) {</pre>" +
                            "<br><pre>    case constantExpression:</pre>" +
                            "<br><pre>        instructions;</pre>" +
                            "<br><pre>        break;</pre>" +
                            "<br><pre>    // ...</pre>" +
                            "<br><pre>    default:</pre>" +
                            "<br><pre>        instructions;</pre>" +
                            "<br>}</html>");
                    break;
                case "for":
                    help.setText("<html>For statement:" +
                            "<br>" +
                            "<br><pre>for(initialization; booleanExpression; updateStatement) {</pre>" +
                            "<br><pre>    instructions;</pre>" +
                            "<br>}</html>");
                    break;
                case "while":
                    help.setText("<html>While statement:" +
                            "<br>" +
                            "<br><pre>while(booleanExpression) {</pre>" +
                            "<br><pre>    instructions;</pre>" +
                            "<br>}</html>");
                    break;
                case "do-while":
                    help.setText("<html>Do-while statement:" +
                            "<br>" +
                            "<br><pre>do {</pre>" +
                            "<br><pre>    instructions;</pre>" +
                            "<br><pre>} while(booleanExpression);</pre></html>");
                    break;
                case "break":
                    help.setText("<html>Break statement:" +
                            "<br>" +
                            "<br>break (optionalLabel); </html>");
                    break;
                case "continue":
                    help.setText("<html>Continue statement:" +
                            "<br>" +
                            "<br>continue (optionalLabel); </html>");
                    break;
            }
        });
    }

    public static void main(String[] args) throws java.io.IOException{
        SwingUtilities.invokeLater(HelpSwing::new);
    }
}