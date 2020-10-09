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

public class Place_info22 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info22);
        t = findViewById(R.id.Text22);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("_YerhEVQUTQ");
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
        t.setText("A fjord is a deep, narrow and elongated sea or lakedrain, with steep land on three sides. The opening toward the sea is called the mouth of the fjord, and is often shallow. The fjord's inner part is called the sea bottom. If the geological formation is wider than it is long, it is not a fjord. Then it is a bay or cove.\n\n" +
                "The fjords were formed by the giant glacier tongues that through several ice ages have shaped the landscape. A fjord is thus a U-shaped undersea valley, and on the west coast, this valley is often surrounded by dramatic mountain scenery.In front of the glacier arm, there was deposited a moraine of gravel and sand that formed an underwater barrier, often called \"sea thresholds\" or \"ra\". Places where the fjord is shallow.\n\n" +
                "This shallow threshold in the mouth of the fjord, is the reason that fjords often are quieter than the open sea. Thus fjords are often natural harbors.");
    }
}
