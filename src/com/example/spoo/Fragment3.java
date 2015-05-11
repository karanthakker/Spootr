package com.example.spoo;



import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Fragment3 extends Fragment implements View.OnClickListener, OnItemSelectedListener{

	// In fragment we can create a separate layout file or java objects that
		// contain the appearance.
	   Spinner spinner1 ;
	   TextView prov;
	   
	    
	  private String[] province = { "NS", "NF", "ON", "QUBEC",
		     "BC", "Alberta", "NB", "SAS",
		       "MAN" };

		public Fragment3(){
			
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
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsBundletanceState) {
			
			View rootview=inflater.inflate(R.layout.circle, container, false);
			System.out.println(province.length);
		      
			spinner1 = (Spinner) rootview.findViewById(R.id.spinner1);
		  prov = (TextView) rootview.findViewById(R.id.prov);

		    
	      
		     // Create an ArrayAdapter using the string array and a default spinner layout
		
	      ArrayAdapter<String> adapter_province = new ArrayAdapter<String>(getActivity(),
	              android.R.layout.simple_spinner_item, province);
	          
		// ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(getActivity().getApplicationContext(),R.array.cities_array,android.R.layout.simple_spinner_item);
		   
			 // Specify the layout to use when the list of choices appears
	     adapter_province.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		     // Apply the adapter to the spinner
		     spinner1.setAdapter(adapter_province); 
		     spinner1.setOnItemSelectedListener(this);
			    
		     
		   
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
		@Override
		public void onItemSelected(AdapterView<?> parent, View view,
				int position, long id) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub
			
		}
}
