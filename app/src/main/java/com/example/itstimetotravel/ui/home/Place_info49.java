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

public class Place_info49 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info49);
        t = findViewById(R.id.Text49);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("q5Ay06xpFoE");
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
        t.setText("Blue Mountains National Park is a vast region west of Sydney, Australia, and part of the Great Dividing Range. The Echo Point lookout, near the town of Katoomba, has panoramic views of Jamison Valley and the Three Sisters, a towering sandstone formation and sacred Aboriginal site. Trails lead through bushland, home to lyrebirds and crimson rosella parrots, to the Giant Stairway, which descends to Jamison Valley.\n\n" +
                "The mountain area of Phawngpui is at most times covered by a thin stretch of clouds, which makes it blue in appearance from a distance, hence the name Blue Mountain. The temperature therefore is mild throughout the year ranging from 11-29°C, with an average rainfall of 3,000 cm.[3] It overlooks the major river Chhimtuipui flowing towards Burma. The edges of the mountains are all very steep and mostly of sharp precipices, and the most spectacular is a semi-circular beautiful cliff on the western side called Thlazuang Khâm, which has a blunt and deep fall.");
    }
}
