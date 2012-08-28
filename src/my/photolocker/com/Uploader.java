package my.photolocker.com;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.annotation.SuppressLint;
import java.io.File;

@SuppressLint("ParserError")
public class Uploader {
	
	//variable belongs in configuration setting
	//public static final String API_UPLOAD_URL = 'http://www.mobilemazing.com/direct/json-upload.php';
	
	/*
	 * Method to upload one single file
	 * @param filePath
	 * @return - HttpResponse object
	 */
	public HttpResponse upload(File file)
	{
		try{
		    // Create a new HttpClient and Post Header
		    HttpClient httpclient = new DefaultHttpClient();
		    HttpPost httppost = new HttpPost("http://mobilemazing.com/fbphotolocker/direct/json-upload.php");
		    
		    
		    HttpResponse response = httpclient.execute(httppost);
		    
		    return response;

		    
	    } catch (ClientProtocolException e) {
	        // TODO Auto-generated catch block
	    } catch (IOException e) {
        // TODO Auto-generated catch block
	    }
	    
	    return null;
	}

}
