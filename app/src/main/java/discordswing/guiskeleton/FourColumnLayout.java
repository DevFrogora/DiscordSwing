package discordswing.guiskeleton;

import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JDesktopPane;

import javax.swing.JButton;
import javax.swing.JScrollPane;

//my class import
import discordswing.guiskeleton.WindowFrame;
import discordswing.guiskeleton.skeletonpanels.serverlistpanel.ServerListPanel;
import discordswing.guiskeleton.skeletonpanels.channellistpanel.ChannelListPanel;
import discordswing.guiskeleton.skeletonpanels.userlistpanel.UserListPanel;
import discordswing.guiskeleton.skeletonpanels.chattingpanel.ChattingPanel;

public class FourColumnLayout {

    WindowFrame frame;
    public FourColumnLayout(){
        initialize();
		Container mainContainer = frame.getContentPane();

    }

    private void initialize() {
		frame = new WindowFrame("Discord");
		frame.setSize( 1600, 900);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setPreferredSize(new Dimension(90, 900));
		panel.setBackground(Color.GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("serverlist");
		panel.setPreferredSize(new Dimension(75, 900));
		panel.setMaximumSize(new Dimension(75, 900));
		panel.add(lblNewLabel_3);
        panel.add(new ServerListPanel().getPanel());   ////////////<------ this added can be removed
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		frame.getContentPane().add(panel_1);
		panel_1.setPreferredSize(new Dimension(240, 900));
		
		JLabel lblNewLabel = new JLabel("channel");
		panel_1.add(lblNewLabel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		desktopPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.ORANGE);
		panel_2.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_5.add(scrollPane);
		
		JPanel panel_17 = new JPanel();
		scrollPane.setViewportView(panel_17);
		panel_17.setLayout(new BoxLayout(panel_17, BoxLayout.Y_AXIS));
		
		JPanel panel_12 = new JPanel();
		panel_17.add(panel_12);
		panel_12.setPreferredSize(new Dimension(10, 210));
		panel_12.setMaximumSize(new Dimension(32767, 267));
		panel_12.setBackground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("chatting");
		panel_12.add(lblNewLabel_1);
		
		JPanel panel_13 = new JPanel();
		panel_17.add(panel_13);
		panel_13.setPreferredSize(new Dimension(10, 210));
		panel_13.setMaximumSize(new Dimension(32767, 267));
		panel_13.setBackground(new Color(95, 158, 160));
		
		JPanel panel_14 = new JPanel();
		panel_17.add(panel_14);
		panel_14.setPreferredSize(new Dimension(10, 210));
		panel_14.setMaximumSize(new Dimension(32767, 267));
		panel_14.setBackground(new Color(250, 235, 215));
		
		JPanel panel_15 = new JPanel();
		panel_17.add(panel_15);
		panel_15.setMaximumSize(new Dimension(32767, 267));
		panel_15.setPreferredSize(new Dimension(10, 210));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(153, 255, 0));
		panel_6.setPreferredSize(new Dimension(50, 65));
		panel_6.setMaximumSize(new Dimension(60, 65));
		panel_2.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(153, 0, 204));
		panel_6.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setMaximumSize(new Dimension(67, 57));
		panel_9.setBackground(new Color(0, 128, 128));
		panel_7.add(panel_9, BorderLayout.WEST);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("attachment");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setPreferredSize(new Dimension(34, 23));
		panel_9.add(btnNewButton);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 255, 0));
		FlowLayout flowLayout = (FlowLayout) panel_10.getLayout();
		panel_7.add(panel_10, BorderLayout.CENTER);
		
		JButton button = new JButton("New button");
		panel_10.add(button);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(128, 128, 0));
		panel_7.add(panel_11, BorderLayout.EAST);
		panel_11.setLayout(new BoxLayout(panel_11, BoxLayout.X_AXIS));
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_11.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_11.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_11.add(btnNewButton_3);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(204, 0, 51));
		panel_6.add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_5 = new JLabel("user typing...");
		panel_8.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(240, 900));
		panel_3.setMaximumSize(new Dimension(240, 900));
		panel_3.setBackground(Color.CYAN);
		desktopPane.add(panel_3, BorderLayout.EAST);
		
		JLabel lblNewLabel_2 = new JLabel("userlist");
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setPreferredSize(new Dimension(50, 45));
		panel_4.setMaximumSize(new Dimension(50, 45));
		desktopPane.add(panel_4, BorderLayout.NORTH);
		
		JLabel lblNewLabel_4 = new JLabel("channel description");
		panel_4.add(lblNewLabel_4);
	}


}