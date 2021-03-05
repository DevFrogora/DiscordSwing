package discordswing.guiskeleton;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Container;
import java.awt.Component;

//my class import
import discordswing.guiskeleton.WindowFrame;
import discordswing.guiskeleton.skeletonpanels.serverlistpanel.ServerListPanel;
import discordswing.guiskeleton.skeletonpanels.channellistpanel.ChannelListPanel;
import discordswing.guiskeleton.skeletonpanels.userlistpanel.UserListPanel;
import discordswing.guiskeleton.skeletonpanels.chattingpanel.ChattingPanel;

public class FourColumnLayout {
    GridBagLayout gridbag;
    GridBagConstraints gbc;

    public FourColumnLayout(){
        
				WindowFrame frame = new WindowFrame("Discord");

				Container mainContainer = frame.getContentPane();
                this.gridbag = new GridBagLayout();

                //*************setting the column size of panel********* //
                int frameWidth= frame.getWidth();
                // this.gridbag.columnWidths = new int[] { frameWidth/8, frameWidth/6,
                //                                         frameWidth,frameWidth/6};
                // this.gridbag.rowHeights = new int[] {frame.getHeight()};
                // this.gridbag.columnWeights = new double[] {1, 1, 1, 1};
                // this.gridbag.rowWeights = new double[] {1};
                //***************end************************************//

				mainContainer.setLayout(this.gridbag);
                this.gbc = new GridBagConstraints();

                ServerListPanel serverListpanel = new ServerListPanel();
                ChannelListPanel channelListPanel = new ChannelListPanel();
                UserListPanel userListPanel = new UserListPanel();
                ChattingPanel chattingPanel = new ChattingPanel();

                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 1;
                gbc.gridheight = GridBagConstraints.REMAINDER;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.fill = GridBagConstraints.BOTH;
                JPanel temp = serverListpanel.getPanel();
                gridbag.setConstraints(temp, gbc);
                mainContainer.add(temp);

                gbc.gridy = 0;
                gbc.gridx++;
                gbc.gridwidth = 2;
                gbc.gridheight = GridBagConstraints.REMAINDER;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.fill = GridBagConstraints.BOTH;
                JPanel temp1 = channelListPanel.getPanel();
                gridbag.setConstraints(temp1, gbc);
                mainContainer.add(temp1);

                gbc.gridy = 0;
                gbc.gridx++;
                gbc.gridwidth = 2;
                gbc.gridheight = GridBagConstraints.REMAINDER;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.fill = GridBagConstraints.BOTH;
                JPanel temp2 = chattingPanel.getPanel();
                gridbag.setConstraints(temp2, gbc);
                mainContainer.add(temp2);

                gbc.gridy = 0;
                gbc.gridx++;
                gbc.gridwidth = 1;
                gbc.gridheight = GridBagConstraints.REMAINDER;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.fill = GridBagConstraints.BOTH;
                JPanel temp3 = userListPanel.getPanel();
                gridbag.setConstraints(temp3, gbc);
                mainContainer.add(temp3);

    }

    private void addPanels(int row, int col, int height, int width,
                           Container container,Component com) {
        gbc.gridx = col;
        gbc.gridy = row;
        gbc.gridheight = height;
        gbc.gridwidth = width;
        gridbag.setConstraints(com, gbc);
        container.add(com);
    }

}