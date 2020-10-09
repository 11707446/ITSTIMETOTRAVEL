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

public class Place_info51 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info51);
        t = findViewById(R.id.Text51);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("QojXRvYgXxo");
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
        t.setText("Fraser Island is one of the world's most unusual islands. Not only is it the largest sand island in the world – 123 kilometres (76 miles) long and 22 kilometres (14 miles) wide – but it's the only place on Earth where tall rainforests grow on sand dunes at elevations of more than 200 metres (656 feet). It also has half the world's perched lakes – lakes formed when depressions in dunes fill permanently with rainwater.\n\n" +
                "Home to the most pure strain of dingoes remaining in eastern Australia, and one of the best places to see baby humpback whales and their mothers, Fraser Island also has superb scenery, with massive shifting sand blows, sensational swimming spots and thrilling 4WD tracks. A World Heritage-listed wilderness with lots of resort-style comforts, Fraser is the perfect place to go wild.");
    }
}
