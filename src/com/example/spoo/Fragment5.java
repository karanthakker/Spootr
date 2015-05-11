package com.example.spoo;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment5 extends Fragment implements View.OnClickListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		shareit();
		return super.onCreateView(inflater, container, savedInstanceState);
	}

	private void shareit() {
		// TODO Auto-generated method stub
		Intent inviteIntent = null, chooser = null;
		// Allows different options to send a message
			inviteIntent = new Intent(android.content.Intent.ACTION_SEND);
			inviteIntent.setType("message/rfc822");
			inviteIntent.setType("text/plain");
			// Building sharing content
			String sharecontent = "Invite Your Friends- www.spootr.com";
			
			// passing sharecontent using putExtra method of intent
			inviteIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
					"Refer to this link");
			inviteIntent.putExtra(android.content.Intent.EXTRA_TEXT, sharecontent);
	  
			chooser = Intent.createChooser(inviteIntent, "Share To");
			startActivity(chooser);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
}
