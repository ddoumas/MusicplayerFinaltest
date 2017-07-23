package com.example.musicplayerfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        //HOME
        // Find the View that shows the home text category
        TextView home = (TextView) findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
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
                Intent homeIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
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
                Intent searchIntent = new Intent(PlaylistsActivity.this, SearchActivity.class);
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
                Intent searchIntent = new Intent(PlaylistsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });



        //RADIO
        // Find the View that shows the radio text category
        TextView radio = (TextView) findViewById(R.id.radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the radio TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(PlaylistsActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });

        // Find the View that shows the radio image category
        ImageView radioImage = (ImageView) findViewById(R.id.radioImage);

        // Set a click listener on that View
        radioImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the radio ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(PlaylistsActivity.this, RadioActivity.class);
                startActivity(radioIntent);
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
                Intent cardIntent = new Intent(PlaylistsActivity.this, PayActivity.class);
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
                Intent moodIntent = new Intent(PlaylistsActivity.this, PayActivity.class);
                startActivity(moodIntent);
            }
        });


    }
}
