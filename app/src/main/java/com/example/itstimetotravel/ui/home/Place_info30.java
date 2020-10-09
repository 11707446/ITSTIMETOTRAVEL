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

public class Place_info30 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    TextView t;
    private static final int RECOVERY_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info30);
        t = findViewById(R.id.Text30);
        youTubePlayerView = findViewById(R.id.toytube);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("Jjp6yah5TNo");
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
        t.setText("Churchill is a town in northern Manitoba, Canada, on the west shore of Hudson Bay, roughly 110 kilometres (68 miles) from the Manitoba–Nunavut border. It is most famous for the many polar bears that move toward the shore from inland in the autumn, leading to the nickname \"Polar Bear Capital of the World\" that has helped its growing tourism industry.\n\n" +
                "Churchill is located on Hudson Bay, at the mouth of the Churchill River on the 58th parallel north, far above most Canadian populated areas. Churchill is far from any other towns or cities, with Thompson, approximately 400 km (250 mi) to the south, being the closest larger settlement. Manitoba's provincial capital, Winnipeg, is approximately 1,000 km (620 mi) south of Churchill.\n\n" +
                "Churchill has a subarctic climate (Köppen climate classification: Dfc) with long very cold winters, and short, cool to mild summers.[11] Churchill's winters are colder than a location at a latitude of 58 degrees north should warrant, given its coastal location. The shallow Hudson Bay freezes, eliminating any maritime moderation.");
    }
}
