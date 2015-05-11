package com.example.spoo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ToggleButton;

public class HomeAdapter extends BaseAdapter implements View.OnClickListener {

	FragmentComment fragment8 = new FragmentComment();
	private Context context;
	public TextView counterValue;
	ToggleButton like_button;
	ImageButton imagebutton;
	Button comment_button;
	int like = 10;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
		
	}
	
	 public HomeAdapter (Context context){
	    	this.context = context;
	   
	 }
	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		//View row = null;
		View row = convertView;
		if(convertView == null)
		{
			LayoutInflater inflater = (LayoutInflater) context.
					getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.item, parent, false);
		}
		/*
		else {
			row = convertView; 
			
		}
		*/
		
	//	int like_number = 24;

	    like_button =(ToggleButton) row.findViewById(R.id.like_button);
	    comment_button =(Button) row.findViewById(R.id.comment_button);
	    counterValue = (TextView) row.findViewById(R.id.like_number);
	     imagebutton = (ImageButton) row.findViewById(R.id.imagebutton);
	   imagebutton.setOnClickListener(this);
	   counterValue.setOnClickListener(this);
		
	 	    
	
	
return row;
		
}
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		   switch (v.getId())
		    {
		case R.id.like_button:
		    like_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
					
					@Override
					public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		//				int like_number = 24;
						// TODO Auto-generated method stub
						 if (isChecked=true) {
					           like++;
					            counterValue.setText(""+like);
					            //The toggle is enabled
					        } else {
					            // The toggle is disabled
					        	like--;
					        	counterValue.setText(""+like);
					        }
					}
				});
		       // counterValue = (TextView) row.findViewById(R.id.like_button);
		 	//	counterValue.setOnClickListener(this);
		
		 	
		break;
	
		case R.id.imagebutton:
			
			modificationinpost(v);
			break;
			
			default:
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
         // Method to delete the post 
			private void ReportPost() {
				// logic for deleting the post 
				
			}
         // Method to edit the post
			private void DontReportPost() {
				// logic for editing the post
				 // may be we have to use InterFragment communication concept
			}
		}).show();
		
		
	}
		
}

	
		
/**
 * For comment button, toggle when the user comments on the post
 * 
 * 
 * set flag bit if the user replies on the post
 * 
 * use flag bit to set another color on the button
 * 
 * 		
 */
		
	 		
		
	
	    
	/*
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
switch (v.getId()) {
	    
		case R.id.comment_button:
			//FragmentTransaction transaction = getFragmentManager().beginTransaction();
			FragmentTransaction trans = getFragmentManager().beginTransaction();
			trans.replace(R.id.container, fragment8);
			trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			trans.addToBackStack(null);
			trans.commit();
			break;

		
		
		case R.id.like_button:
	    like_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	//				int like_number = 24;
					// TODO Auto-generated method stub
					 if (isChecked) {
				           like++;
				            counterVal.setText(""+like);
				            //The toggle is enabled
				        } else {
				            // The toggle is disabled
				        	like--;
				        	counterVal.setText(""+like);
				        }
				}
			});
	break;
			
	}
	}
	
	*/

