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

public class Place_info41 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info41);
        t = findViewById(R.id.Text41);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("49jXT1n687M");
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
        t.setText("As one of the wonders of Africa, and one of the most unique religious buildings in the world, the Great Mosque of Djenné, in present-day Mali, is also the greatest achievement of Sudano-Sahelian architecture (Sudano-Sahelian refers to the Sudanian and Sahel grassland of West Africa). It is also the largest mud-built structure in the world. We experience its monumentality from afar as it dwarfs the city of Djenné. Imagine arriving at the towering mosque from the neighborhoods of low-rise adobe houses that comprise the city.\n\n" +
                "Djenné was founded between 800 and 1250 C.E., and it flourished as a great center of commerce, learning, and Islam, which had been practiced from the beginning of the 13th century. Soon thereafter, the Great Mosque became one of the most important buildings in town primarily because it became a political symbol for local residents and for colonial powers like the French who took control of Mali in 1892. Over the centuries, the Great Mosque has become the epicenter of the religious and cultural life of Mali, and the community of Djenné. It is also the site of a unique annual festival called the Crepissage de la Grand Mosquée (Plastering of the Great Mosque).");
    }
}
