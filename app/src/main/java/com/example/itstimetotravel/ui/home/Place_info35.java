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

public class Place_info35 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info35);
        t = findViewById(R.id.Text35);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("1vPMD3wmaZo");
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
        t.setText("Salar de Uyuni (or Salar de Tunupa)[1] is the world's largest salt flat, or playa, at over 10,000 square kilometres (3,900 sq mi) in area.[2] It is in the Daniel Campos Province in Potosí in southwest Bolivia, near the crest of the Andes at an elevation of 3,656 meters (11,995 ft) above sea level.\n\n" +
                "The Salar was formed as a result of transformations between several prehistoric lakes. It is covered by a few meters of salt crust, which has an extraordinary flatness with the average elevation variations within one meter over the entire area of the Salar. The crust serves as a source of salt and covers a pool of brine, which is exceptionally rich in lithium. It contains 50% to 70% of the world's known lithium reserves according to a 2009 Foreign Policy article by Joshua Keating.[4] The large area, clear skies, and exceptional flatness of the surface make the Salar ideal for calibrating the altimeters of Earth observation satellites.[5][6][7][8][9] Following rain, a thin layer of dead calm water transforms the flat into the world's largest mirror, 129 kilometers (80 miles) across.");
    }
}
