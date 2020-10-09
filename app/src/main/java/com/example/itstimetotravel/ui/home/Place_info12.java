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

public class Place_info12 extends YouTubeBaseActivity  {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    Button button;
    TextView textView;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info12);
      //  button = findViewById(R.id.youtubebutton);
        youTubePlayerView = findViewById(R.id.toytube);
        textView = findViewById(R.id.Text12);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("mtIeLsMbfzg");
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
        textView.setText("Kuala Lumpur is the capital city of Malaysia, boasting gleaming skyscrapers, colonial architecture, charming locals, and a myriad of natural attractions. Divided into numerous districts, its main hub is called the Golden Triangle which comprises Bukit Bintang, KLCC and Chinatown. KL is widely recognised for numerous landmarks, including Petronas Twin Towers (the world’s tallest twin skyscrapers), Petaling Street flea market, and Batu Caves, which is over 400 million years old\n\n" +
                "With frequent sales events throughout the year, expansive shopping malls like Pavilion KL and Suria KLCC are also among the biggest tourist attractions in the city, hosting a wide range of upmarket labels from all over the world. Plus, if you need more reason to love Kuala Lumpur, there is the abundance of gastronomic delights – with thousands of hawker stalls, cafes, and restaurants serving every imaginable type of delicacies");

    }
}
