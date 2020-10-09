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

public class Place_info47 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info47);
        t = findViewById(R.id.Text47);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("DygyYL4dylU");
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
        t.setText("Kata Tjuṯa also known as the Olgas, is a group of large, domed rock formations or bornhardts located about 360 km (220 mi) southwest of Alice Springs, in the southern part of the Northern Territory, central Australia. Uluru, also known as Ayers Rock, located 25 km (16 mi) to the east, and Kata Tjuṯa form the two major landmarks within the Uluru-Kata Tjuṯa National Park. The park is considered sacred to the Aboriginal people of Australia.\n\n" +
                  "The 36 domes that make up Kata Tjuṯa cover an area of 21.68 km2 (8.37 sq mi), are composed of conglomerate, a sedimentary rock consisting of cobbles and boulders of varying rock types including granite and basalt, cemented by a matrix of sandstone. The highest dome, Mount Olga, is 1,066 m (3,497 ft) above sea level, or approximately 546 m (1,791 ft) above the surrounding plain (198 m (650 ft) higher than Uluru).[1] Kata Tjuta is located at the eastern end of the Docker River Road.");
    }
}
