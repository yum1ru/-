package rerun2;
import javax.swing.JFrame;

public class RerunTwo {
	
	public class windowDimensions{
		
		public static int appWindowWidth = 640;
		public static int appWindowHeight = 480;
		
	}
	
	public static void main(String[] args) {
		 
		
		
		JFrame appWindow = new JFrame();
		appWindow.setVisible(true);
		appWindow.setSize(windowDimensions.appWindowWidth, windowDimensions.appWindowHeight);
		appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appWindow.setResizable(false);
		appWindow.setLocationRelativeTo(null);
		
		
		
	}
	
	

}
