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

public class Place_info38 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info38);
        t = findViewById(R.id.Text38);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("c4U5Y7MSAJc");
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
        t.setText("Easter Island, a Chilean territory, is a remote volcanic island in Polynesia. Its native name is Rapa Nui. It’s famed for archaeological sites, including nearly 900 monumental statues called moai, created by inhabitants during the 13th–16th centuries. The moai are carved human figures with oversize heads, often resting on massive stone pedestals called ahus. Ahu Tongariki has the largest group of upright moai.\\n\\n\" +\n" +
                "                \"It is believed that Easter Island's Polynesian inhabitants arrived on Easter Island sometime near 1200 AD.[3] They created a thriving and industrious culture, as evidenced by the island's numerous enormous stone moai and other artifacts. However, land clearing for cultivation and the introduction of the Polynesian rat led to gradual deforestation.[3] By the time of European arrival in 1722, the island's population was estimated to be 2,000 to 3,000. European diseases, Peruvian slave raiding expeditions in the 1860s, and emigration to other islands, e.g. Tahiti, further depleted the population, reducing it to a low of 111 native inhabitants in 1877.");
    }
}
