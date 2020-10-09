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

public class Place_info21 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info21);
        t = findViewById(R.id.Text21);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("mj-bwFWb4VE");
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
        t.setText("Old Town, or Staré Mesto, is a lively cobblestoned hub with landmark attractions such as the medieval Astronomical Clock and the Gothic Church of Our Lady Before Týn, on Old Town Square. The Rudolfinum concert hall hosts classical music, while the Estates Theatre stages ballet and opera. Student nightlife is centered around the vast 5-story Karlovy Lázně dance club.\n\n" +
                "Notable places in the Old Town include Old Town Square and Astronomical Clock. The Old Town is surrounded by the New Town of Prague. Across the river Vltava connected by the Charles Bridge is the Lesser Town of Prague (Czech: Malá Strana). The former Jewish Town (Josefov) is located in the northwest corner of Old Town heading towards the Vltava.\n\n" +
                "Old Town Square draws the greatest number of visitors in Prague as it boasts meticulously preserved buildings and monuments: the Church of Our Lady in front of Tyn, The Old Town City Hall and the Baroque church St. Nicolas. One building that truly dominates the square is the Old Town City Hall, which dates back to 1338. In 1410 the astronomical clock was added to the Hall with a chronometer and the zodiac below; this clock is a worldwide attraction.");
    }
}
