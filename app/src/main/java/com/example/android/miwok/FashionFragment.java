package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FashionFragment extends Fragment {

    public FashionFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word( R.string.Pigallee, R.string.Pigalle, R.drawable.pigalle));
        words.add(new Word( R.string.Tara_Jarmon,R.string.tara, R.drawable.tara_jarmon));
        words.add(new Word( R.string.AMI,R.string.ami, R.drawable.ami));
        words.add(new Word( R.string.Armor_Lux,R.string.armor_lux, R.drawable.armor_lux));
        words.add(new Word( R.string.Charvet_Place_Vendome,R.string.charvet_place_vendome,R.drawable.charvet_place_vendome));
        words.add(new Word( R.string.Coco_Chanel,R.string.coco_chanel,R.drawable.coco_chanel));
        words.add(new Word( R.string.Hermes,R.string.hermes,R.drawable.hermes));
        words.add(new Word( R.string.A_P_C, R.string.a_p_c, R.drawable.a_p_c));
        words.add(new Word( R.string.Comptoir_des_Cotonniers,R.string.comptoir_des_cotonniers,R.drawable.comptoir_des));
        words.add(new Word( R.string.Louis_Vuitton,R.string.louis_vuitton,R.drawable.louis_vuitton));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_colors);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
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
