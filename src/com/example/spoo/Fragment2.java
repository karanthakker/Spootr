package com.example.spoo;

import android.app.Activity;
import android.app.AlertDialog;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Fragment2  extends Fragment implements View.OnClickListener{
	// In fragment we can create a separate layout file or java objects that
			// contain the appearance.
	 private ImageButton postmodification,CommentButton;
	 private ToggleButton LikeButton;
	 private TextView counterVal;
	 
	 FragmentComment fragment7 = new FragmentComment();

	 
	 // Get number of likes and comments from database
	 int like_number = 24;
			
	public Fragment2() {

	}
	// called when fragment is attached to activity
	
	@Override
	public void onAttach(Activity activity) {
		
		super.onAttach(activity);
	}
	
	// called to do initial creation of the fragment.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
	}
	
/*	



*/
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootview = inflater.inflate(R.layout.profile, container, false);
		postmodification = (ImageButton) rootview.findViewById(R.id.imageButton2);
		postmodification.setOnClickListener(this);
		LikeButton= (ToggleButton) rootview.findViewById(R.id.ImageButton01);
		  LikeButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					// TODO Auto-generated method stub
					 if (isChecked) {
				            like_number++;
				            counterVal.setText(""+like_number);
				            //The toggle is enabled
				        } else {
				            // The toggle is disabled
				        	like_number--;
				        	counterVal.setText(""+like_number);
				        }
				}
			});
		
		
		CommentButton=(ImageButton) rootview.findViewById(R.id.ImageButton02);
		CommentButton.setOnClickListener(this);
		counterVal = (TextView) rootview.findViewById(R.id.TextView04);
		counterVal.setOnClickListener(this);
		
		
		return rootview;
	}
// Creating this method will help to Modify/Access UI elements.
@Override
public void onActivityCreated(Bundle savedInstanceState) {
	
	super.onActivityCreated(savedInstanceState);
}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
	switch (v.getId()) {
     	case R.id.imageButton2:
		// calling method 
		modificationinpost(v);
	 break;
	 
	 //Like Button
	/*case R.id.ImageButton01:
		//incCountValue(v);
		
		// size of the like button large **FIX**
		
		//if button red, ++ else --
		
		
		
        
		counterVal.setText(""+like_number);
		break;
		*/
		//Comment Button
	case R.id.ImageButton02:
		// Comment action gets performed 
		
		FragmentTransaction transaction = getFragmentManager().beginTransaction();
		transaction.replace(R.id.container, fragment7);
		transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		transaction.addToBackStack(null);
		transaction.commit();
		break;
		default:
			break;
	}	
	
}

//Increment Counter Value

/*
 * private void incCountValue(View v) {
 
	int like_number = Integer.parseInt(counterVal.getText().toString());
 //   counterVal.setText(""+score++);
	
	
}

*/
//Edit or Delete the post 
	private void modificationinpost(View v) {
		final CharSequence[] listitem = { "Edit", "Delete" };
		new AlertDialog.Builder(v.getContext()).setItems(listitem, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// perform edit and delete action 
				switch(which){
				case 0:
					EditPost();
					break;
				case 1:
					DeletePost();
					break;
					
				
				
				}
				
			}
         // Method to delete the post 
			private void DeletePost() {
				// logic for deleting the post 
				
			}
         // Method to edit the post
			private void EditPost() {
				// logic for editing the post
				 // may be we have to use InterFragment communication concept
			}
		}).show();
		
		
	}


@Override
public void onStart() {
	
	super.onStart();
}

@Override
public void onResume() {
	
	super.onResume();
}
@Override
public void onPause() {
	
	super.onPause();
}

@Override
public void onStop() {
	
	super.onStop();
}

@Override
public void onDestroyView() {
	
	super.onDestroyView();
}
@Override
public void onDestroy() {
	
	super.onDestroy();
}

@Override
public void onDetach() {
	
	super.onDetach();
}}
