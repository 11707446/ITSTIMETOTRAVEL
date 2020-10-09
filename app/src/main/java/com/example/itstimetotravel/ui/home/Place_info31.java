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

public class Place_info31 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info31);
        t = findViewById(R.id.Text31);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("zH87-c87noQ");
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
        t.setText("Victoria Harbour is a harbour, seaport, and seaplane airport in the Canadian city of Victoria, British Columbia. It serves as a cruise ship and ferry destination for tourists and visitors to the city and Vancouver Island. It is both a port of entry and an airport of entry for general aviation. Historically it was a shipbuilding and commercial fishing centre. While the Inner Harbour is fully within the City of Victoria, separating the city's downtown on its east side from the Victoria West neighbourhood, the Upper Harbour serves as the boundary between the City of Victoria and the district municipality of Esquimalt.[1] The inner reaches are also bordered by the district of Saanich and the town of View Royal. Victoria is a federal \"public harbour\" as defined by Transport Canada.[1][4] Several port facilities in the harbour are overseen and developed by the Greater Victoria Harbour Authority, however the harbour master's position is with Transport Canada.");
    }
}
