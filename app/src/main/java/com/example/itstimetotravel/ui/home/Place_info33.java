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

public class Place_info33 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info33);
        t = findViewById(R.id.Text33);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("e_HnyYBFxLs");
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
        t.setText("Angel Falls is a waterfall in Venezuela. It is the world's highest uninterrupted waterfall, with a height of 979 metres and a plunge of 807 m. The waterfall drops over the edge of the Auyán-tepui mountain in the Canaima National Park, a UNESCO World Heritage site in the Gran Sabana region of Bolívar State.\n\n" +
                "The falls are along a fork of the Rio Kerepacupai Meru which flows into the Churun River, a tributary of the Carrao River, itself a tributary of the Orinoco River.\n\n" +
                "The waterfall has been known as the Angel Falls since the mid-20th century; they are named after Jimmie Angel, a US aviator, who was the first person to fly over the falls.[2] Angel's ashes were scattered over the falls on 2 July 1960.\n\n" +
                "The common Spanish name Salto Ángel derives from his surname. In 2009, President Hugo Chávez announced his intention to change the name to the purported original indigenous Pemon term (\"Kerepakupai Vená\", meaning \"waterfall of the deepest place\"), on the grounds that the nation's most famous landmark should bear an indigenous name.");
    }
}
