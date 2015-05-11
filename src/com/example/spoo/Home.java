package com.example.spoo;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Home extends Activity{
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scroll);
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //the list view
        ListView maListViewPerso;


        //R�cup�ration de la listview cr��e dans le fichier main.xml
        maListViewPerso = (ListView) findViewById(R.id.list);


        //Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> map;

        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        map = new HashMap<String, String>();
        map.put("time", "time");
        map.put("text", "blabla blabla blablablab lablabla blabla bla blabla bla ");

        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("time", "time2");
        map.put("text", "blabla blabla blablablab lablabla blabla bla blabla bla ");

        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("time", "time2");
        map.put("text", "blabla2 blabla2 blablablab2 lablabla2 blabla2 bla2 blabla bla2 ");

        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("time", "time2");
        map.put("text", "blabla3 3 blablablab3 lablabla3 blabla2 bla3 blabla bla3 ");

        listItem.add(map);

        //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.item,
                new String[] {"time","text"}, new int[] {R.id.textView4, R.id.textView5});

        //On attribut � notre listView l'adapter que l'on vient de cr�er
        maListViewPerso.setAdapter(mSchedule);

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
