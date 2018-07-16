package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkFragment extends Fragment {
    public ParkFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word( R.string.Parc_des_Buttes_Chaumont,R.string.parc_des_buttes_chaumont,R.drawable.parkone));
        words.add(new Word( R.string.Jardin_des_Champs_Élysées,R.string.jardin_des_champs_elysees,R.drawable.parktwo));
        words.add(new Word( R.string.Jardin_des_Plantes,R.string.jardin_des_plantes,R.drawable.parkthree));
        words.add(new Word( R.string.Lac_Daumesnil_Bois_de_Vincennes,R.string.lac_daumesnil_bois_de_vincennes,R.drawable.parkfour));
        words.add(new Word( R.string.Lac_inférieur_Bois_de_Boulogne,R.string.lac_inférieur_bois_de_boulogne,R.drawable.parkfive));
        words.add(new Word( R.string.Parc_Monceau,R.string.parc_monceau,R.drawable.parksix));
        words.add(new Word( R.string.Champ_de_Mars,R.string.champ_de_mars,R.drawable.parkseven));
        words.add(new Word( R.string.Jardin_du_Luxembourg,R.string.jardin_du_luxembourg,R.drawable.parkeigh));
        words.add(new Word( R.string.Cimetière_du_Père_Lachaise,R.string.cimetière_du_Père_lachaise,R.drawable.parknine));
        words.add(new Word( R.string.Jardin_des_Tuileries,R.string.jardin_des_tuileries,R.drawable.parkten));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
            }
        });
        return rootView;
    }
}
