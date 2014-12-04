package automation;
import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Add_NAS_automatically extends UiAutomatorTestCase{

	   public void testDemo() throws UiObjectNotFoundException {   
	      
		  
		      getUiDevice().pressHome();
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
		      
		      
		      appViews.setAsHorizontalList();
		      
		      // Create a UiSelector to find the Settings app and simulate      
		      // a user click to launch the app. 
		      UiObject settingsApp = appViews.getChildByText(new UiSelector()
		         .className(android.widget.TextView.class.getName()), 
		         "Settings");
		      settingsApp.clickAndWaitForNewWindow();
		      
		      // Validate that the package name is the expected one
		      UiObject settingsValidation = new UiObject(new UiSelector()
		         .packageName("com.android.settings"));
		      assertTrue("Unable to detect Settings", 
		         settingsValidation.exists()); 
		      UiObject WiFiSettings = new UiObject(new UiSelector()
		      .className("android.widget.LinearLayout").scrollable(false)
		      .index(1));
		    
		    if (WiFiSettings.exists())
		     WiFiSettings.click();
		    
		    // Switch ON
		    
		    // Switch OFF
		    UiObject WifiOffButton = WiFiSettings.getChild(new UiSelector()
		      .text("OFF"));
		   UiObject WifiOnButton = WiFiSettings.getChild(new UiSelector()
		     .text("ON"));
		    
		    if (WifiOffButton.exists()) {
		    	 WifiOffButton.click();
		    	 
		    } 
		    
		    UiObject WifiItem = new UiObject(new UiSelector()
		    .className("android.view.View").
		      text("Wi-Fi"));
		    WifiItem.click();
		 UiObject router= new UiObject(new UiSelector()
		    .className("android.widget.RelativeLayout").index(0));
		router.click();
		   
		    	  
		    	 
		    } 
		    
		    	
		  }   
		    
		    
		    
	
