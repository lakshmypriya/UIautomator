package automation;
import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Add_NAS_manually extends UiAutomatorTestCase {
	

		   public void testDemo() throws UiObjectNotFoundException {   
		      
		      // Simulate a short press on the HOME button.
		      getUiDevice().pressHome();
		      
		      // Bring up the Apps Window
		      UiObject allAppsButton = new UiObject(new UiSelector()
		         .description("Apps"));
		      
		      // Simulate a click to bring up the All Apps screen.
		      allAppsButton.clickAndWaitForNewWindow();
		      UiObject appsTab = new UiObject(new UiSelector()
		         .text("Apps"));
		      
		      // Simulate a click to enter the Apps tab.
		      appsTab.click();
		      UiScrollable appViews = new UiScrollable(new UiSelector()
		         .scrollable(true));
		      
		      // Set the swiping mode to horizontal (the default is vertical)
		      appViews.setAsHorizontalList();
		      
		      //Launch WD Mycloud App
		      UiObject settingsApp = appViews.getChildByText(new UiSelector()
		         .className(android.widget.TextView.class.getName()), 
		         "WD My Cloud");
		      //sleep(5000);
		      settingsApp.clickAndWaitForNewWindow();
		      //getUiDevice().pressBack();
		      
		      //sleep(5000);
		      
		      UiObject ConnectButton = new UiObject(new UiSelector().text("Connect Now")
		    		   .className("android.widget.Button"));
		      ConnectButton .clickAndWaitForNewWindow();
		      
		      UiObject Adddevice = new UiObject(new UiSelector()
		         .className("android.widget.RelativeLayout").text("WD Device"));
		      sleep(5000);
		      Adddevice.click();
		      UiObject LoginButton =new UiObject(new UiSelector().text("Login")
		    		   .className("android.widget.Button"));
		      LoginButton  .clickAndWaitForNewWindow();
		      
		      
		    
		      
		  }

		 
		}




