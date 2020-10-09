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

public class Place_info40 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info40);
        t = findViewById(R.id.Text40);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("iywqpda7d8k");
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
        t.setText("Victoria Falls presents a spectacular sight of awe-inspiring beauty and grandeur on the Zambezi River, forming the border between Zambia and Zimbabwe. It was described by the Kololo tribe living in the area in the 1800s as ‘Mosi-oa-Tunya’ – ‘The Smoke that Thunders’. In more modern terms Victoria Falls is known as the greatest curtain of falling water in the world.\n\n" +"" +
                "Columns of spray can be seen from miles away as, at the height of the rainy season, more than five hundred million cubic meters of water per minute plummet over the edge, over a width of nearly two kilometres, into a gorge over one hundred meters below.\n\n" +
                "The wide, basalt cliff over which the falls thunder, transforms the Zambezi from a placid river into a ferocious torrent cutting through a series of dramatic gorges.\n" +
                "\n" +"Facing the Falls is another sheer wall of basalt, rising to the same height, and capped by mist-soaked rain forest. A path along the edge of the forest provides the visitor prepared to brave the tremendous spray, with an unparalleled series of views of the Falls.\n" +
                "\n" + "One special vantage point is across the Knife-edge Bridge, where visitors can have the finest view of the Eastern Cataract and the Main Falls as well as the Boiling Pot, where the river turns and heads down the Batoka Gorge. Other vantage points include Livingstone Island, the Falls Bridge, Devils Pool and the Lookout Tree, both of which command panoramic views across the Main Falls.");
    }
}
