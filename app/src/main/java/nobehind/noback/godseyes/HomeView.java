package nobehind.noback.godseyes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;

public class HomeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_view);
        TextView t = (TextView)findViewById(R.id.tbxHelloWorld);
        t.setText("World Hello");

        cctvVideo[] cctvs =
                {
                        new cctvVideo(1),
                        new cctvVideo(2),
                        new cctvVideo(3),
                        new cctvVideo(4),
                        new cctvVideo(5),
                        new cctvVideo(6),
                };

        GridView gView = (GridView)findViewById(R.id.gdvVideoView);
        VideoAdapter vAdapter = new VideoAdapter(this, cctvs);
        gView.setAdapter(vAdapter);
    }
}
