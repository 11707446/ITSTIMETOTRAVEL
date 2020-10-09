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

public class Place_info24 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info24);
        t = findViewById(R.id.Text24);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("1lwh902bb9Y");
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
        t.setText("Alpine lake with the only island in Slovenia has been a world-renowned paradise for centuries, impressing visitors with its natural beauty, wealth of legend, and special powers to restore well-being. Look out at the lake from a castle on a cliff and visit the island on a traditional “pletna” boat.\n\n" +
                "The church bell, made in the early 16th century, is said to have come from the pope himself. The story goes that he gave it to the church after the original bell, sent to the island by an inconsolable widow in remembrance of her late husband, ended up sinking to the bottom of the lake in a storm. So, Bled really has a pair of legendary bells: the one in the church and the one on the bottom of the lake. The legend about the sunken bell is brought to life every year by a special Christmas event\n\n" +
                "The most beautiful view of the lake, its island, and the surrounding peaks is from the castle towering over the lake on a cliff. Due to its beauty, it is considered to be one of the loveliest wedding venues in Europe, and it has also been the location of important diplomatic and state protocol meetings.");
    }
}
