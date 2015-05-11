package com.example.spoo;


import com.example.spoo.R;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;


public class FragmentTest extends Fragment implements OnClickListener {

	int like_1 = 120;
	int like_2 = 25;
	
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	ImageButton /*imageButton01*/ imageButton02, imagebutton03, imagebutton04,imagebutton06, imagebutton07;
	final TextView textView04;
	final TextView textView40;
	ToggleButton button01, button05;
	
	//FragmentPost fragment9 = new FragmentPost();
	
	
	
		// TODO Auto-generated method stub
		final View rootView = inflater.inflate(R.layout.home_page_test, container, false);
		button01 = (ToggleButton) rootView.findViewById(R.id.ImageButton01);
		button01.setOnClickListener(this);
		imageButton02 = (ImageButton) rootView.findViewById(R.id.ImageButton02);
		imageButton02.setOnClickListener(this);
		imagebutton03 = (ImageButton) rootView.findViewById(R.id.imagebutton);
		imagebutton03.setOnClickListener(this);
		imagebutton04 = (ImageButton)rootView.findViewById(R.id.ImageButton20);
		imagebutton04.setOnClickListener(this);
		button05 = (ToggleButton)rootView.findViewById(R.id.ImageButton10);
		button05.setOnClickListener(this);
		button05 = (ToggleButton)rootView.findViewById(R.id.ImageButton10);
		button05.setOnClickListener(this);
		imagebutton06 = (ImageButton)rootView.findViewById(R.id.imageButton200);
		imagebutton06.setOnClickListener(this);
		
		imagebutton07 = (ImageButton)rootView.findViewById(R.id.imageButton1);
		imagebutton07.setOnClickListener(this);
		
		textView40 = (TextView) rootView.findViewById(R.id.TextView40);
		textView40.setOnClickListener(this);
		
		textView04 = (TextView) rootView.findViewById(R.id.TextView04);
		textView04.setOnClickListener(this);
		
		 button01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					// TODO Auto-generated method stub
					 if (isChecked) {
				            like_1++;
				            textView04.setText(""+like_1);
				            //The toggle is enabled
				        } else {
				            // The toggle is disabled
				        	like_1--;
				        	textView04.setText(""+like_1);
				        }
				}
			});
		
		 button05.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					// TODO Auto-generated method stub
					 if (isChecked) {
				            like_2++;
				            textView40.setText(""+like_2);
				            //The toggle is enabled
				        } else {
				            // The toggle is disabled
				        	like_2--;
				        	textView40.setText(""+like_2);
				        }
				}
			});
		
		
		
	
		
		return rootView;
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		switch (v.getId()) {
		case R.id.imageButton1:

			FragmentTransaction ft = getFragmentManager().beginTransaction();
			Fragment fragment9 = new FragmentPost();
			// ft.replace(R.id.fragment1, fragment6);
			ft.replace(R.id.container, fragment9);
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.addToBackStack(null);
			ft.commit();
			break;
			
		case R.id.imagebutton:
			
			modificationinpost(v);
			break;
		
		case R.id.imageButton200:
			
			modificationinpost(v);
			break;
			
		case R.id.ImageButton02:
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			Fragment fragment10 = new FragmentComment();;
			transaction.replace(R.id.container, fragment10 );
			transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			transaction.addToBackStack(null);
			transaction.commit();
			break;
			
		case R.id.ImageButton20:
			FragmentTransaction trans = getFragmentManager().beginTransaction();
			Fragment fragment11 = new FragmentComment2();;
			trans.replace(R.id.container, fragment11 );
			trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			trans.addToBackStack(null);
			trans.commit();
			break;
			
			
			
			
		
			
			
		}
		
	}
			
			private void modificationinpost(View v) {
				final CharSequence[] listitem = { "Report this Post", "I don't want to see this post" };
				new AlertDialog.Builder(v.getContext()).setItems(listitem, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// perform edit and delete action 
						switch(which){
						case 0:
							ReportPost();
							break;
						case 1:
							DontReportPost();
							break;
							
						
						
						}
						
					}

					private void DontReportPost() {
						// TODO Auto-generated method stub
						
					}

					private void ReportPost() {
						// TODO Auto-generated method stub
						
					}
		    
			
			

				}).show();


		
	
	
}
}
			