package com.example.spoo;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

public class FragmentPost extends Fragment {

   EditText editText1;
   ImageButton circlepostButton, postButton;
   
   @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	   View view = inflater.inflate(R.layout.post_button, container, false);
		return view;
	}

}
