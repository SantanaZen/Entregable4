package com.example.dell.entregable_4_multiple_screens;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.entregable_4_multiple_screens.interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = new MemesFragment();

        transaction.replace(R.id.fragment_memes1, fragment);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.commit();
    }

    @Override
    public void enviar_meme(Variables_usadas meme) {

    }
}

