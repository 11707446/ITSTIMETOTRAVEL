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

public class Place_info20 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info20);
        t = findViewById(R.id.Text20);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("aw467fHB_ko");
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
        t.setText("The Cliffs of Moher are sea cliffs located at the southwestern edge of the Burren region in County Clare, Ireland.[2][3] They run for about 14 kilometres (9 miles). At their southern end, they rise 120 metres (390 ft) above the Atlantic Ocean at Hag's Head, and, 8 kilometres (5 miles) to the north, they reach their maximum height of 214 metres (702 ft) just north of O'Brien's Tower,[4] a round stone tower near the midpoint of the cliffs, built in 1835 by Sir Cornelius O'Brien,[2][5] then continue at lower heights. The closest settlements are the villages of Liscannor 6 km (4 miles) to the south, and Doolin 7 km (4 miles) to the north.\n\n" +
                "From the cliffs, and from atop the tower, visitors can see the Aran Islands in Galway Bay, the Maumturks and Twelve Pins mountain ranges to the north in County Galway, and Loop Head to the south.[5] The cliffs rank among the most visited tourist sites in Ireland, with around 1.5 million visits per annum.\n\n" +
                "The cliffs take their name from an old promontory fort called Mothar or Moher, which once stood on Hag's Head, the southernmost point of the cliffed coast, now the site of Moher Tower.");
    }
}
