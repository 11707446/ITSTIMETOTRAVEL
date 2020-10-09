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

public class Place_info46 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info46);
        t = findViewById(R.id.Text46);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("35Jom_dGS0I");
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
        t.setText("The Great Barrier Reef Marine Park protects a large part of Australia's Great Barrier Reef from damaging activities. It is a vast multiple-use Marine Park which supports a wide range of uses, including commercial marine tourism, fishing, ports and shipping, recreation, scientific research and Indigenous traditional use. Fishing and the removal of artefacts or wildlife (fish, coral, seashells, etc.) is strictly regulated, and commercial shipping traffic must stick to certain specific defined shipping routes that avoid the most sensitive areas of the park. The Great Barrier Reef is the largest and best known coral reef ecosystem in the world. Its reefs, almost 3000 in total, represent about 10 per cent of all the coral reef areas in the world. It supports an amazing variety of biodiversity, providing a home to thousands of coral and other invertebrate species, bony fish, sharks, rays, marine mammals, marine turtles, sea snakes, as well as algae and other marine plants.");
    }
}
