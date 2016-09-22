package com.example.nazmul.tourmate.model;

import android.content.Context;
import android.widget.Toast;

public class msg {
	public static void message(Context context, String message)
	{
		Toast.makeText(context,message, Toast.LENGTH_SHORT).show();
	
	}

}
