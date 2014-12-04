package automation;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class  Add_Mycloud extends UiAutomatorTestCase{

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
	      
	      //Click on Try me Button
	      UiObject ConnectButton = new UiObject(new UiSelector().text("Connect Now")
	    		   .className("android.widget.Button"));
	      ConnectButton .clickAndWaitForNewWindow();
	      
	      //Add Google Drive
	      
	      UiObject Addgdrive = new UiObject(new UiSelector()
	      .className("android.widget.TextView").text("MyCloud.com"));
	      Addgdrive.clickAndWaitForNewWindow(20000);
	      
	      //Adding Credentials
	      
	      UiObject Email =new UiObject(new UiSelector()
		   .className("android.widget.EditText").index(1));
	      Email.setText("lakshmywd@gmail.com");
	      UiObject password =new UiObject(new UiSelector()
	      .className("android.widget.EditText").index(2));
	      password.setText("hello_1234");
	      UiObject SigninButton = new UiObject(new UiSelector()
	      .className("android.widget.Button").text("Sign In"));
	      SigninButton.clickAndWaitForNewWindow(25000);
	      
	 
	}
}
