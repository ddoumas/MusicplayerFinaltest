package com.example.musicplayerfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        //HOME
        // Find the View that shows the home text category
        TextView home = (TextView) findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the home image category
        ImageView homeImage = (ImageView) findViewById(R.id.homeImage);

        // Set a click listener on that View
        homeImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        //PLAYLISTS
        // Find the View that shows the playlists text category
        TextView playlists = (TextView) findViewById(R.id.playlists);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(RadioActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the playlists image category
        ImageView playlistsImage = (ImageView) findViewById(R.id.playlistsImage);

        // Set a click listener on that View
        playlistsImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(RadioActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });



        //SEARCH
        // Find the View that shows the search text category
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(RadioActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the search image category
        ImageView searchImage = (ImageView) findViewById(R.id.searchImage);

        // Set a click listener on that View
        searchImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(RadioActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
        //SUBSCRIBE
        // Find the View that shows the card text category
        TextView card = (TextView) findViewById(R.id.card);

        // Set a click listener on that View
        card.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the mood TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent cardIntent = new Intent(RadioActivity.this, PayActivity.class);
                startActivity(cardIntent);
            }
        });

        // Find the View that shows the card image category
        ImageView cardImage = (ImageView) findViewById(R.id.cardImage);

        // Set a click listener on that View
        cardImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the mood ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent cardIntent = new Intent(RadioActivity.this, PayActivity.class);
                startActivity(cardIntent);
            }
        });

    }
}
