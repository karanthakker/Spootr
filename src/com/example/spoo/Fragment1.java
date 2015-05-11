package com.example.spoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import com.example.spoo.R.array;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Fragment1 extends Fragment implements View.OnClickListener , android.view.View.OnTouchListener{
	private ListView maListViewPerso;
		// In fragment we can create a separate layout file or java objects that
	// contain the appearance.
	// InterFragment Communication
	
	ArrayList<ImageButton> btn = new ArrayList<ImageButton>();
	ArrayList<TextView> txtlike = new ArrayList<TextView>();
	FragmentPost fragment6 = new FragmentPost();
	
	//
	FragmentComment fragment7 = new FragmentComment();
	private HomeAdapter homeAdapter;


	/*
	 * Communicator communicator; public Fragment1() {
	 * 
	 * }
	 */

	// called when fragment is attached to activity.

	@Override
	public void onAttach(Activity activity) {

		super.onAttach(activity);
	}

	// called to do initial creation of the fragment.

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
	}

	// Inter fragment communication

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	//C final
		
		// TODO Auto-generated method stub
		final View rootView = inflater.inflate(R.layout.scroll, container, false);
		maListViewPerso = (ListView) rootView.findViewById(R.id.list);
	
	//	maListViewPerso.setOnItemClickListener(this);
	/*	maListViewPerso.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				homeAdapter.getView(getId(), getView(), parent);
				
			}
		});
		*/
		
		//homeAdapter = new HomeAdapter(this.getActivity());
		homeAdapter= new HomeAdapter(this.getActivity());
		//homeAdapter.onClick(v);
		//homeAdapter.getView(getId(), getView(), null);
		maListViewPerso.setAdapter(homeAdapter);
		maListViewPerso.setOnTouchListener(this);
		
		
	
		
/*    
		maListViewPerso.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
			//	ItemClicked item = parent.getItem(position);
				Button like_button =(Button) rootView.findViewById(R.id.like_button);
				Button comment_button =(Button) rootView.findViewById(R.id.comment_button);
				
				Intent intent = new Intent(getActivity(), FragmentComment.class);
				
			}
		});
		// NEW
	//	Button button = (Button) getActivity().findViewById(R.id.post);
		Button button =(Button) rootView.findViewById(R.id.post);
		button.setOnClickListener(this);
		/*
		 * button.setOnClickListener(new View.OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub FragmentPost fragment6 = new FragmentPost();
		 * 
		 * FragmentTransaction ft = getFragmentManager().beginTransaction();
		 * ft.replace(R.id.container, fragment6);
		 * ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		 * ft.addToBackStack(null); ft.commit(); } });
		 */

		//
		
		setHasOptionsMenu(true);
		return rootView;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		
     //   int rm = (int)(Math.random() * 5);
		
		
//		int color = colors[rm];
		
		
		
	//	int[] one_color = {0, color, 0};
		
		
		// TODO Auto-generated method stub
		// inflater.inflate(R.menu);

		// MenuInflater inflater = getActivity().getMenuInflater();
		// super.onCreateOptionsMenu(menu,inflater);

		// ListView maListViewPerso;

		// Récupération de la listview créée dans le fichier main.xml
		// maListViewPerso = (ListView) view.findViewById(R.id.list);
		// maListViewPerso = (ListView) rootView.findViewById(R.id.list);
		// Création de la ArrayList qui nous permettra de remplire la listView
		ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

		// On déclare la HashMap qui contiendra les informations pour un item
		HashMap<String, String> map;

		// Création d'une HashMap pour insérer les informations du premier item
		// de notre
		// listView
		map = new HashMap<String, String>();
		map.put("time", "time");
		map.put("text",
				"blabla blabla blablablab lablabla blabla bla blabla bla ");

		listItem.add(map);
		
		map = new HashMap<String, String>();
		map.put("time", "time2");
		map.put("text",
				"blabla blabla blablablab lablabla blabla bla blabla bla ");
 
		listItem.add(map);
      // (blue, cyan,green,magenta,red,yellow)
	//	int[] sample = (0xff0000ff,0xff00ffff,0xff00ff00,0xffff00ff,0xffff0000,0xffffff00 );
		int[] sample = {0xff0000ff,0xff00ffff,0xff00ff00,0xffff00ff,0xffff0000,0xffffff00};
	//	  int rm = (int)(Math.random() * 3);
			
		int[] colors = {0x2E9AFE,0x2E9AFE};
			
		//	int color = colors[rm];
			
			
			
       // 	int[] one_color = {color};
			
		
		maListViewPerso.setDivider(new GradientDrawable(Orientation.RIGHT_LEFT,colors));
		maListViewPerso.setDividerHeight(5);
		

		map = new HashMap<String, String>();
		map.put("time", "time2");
		map.put("text",
				"blabla2 blabla2 blablablab2 lablabla2 blabla2 bla2 blabla "
						+ "bla2 ");

		listItem.add(map);
		

		map = new HashMap<String, String>();
		map.put("time", "time2");
		map.put("text",
				"blabla3 3 blablablab3 lablabla3 blabla2 bla3 blabla bla3 ");

		listItem.add(map);
		map = new HashMap<String, String>();
		map.put("time", "time2");
		map.put("text",
				"Hi, how have you been? How is school among along? "
						+ "bla2 ");

		listItem.add(map);
		
		

		// Création d'un SimpleAdapter qui se chargera de mettre les items
		// présent dans
		// notre list (listItem) dans la vue affichageitem
		SimpleAdapter mSchedule = new SimpleAdapter(getActivity()
				.getBaseContext(), listItem, R.layout.item, new String[] {
				"time", "text" }, new int[] { R.id.textView4, R.id.textView5 });

		// On attribut à notre listView l'adapter que l'on vient de créer
		maListViewPerso.setAdapter(mSchedule);

		// Inflate the menu; this adds items to the action bar if it is present.
		getActivity().getMenuInflater().inflate(R.menu.main, menu);
		

		// return true;
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		// Bundle is simply a data structure
		// Important information can be stored into Bundle
		// This method helps to modify/access UI elements in Activity or
		// Fragment
		// View detailsFrame = getActivity().findViewById(R.id.settings);
		// detailsFrame.getVisibility();
		// Initialization of findViewById in fragment.

		super.onActivityCreated(savedInstanceState);
	}

	/*
	 * public interface Communicator{
	 * 
	 * public void respond();
	 * 
	 * 
	 * }
	 */
/**
	public ItemClicked getItem(int position){

		return item.get(position);
		}
		
**/
	
	@Override
	public void onClick(View v) {

		// communicator.respond();
		// FragmentPost fragment6 = new FragmentPost()
		switch (v.getId()) {
		case R.id.post:

			FragmentTransaction ft = getFragmentManager().beginTransaction();
			// ft.replace(R.id.fragment1, fragment6);
			ft.replace(R.id.container, fragment6);
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.addToBackStack(null);
			ft.commit();
			break;
		/*	
		case R.id.comment_button:
			
			FragmentTransaction transaction = getFragmentManager().beginTransaction();
			transaction.replace(R.id.container, fragment7);
			transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			transaction.addToBackStack(null);
			transaction.commit();
			break;
		*/	
			

		default:
			break;
		}

	}

	/*
	 * public void setCommunicator(Communicator communicator){ this.communicator
	 * = communicator; }
	 */
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
/*
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
		
		
	//	ItemCLicked item = getItem(position);

		
	}
	*/

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		 v.getParent().requestDisallowInterceptTouchEvent(true);
	homeAdapter.onClick(getView());
		return false;
	}


/*
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		
	//homeAdapter.getView(getId(), getView(), parent);
		//homeAdapter.onClick(getView());
	}

*/
}

/**
public class HomeAdapter extends BaseAdapter

{

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
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
		return null;
	}
	
}

*/



