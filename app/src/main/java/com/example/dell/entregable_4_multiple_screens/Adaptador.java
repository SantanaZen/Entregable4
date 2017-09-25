package com.example.dell.entregable_4_multiple_screens;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 24/09/2017.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderMemes> implements View.OnClickListener {

    ArrayList<Variables_usadas> listameme;
    private View.OnClickListener listener;

    public Adaptador(ArrayList<Variables_usadas> listameme) {
        this.listameme = listameme;
    }

    @Override
    public ViewHolderMemes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.phone_list, null, false);
        view.setOnClickListener(this);
        return new ViewHolderMemes(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderMemes holder, int position) {

        holder.EtiNombre.setText(listameme.get(position).getNombre());
        holder.meme.setImageResource(listameme.get(position).getMeme());


    }

    @Override
    public int getItemCount() {
        return listameme.size();
    }
    public  void setOnClicListener (View.OnClickListener listener){

        this.listener=listener;   }
    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }

    }

    public class ViewHolderMemes extends RecyclerView.ViewHolder {
        TextView EtiNombre;
        ImageView meme;


        public ViewHolderMemes(View itemView) {
            super(itemView);
            EtiNombre = (TextView) itemView.findViewById(R.id.Nombre);
            meme = (ImageView)itemView.findViewById(R.id.imagen);

        }
    }
}
