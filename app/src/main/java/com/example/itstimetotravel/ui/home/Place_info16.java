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

public class Place_info16 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info16);
        t = findViewById(R.id.Text16);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("wfgLSG6ZbIg");
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
        t.setText("Daehan Dawon, the largest and oldest tea garden in the southern county of Boseong, dates back to 1937, when the first green tea trees were planted by Japanese colonialists. The area’s rich soil, humidity and day-to-night temperature differences made it a perfect location for tea cultivation.\n\n" +
                "In 1945, with Japan’s defeat in World War II, the country’s Japanese overlords returned to their native land, and Boseong’s single tea plantation was all but deserted. In the mid 1950s however, Jang Young-seob, a Korean entrepreneur, purchased the land, reestablishing it as a functioning tea plantation. Soon enough, more plantations were instituted nearby, extending as far as the coast. Boseong’s tea industry quickly began to flourish, and today, the town accounts for some 40% of Korea’s green tea production.\n\n" +
                "Presently, the tea fields boast approximately 5.8 million plants which are harvested to make yubi-cha—often considered to be Korea’s best variety, thanks to its superb taste and aroma. The seemingly endless rows of tea hedges trace a number of walking paths that are punctuated by groves of cedar, bamboo, maple or cypress trees.");
    }
}
