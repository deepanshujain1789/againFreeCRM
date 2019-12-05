package com.CRM.Utils;

import com.CRM.BaseClass.BaseClass;

public class HandleAlert_CaptureMsg extends BaseClass

{
//  public static String getAlertMsg()
//  {
//	  return driver.switchTo().alert().getText();
//  }
//  
//  public static void acceptAlert()
//  {
//	  driver.switchTo().alert().accept();
//  }
//  public static void dismissAlert()
//  {
//	  driver.switchTo().alert().dismiss();
//  }
	
	
  public static String handleAlert(String AlertAction)
  {
	  String alertMsg= driver.switchTo().alert().getText();
	  if (AlertAction.equals("ok")) {
      driver.switchTo().alert().accept();		
	} else {
		driver.switchTo().alert().dismiss();
	}
	  
	  return alertMsg;
  }
}
