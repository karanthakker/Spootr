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


        //Récupération de la listview créée dans le fichier main.xml
        maListViewPerso = (ListView) findViewById(R.id.list);


        //Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> map;

        //Création d'une HashMap pour insérer les informations du premier item de notre listView
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

        //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.item,
                new String[] {"time","text"}, new int[] {R.id.textView4, R.id.textView5});

        //On attribut à notre listView l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(mSchedule);

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
