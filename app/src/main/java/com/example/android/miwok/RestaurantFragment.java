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
public class RestaurantFragment extends Fragment {
    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;
    public RestaurantFragment() {
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word( R.string.Thoumieux,R.string.thoumieux, R.drawable.thoumieux_restaurant_gast));
        words.add(new Word( R.string.Huitrerie_Regis,R.string.huitrerie_regis, R.drawable.huitrerie_regis));
        words.add(new Word( R.string.L_Astrance,R.string.l_astrance, R.drawable.lastrance));
        words.add(new Word( R.string.Le_Stella,R.string.le_stella, R.drawable.le_stella));
        words.add(new Word( R.string.Les_Tablettes,R.string.les_tablettes, R.drawable.les_tablettes));
        words.add(new Word( R.string.Macéo,R.string.macéo, R.drawable.maceo));
        words.add(new Word( R.string.Le_Meurice,R.string.le_meurice, R.drawable.meurice));
        words.add(new Word( R.string.Spring,R.string.spring, R.drawable.spring_restaurant));
        words.add(new Word( R.string.Yam_Tcha,R.string.yam_tcha, R.drawable.yamtcha));
        words.add(new Word( R.string.Ze_Kitchen_Galerie,R.string.ze_kitchen_galerie, R.drawable.ze_kitchen_galerie));
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_family);
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
