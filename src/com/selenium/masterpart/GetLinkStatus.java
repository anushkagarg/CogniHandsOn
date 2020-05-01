package com.selenium.masterpart;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetLinkStatus {

	static int invalidLink;
	public static void verifyLink(String linkString) throws IOException{
		try {
			URL url = new URL(linkString);
			HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
			
			//Timeout define
			urlConnect.setConnectTimeout(50000);
		    
			//hit url
			urlConnect.connect();
			if(urlConnect.getResponseCode() == 200){
			}else{
				invalidLink++;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void getInvalidLinkCount(){
		System.out.println("totall:" +invalidLink);
	}
}
