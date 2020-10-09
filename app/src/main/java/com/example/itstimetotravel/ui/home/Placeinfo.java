package com.example.itstimetotravel.ui.home;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.itstimetotravel.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Placeinfo extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    Button button;
    TextView textView;
   // private static final int RECOVERY_REQUEST = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeinfo);
       // button = findViewById(R.id.youtubebutton);
        youTubePlayerView = findViewById(R.id.toytube);
        textView = findViewById(R.id.Text1);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("AMhZ1TtKsFM");
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

          textView.setText("Hill of Queen shimla is a capital of Himachal Pradesh surrounded by it’s natural beauty is one of the recognized tourist spot in India. Three are many tourist places to visit in and around Shimla like Indian Institute of Advance Studies, Glen, Ridge, Mall Road, Lakar bazaar, Jakhu Temple Fagu, Kufri, chail etc.\n\n" +
                  "The Ridge road is also the venue for Summer festival, government functions and local celebrations during the New Year’s Eve. Prominent landmarks on the Ridge are a neo-Gothic structure of Church from 1844 and a tudorbethan styled library building built in 1910[1]. There are at least three statues on the ridge; that of Mahatma Gandhi, Indira Gandhi, and founder of Himachal Pradesh Dr. Y.S. Parmar, the first chief minister of Himachal Pradesh.\n\n" +
                  "If you are crazy for Shimla, and want to go there once in your life, then this is a great time to visit there. At this time, you can enjoy cool and clear atmosphere with lots of tourist gathering. On the other hand, you can get some family holiday packages. By having it, you can enjoy more with some special offers and gifts.");
    }
}
