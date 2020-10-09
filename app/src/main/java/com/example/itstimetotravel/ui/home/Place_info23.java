package com.example.itstimetotravel.ui.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itstimetotravel.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Place_info23 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info23);
        t = findViewById(R.id.Text23);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("e-x74MFiWkg");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(YoutubeApi.API_KEY,onInitializedListener);
            }
        });
        t.setText("The Flavian Amphitheater, better known to the world as the Colosseum, is the most universally recognized icon in Rome. You can explore this popular tourist attraction on your own or take a guided tour for more information and the opportunity to ask questions as you go along.\n\n" +
                "Despite damage by fire, earthquake, and neglect, as well as its conversion into a fortress of the Frangipani family, the pillaging of its stone for construction of palaces, and the constant pollution of modern traffic around it, the Colosseum still creates a powerful impression of its original form.\n\n" +
                "The largest structure surviving from ancient Rome, the Colosseum was begun by Vespasian in AD 72, and eight years later enlarged by his son, Titus, adding the fourth story. ");
    }
}
