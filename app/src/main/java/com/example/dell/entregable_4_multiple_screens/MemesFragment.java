package com.example.dell.entregable_4_multiple_screens;


import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.entregable_4_multiple_screens.interfaces.IComunicaFragments;

import java.util.ArrayList;

//Esta clase corresponde al fragmento que contiene al recyclerview, se manda a llamar desde el main
public class MemesFragment extends Fragment  {
    ArrayList<Variables_usadas> listadememes;
    RecyclerView reciclerMemes;
    Activity activity;
    IComunicaFragments interfaceComunicaFragments;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate (R.layout.recycler_memes, container, false);


        listadememes = new ArrayList<>();
        reciclerMemes = (RecyclerView) view.findViewById(R.id.rec);


        reciclerMemes.setLayoutManager(new GridLayoutManager(getContext(), 2));

        Adaptador adapter = new Adaptador(listadememes);
        adapter.setOnClicListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aqui va la nota del seleccionado como lo hizo el profe
                interfaceComunicaFragments.enviar_meme(listadememes.get(reciclerMemes.getChildAdapterPosition(view)));

            }
        });

        reciclerMemes.setAdapter(adapter);
        llenar();


        return view;
    }

    private void llenar() {
        listadememes.add(new Variables_usadas("Cereal Guy",getString(R.string.cereal),R.drawable.cereal_guy));
        listadememes.add(new Variables_usadas("F Yeah", getString(R.string.fyeah),R.drawable.f_yeah));
        listadememes.add(new Variables_usadas("Forever Alone", getString(R.string.forever),R.drawable.forever_alone));
        listadememes.add(new Variables_usadas("Freddie Mercury",getString(R.string.freddie),R.drawable.freddie_mercury));
        listadememes.add(new Variables_usadas("Lol guy", getString(R.string.lol),R.drawable.lol_guy));
        listadememes.add(new Variables_usadas("Neil Degrasse Tyson", getString(R.string.neil),R.drawable.neil_degrasse_tyson));
        listadememes.add(new Variables_usadas("Oh crap","Generalmente utilizada para guardar los marcadores en navegadores web",R.drawable.oh_crap));
        listadememes.add(new Variables_usadas("Okay","Generalmente utilizada para guardar los marcadores en navegadores web",R.drawable.okay));
        listadememes.add(new Variables_usadas("Rage Guy","Generalmente utilizada para guardar los marcadores en navegadores web",R.drawable.rage_guy));
        listadememes.add(new Variables_usadas("Troll Face","Generalmente utilizada para guardar los marcadores en navegadores web",R.drawable.troll_face));
        listadememes.add(new Variables_usadas("Y u no guy","Generalmente utilizada para guardar los marcadores en navegadores web",R.drawable.y_u_no_guy));
        listadememes.add(new Variables_usadas("Yao Ming","Generalmente utilizada para guardar los marcadores en navegadores web",R.drawable.yao_ming));
    }

    @Override
    public void onAttach (Context context){
        super.onAttach(context);

        if (context instanceof Activity){
            this.activity= (Activity) context;
            interfaceComunicaFragments= (IComunicaFragments) this.activity;

        }
    }
}
