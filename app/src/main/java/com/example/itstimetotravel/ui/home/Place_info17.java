package com.example.itstimetotravel.ui.home;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.itstimetotravel.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Place_info17 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info17);
        t = findViewById(R.id.Text17);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("SJwO7V_Y6LQ");
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
        t.setText("Shwedagon Pagoda, also known as Golden Temple, is a prominent architectural masterpiece of Yangoon city. Considered as the most sacred temple and symbol of Myanmar, this temple is also a place to store precious treasures of Buddhism. The temple, believed to be more than two thousand years old, is not only a pilgrimage site for Buddhists from all over the world but also the most popular destination for tourism in Myanmar.\n\n" +
                "According to Myanmar traditional legend, Trapusa and Bahalika Buddhism, two merchant brothers came to trade in Balkh (now in Afghanistan). On their way back, they happened to meet Shakyamuni Buddha. They offered food and were recruited by the Buddha to be the first two disciples, and given eight hair relics. When they returned, they came to Myanmar and were supported by King Okkalapa to find Singuttara Hill, near the capital of Pokkharavati to build a stupa to worship the eight hairs. This place then became Shwedagon Pagoda. According to legend and according to the monks' records, the temple was preceded by the death of the Buddha, meaning it was founded for nearly 2,500 years ago.");
    }
}
