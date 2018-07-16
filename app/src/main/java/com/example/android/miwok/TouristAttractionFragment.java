package com.example.android.miwok;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class TouristAttractionFragment extends Fragment {
    public TouristAttractionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.Seine_Cruise, R.string.seine_cruise, R.drawable.seine_cruise));
        words.add(new Word(R.string.Place_des_Vosges, R.string.place_des_vosges, R.drawable.place_des_vosges));
        words.add(new Word(R.string.Pere_Lachaise_Cemetery, R.string.pere_lachaise_cemetery, R.drawable.pere_lachaise_cemetery));
        words.add(new Word(R.string.Pantheon, R.string.pantheon, R.drawable.pantheon_paris));
        words.add(new Word(R.string.Palais_Garnier, R.string.palais_garnier, R.drawable.palais_garnier));
        words.add(new Word(R.string.Musee_de_l_Orangerie, R.string.musee_de_l_orangerie, R.drawable.musee_de_lorangerie));
        words.add(new Word(R.string.Moulin_Rouge, R.string.moulin_rouge, R.drawable.moulin_rouge));
        words.add(new Word(R.string.Les_Invalides, R.string.les_invalides, R.drawable.les_invalides));
        words.add(new Word(R.string.Disneyland_aris, R.string.disneyland_paris, R.drawable.disneyland_paris));
        words.add(new Word(R.string.Conciergerie, R.string.conciergerie, R.drawable.conciergerie));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases);
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
