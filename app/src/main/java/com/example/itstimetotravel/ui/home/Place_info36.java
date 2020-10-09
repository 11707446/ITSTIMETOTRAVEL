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

public class Place_info36 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info36);
        t = findViewById(R.id.Text36);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("B7vzSeQG3lw");
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
        t.setText("Lake Titicaca is a large, deep, freshwater lake in the Andes on the border of Bolivia and Peru, often called the \"highest navigable lake\" in the world. By volume of water and by surface area, it is the largest lake in South America.[5][6][7] (Lake Maracaibo has a larger surface area, but it is a tidal bay, not a lake.)\n\n" +
                "Lake Titicaca has a surface elevation of 3,812 m (12,507 ft).[8][9] The \"highest navigable lake\" claim is generally considered to refer to commercial craft. Numerous smaller bodies of water around the world are at higher elevations.[10] For many years, the largest vessel afloat on the lake was the 2,200-ton (2,425 U.S. tons), 79-metre (259 ft) SS Ollanta. Today, the largest vessel is most likely the similarly sized train barge/float Manco Capac, operated by PeruRail.\n\n" +
                "Other cultures lived on Lake Titicaca prior to the arrival of the Incas. In 2000, a team of international archaeologists and divers found the ruins of an underwater temple, thought to be between 1,000 and 1,500 years old, most likely built by the Tiwanaku people. The ruins have been measured to be 200 by 50 m (660 by 160 ft). The temple was accompanied by a village, some roads, terraces for farming and a retaining wall that ran for 800 meters.");
    }
}
