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

public class Place_info25 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info25);
        t = findViewById(R.id.Text25);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("brZzLyzaXbA");
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
        t.setText("The Lakota gave this land its name, “Mako Sica,” meaning “land bad.” Located in southwestern South Dakota, Badlands National Park consists of 244,000 acres of sharply eroded buttes, pinnacles and spires blended with the largest protected mixed grass prairie in the United States. It is desolation at its truest, where you can look for miles and see no sign of civilization.\\n\\n\" +\n" +
                "                        \"This land has been so ruthlessly ravaged by wind and water that it has become picturesque. The Badlands are a wonderland of bizarre, colorful spires and pinnacles, massive buttes and deep gorges. Erosion of the Badlands reveals sedimentary layers of different colors: purple and yellow (shale), tan and gray (sand and gravel), red and orange (iron oxides) and white (volcanic ash).\\n\\n\" +\n" +
                "                        \"Badlands National Park also preserves the world’s greatest fossil beds of animals from the Oligocene Epoch of the Age of Mammals");
    }
}
