/*
 * http://developer.android.com/reference/android/hardware/Camera.html
 */

package my.photolocker.com;

import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.Console;
import java.io.File;
import java.io.InputStream;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class PhotolockerActivity extends Activity
{
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;

    public void onCreate(Bundle savedInstanceState)
    {
        setContentView(R.layout.main);

        // create Intent to take a picture and return control to the calling application
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        Uri fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE); // create a file to save the image
        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri); // set the image file name

        int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 0;
		startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
		
		//parse the file full path
		
		//upload file
//		Uploader myUploader = new Uploader();
//		myUploader.upload();

    }
 
    


    /** Create a file Uri for saving an image or video */
    private static Uri getOutputMediaFileUri(int type){
          return Uri.fromFile(getOutputMediaFile(type));
    }
    

    
    private static File getOutputMediaFile(int type) {
		// TODO Auto-generated method stub
		return null;
	}
}