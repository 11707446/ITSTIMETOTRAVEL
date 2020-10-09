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

public class Place_info45 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info45);
        t = findViewById(R.id.Text45);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("2mDCVzruYzQ");
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
        t.setText("The Sydney Opera House is one of the most popular tourist attractions in Australia and produces more than 7 million tourists/people visiting the venue each year. The Sydney Opera House offers a variety of difference shows and performances as well as guided tours, which enables each visitor to explore the vast creation inside one of the world’s most recognisable buildings. Around 1.2 million people attend the many performances and shows, and over 318, 000 people take part of the guided tours available. The Sydney Opera House is also proudly, State, National and World Heritage listed. However, there are many threats that this iconic Australian icon encounters, including such issues as, conservation, and climate change. These different issues threaten the iconic building for future patrons and therefore need to be taken care of in order to maintain Australia’s most recognisable and best known iconic landmark.");
    }
}
