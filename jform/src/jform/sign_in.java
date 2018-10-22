/* sadadasdadkkkkkaaaa
 * Created by JFormDesigner on Mon Oct 22 20:40:59 ICT 2018
 */

package jform;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author tr?n th? kh?i
 */
public class sign_in extends JFrame {
	public sign_in() {
		initComponents();
	}

	private void clickvaonutok(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - trần thế khởi
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		button1 = new JButton();

		//======== this ========
		setTitle("sign in");
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//---- label1 ----
		label1.setText("username :");
		contentPane.add(label1);
		label1.setBounds(70, 60, 90, 50);
		contentPane.add(textField1);
		textField1.setBounds(150, 65, 215, 40);

		//---- label2 ----
		label2.setText("pssword : ");
		contentPane.add(label2);
		label2.setBounds(70, 155, 85, 45);
		contentPane.add(textField2);
		textField2.setBounds(155, 150, 210, 40);

		//---- button1 ----
		button1.setText("ok");
		button1.addActionListener(e -> clickvaonutok(e));
		contentPane.add(button1);
		button1.setBounds(320, 225, 100, 50);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - trần thế khởi
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
