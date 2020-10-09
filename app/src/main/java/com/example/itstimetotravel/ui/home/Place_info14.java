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

public class Place_info14 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    Button button;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info14);
        t = findViewById(R.id.Text14);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("EotbKqZmBuY");
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
        t.setText("The Great Wall of China is an ancient wall in China. The wall is made of cement, rocks, bricks, and powdered dirt. It was finished in 1878[1] and it was meant to protect the north of the empire of China from enemy attacks. It is the longest structure humans have ever built. It is about 21,196 kilometres (13,171 miles) long, 9.1 metres (30 feet) wide and 15 metres (50 feet) high. The earlier sections on the wall are made of compacted dirt and stone. Later in the Ming Dynasty they used bricks. There are 7,000 watch towers, block houses for soldiers and beacons to send smoke signals.\n\n" +
                "Nineteen walls have been built that were called the Great Wall of China. The first was built in the 7th century BC. The most famous wall was built between 226–200 BC by the first Emperor of Imperial China, Qin Shai Hong, during the Qin Dynasty. Not much of this wall remains as people have been stealing from it. It was much farther north than the current wall. The current wall was built during the Ming Dynasty.[2] (Qin pronounced like Chin).");
    }
}
