package com.example.musicplayerfinal;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        //HOME
        // Find the View that shows the home text category
        TextView home = (TextView) findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PayActivity.this, MainActivity.class);
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
                Intent homeIntent = new Intent(PayActivity.this, MainActivity.class);
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
                Intent playlistIntent = new Intent(PayActivity.this, PlaylistsActivity.class);
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
                Intent playlistsIntent = new Intent(PayActivity.this, PlaylistsActivity.class);
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
                Intent searchIntent = new Intent(PayActivity.this, SearchActivity.class);
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
                Intent searchIntent = new Intent(PayActivity.this, SearchActivity.class);
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
                Intent radioIntent = new Intent(PayActivity.this, RadioActivity.class);
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
                Intent radioIntent = new Intent(PayActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });


    }
}
