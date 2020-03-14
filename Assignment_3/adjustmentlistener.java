import java.awt.*;
import java.awt.event.*;

public class AwtListenerDemo {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtListenerDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtListenerDemo  awtListenerDemo = new AwtListenerDemo();  
      awtListenerDemo.showAdjustmentListenerDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
   
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showAdjustmentListenerDemo(){
      headerLabel.setText("Listener in action: AdjustmentListener");      

      ScrollPane panel = new ScrollPane();      
      panel.setBackground(Color.magenta);
      panel.getHAdjustable().addAdjustmentListener(new CustomAdjustmentListener());

      Label msglabel = new Label();
      msglabel.setAlignment(Label.CENTER);   
      msglabel.setText("Welcome to TutorialsPoint AWT Tutorial.");
      panel.add(msglabel);
      
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }

   class CustomAdjustmentListener implements AdjustmentListener {
      public void adjustmentValueChanged(AdjustmentEvent e) {
         statusLabel.setText("Adjustment value: "+Integer.toString(e.getValue()));
      }
   }
}