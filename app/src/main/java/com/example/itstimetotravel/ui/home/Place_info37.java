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

public class Place_info37 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info37);
        t = findViewById(R.id.Text37);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("3xvnQitpPeU");
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
        t.setText("San Pedro de Atacama is a town set on an arid high plateau in the Andes mountains of northeastern Chile. Its dramatic surrouding landscape incorporates desert, salt flats, volcanoes, geysers and hot springs. The Valle de la Luna in the nearby Los Flamencos National Reserve is a lunarlike depression with unusual rock formations, a huge sand dune and pink-streaked mountains.\\n\\n\" +\n" +
                "                \"San Pedro de Atacama grew, over centuries, around an oasis in the Puna de Atacama, an arid high plateau. Its first inhabitants were the Atacameños, who developed basketworks and ceramic pottery crafts that can be now be appreciated by tourists in the several souvenir shops as typical products of San Pedro de Atacama.\\n\\n\" +\n" +
                "                \"It was part of Bolivia since independence until Chile claimed ownership during the War of the Pacific. During that war, the Battle of Río Grande was fought in the surroundings.");
    }
}
