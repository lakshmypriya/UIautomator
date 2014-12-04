package automation;
import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Access_Demo_Drive extends UiAutomatorTestCase{

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
	      UiObject trymeButton = new UiObject(new UiSelector().text("Try Me")
	    		   .className("android.widget.Button"));
	      trymeButton.clickAndWaitForNewWindow();
	      
	      //Verify that the public folder is shown in the new window and is clickable
	      UiObject folderPublic= new UiObject(new UiSelector().text("Public")
	    		   .className("android.widget.TextView"));
	      folderPublic.clickAndWaitForNewWindow();
	      assertTrue("Folder exists", 
	    		  folderPublic.exists()); 
	      // Validate that the folder collection is the expected one
	      UiCollection folderValidation = new UiCollection(new UiSelector()
	      .className("android.widget.FrameLayout"));
	   
	     assertTrue("Folder exists", 
	    		 folderValidation.exists());   
	  }

	 
	}

