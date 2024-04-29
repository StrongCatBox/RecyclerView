package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MonAdapter monAdapter;
    private RecyclerView recyclerView;
    private List<Items> mesItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.monRecyclerView);
        mesItems = new ArrayList<>();

        mesItems.add(new Items(R.drawable.logo1,"pokemon","partez dans l'aventure pour attraper les pokemons!"));
        mesItems.add(new Items(R.drawable.logo2,"BrawlStars","soyez pret pour affronter les joueurs du monde entier avec vos champions!"));
        mesItems.add(new Items(R.drawable.logo3,"ChickenCross","aider le poulet pour traverser la route!"));
        mesItems.add(new Items(R.drawable.logo4,"DisneySnap","Capturez des innoubliable cliché grace a vos avatars disney!"));
        mesItems.add(new Items(R.drawable.logo5,"OnePunchWorld","Incarnez Saitama, completez les quetes et battez les vilains!"));
        mesItems.add(new Items(R.drawable.logo6,"GamepassXbox","Jouez aux mini jeux de l'ancienne generation de Xbox"));
        mesItems.add(new Items(R.drawable.logo7,"Minecraft","Construisez et survivez l'aventure avec Steve"));
        mesItems.add(new Items(R.drawable.logo8,"Akinator","Laissez notre genie Akinator le personnage au quel vous pensez!"));
        mesItems.add(new Items(R.drawable.logo9,"Doom","Incarnez Doom et plongez dans l'enfer pour combattre le mal"));
        mesItems.add(new Items(R.drawable.logo10,"Raft","Vous etes seul dans l'ocean avec votre bateau... Survivez l'aventure marine... les dangers des fond marin vous attendent!"));

        monAdapter = new MonAdapter(mesItems); //j'instancie mon Adapter en lui donnant ma liste

       // LinearLayoutManager layoutManager =  new LinearLayoutManager(this);
       // recyclerView.setLayoutManager(layoutManager);

        int orientation = getResources().getConfiguration().orientation;
        if (Configuration.ORIENTATION_LANDSCAPE == orientation)
        {
            recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        }else
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        recyclerView.setAdapter(monAdapter); //j'affiche mon Adapter dans mon recycleView
    }
}