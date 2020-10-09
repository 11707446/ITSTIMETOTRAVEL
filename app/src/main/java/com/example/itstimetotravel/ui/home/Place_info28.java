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

public class Place_info28 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info28);
        t = findViewById(R.id.Text28);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("WteZwxsvICc");
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
        t.setText("Moraine Lake is a glacially fed lake in Banff National Park, 14 kilometres (8.7 mi) outside the Village of Lake Louise, Alberta, Canada. It is situated in the Valley of the Ten Peaks, at an elevation of approximately 1,884 metres (6,181 ft). The lake has a surface area of 50 hectares (120 acres).\n\n" +
                "The lake, being glacially fed, does not reach its crest until mid to late June. When it is full, it reflects a distinctive shade of azure blue. The unique colour is due to the refraction of light off the rock flour deposited in the lake on a continual basis by surrounding glaciers.\n\n" +
                "The area around the lake has several walking/hiking trails which are, from time to time, restricted. The trail most commonly taken by tourists is The Rockpile Trail, which is along the actual moraine. The trail is approximately 300 metres (980 ft) long, with an elevation change of 24 metres (79 ft). The view of the lake from the top of the rockpile is one of the most photographed locations in all of Canada.");
    }
}
