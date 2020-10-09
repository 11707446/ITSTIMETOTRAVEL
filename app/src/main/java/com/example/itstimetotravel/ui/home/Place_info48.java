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

public class Place_info48 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info48);
        t = findViewById(R.id.Text48);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("XGIOmpb7ccA");
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
        t.setText("The Sydney Harbour Bridge is an Australian heritage-listed steel through arch bridge across Sydney Harbour that carries rail, vehicular, bicycle, and pedestrian traffic between the Sydney central business district (CBD) and the North Shore. The view of the bridge, the harbour, and the nearby Sydney Opera House is widely regarded as an iconic image of Sydney, and of Australia itself. The bridge is nicknamed \"The Coathanger\" because of its arch-based design.\n\n" +
                "The iconic bridge took eight years to build using 53,000 tonnes of steel and six-million hand-driven rivets. During construction, the two steel halves of the towering arch met in the middle of the span on 19 August 1930 at 10pm. Other fascinating facts about the famous Australian bridge include:\n\n" +
                "The bridge walk is on the eastern side. You’ll find the stairs up to the bridge walk next to the pedestrian crossing near the Australian Heritage Hotel, on Cumberland Street in the historic Rocks. Along the walk is the south-eastern Pylon Lookout, which offers a spectacular panorama.");
    }
}
