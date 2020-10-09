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

public class Place_info44 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info44);
        t = findViewById(R.id.Text44);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("XRwrpXf5V6c");
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
        t.setText("Tanzania is home to some of Africa's most famous national parks and natural attractions, including majestic Mount Kilimanjaro. Consequently, the most popular things to do in Tanzania and the reason many people visit the country, are the safaris and wildlife related adventures.\n\n" +
                "Mount Kilimanjaro is Africa's highest peak (5,895 m) and Tanzania's most iconic image. Mount Kilimanjaro National Park, unlike other parks in northern Tanzania, is not visited for the wildlife but for the chance to stand in awe of this beautiful snow-capped mountain and, for many, to climb to the summit. Mount Kilimanjaro can be climbed at any time, although the best period is from late June to October, during the dry season.");
    }
}
