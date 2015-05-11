package com.example.spoo;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class CircleList extends Fragment implements View.OnClickListener {

	// In fragment we can create a separate layout file or java objects that
	// contain the appearance.
	Spinner CircleSpinner1;
	String spinnerString = null;
	TextView universityName, circlecount;
	ImageView universityimage;
	ToggleButton joinButton;
	LinearLayout Linearcontainer;
	String university;
	int member = 0;
	
	
	int images[]= {R.drawable.carletonlogo, R.drawable.u,
    		R.drawable.algonquinlogo};
	int universitynamw[] = {R.string.University1,R.string.University2, R.string.University3};
	
	ArrayList<ToggleButton> btn = new ArrayList<ToggleButton>();
	ArrayList<TextView> txt = new ArrayList<TextView>();
	public CircleList() {

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

	// Creating this method will help to Modify/Access UI elements.

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInsBundletanceState) {
		View rootview = inflater.inflate(R.layout.circlelist, container, false);
		CircleSpinner1 = (Spinner) rootview.findViewById(R.id.spinner1);
		Linearcontainer = (LinearLayout) rootview.findViewById(R.id.container);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				getActivity().getApplicationContext(), R.array.State,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		CircleSpinner1.setAdapter(adapter);
		CircleSpinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				 

				spinnerString = arg0.getItemAtPosition(arg2).toString();
				LayoutInflater layoutInflater = (LayoutInflater) arg0
						.getContext().getSystemService(
								Context.LAYOUT_INFLATER_SERVICE);
				
				
				int i;
				if (spinnerString.equals("Ontario")) {
					
					for ( i = 0; i <= 2; i++) {
						
						//Linearcontainer.removeView(arg1);
						arg1 = layoutInflater.inflate(R.layout.circleplane, null);
						universityName = (TextView) arg1
								.findViewById(R.id.UniversityName);
						circlecount = (TextView) arg1.findViewById(R.id.Membercount);
						txt.add(circlecount);
						universityimage = (ImageView) arg1
								.findViewById(R.id.universityView);
						circlecount.setText(""+ member);
						//circlecount.setTag(i);
						joinButton = (ToggleButton) arg1.findViewById(R.id.Join);
						btn.add(joinButton);
						universityimage.setImageResource(images[i]);
						universityName.setText(universitynamw[i]);
						Linearcontainer.addView(arg1);
						 final int j = i;
						//btn.get(i).setOnCheckedChangeListener(listerner);
						btn.get(i).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
							
							@Override
							public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
								if(isChecked) {
									member++;
									//circlecount.setText(""+ member);
									txt.get(j).setText(""+ member);
									
									

								}else {
									member--;
									//circlecount.setText(""+ member);
									txt.get(j).setText(""+ member);
								}
								
							}
						});	
						
					}

				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});

		return rootview;
	};

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onClick(View v) {

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
	}
	
	
	/*OnCheckedChangeListener listerner = new OnCheckedChangeListener() {
		
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			
			if(isChecked) {
				member++;
				txt.get(0).setText(""+ member);
			}else {
				member--;
				txt.get(0).setText(""+ member);
			}
		}
		
	};*/
	

}
		