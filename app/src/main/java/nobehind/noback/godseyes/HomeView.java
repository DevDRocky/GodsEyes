package nobehind.noback.godseyes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

public class HomeView extends AppCompatActivity {

    ImageButton btnLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_view);
        TextView t = (TextView)findViewById(R.id.tbxTextView);
        t.setText("World Hello");

        cctvVideo[] cctvs =
                {
                        new cctvVideo(1),
                        new cctvVideo(2),
                        new cctvVideo(3),
                        new cctvVideo(4),
                        new cctvVideo(5),
                        new cctvVideo(6),
                        new cctvVideo(7),
                        new cctvVideo(8),
                        new cctvVideo(9),
                        new cctvVideo(10),
                        new cctvVideo(11),
                        new cctvVideo(12),
                        new cctvVideo(13),
                };

        GridView gView = (GridView)findViewById(R.id.gdvVideoView);
        VideoAdapter vAdapter = new VideoAdapter(this, cctvs);
        gView.setAdapter(vAdapter);

        gView.setOnItemClickListener(new GridView.OnItemClickListener()
        {
           @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
           {
               Intent intent = new Intent(HomeView.this, SelectedVideoDetail.class);
               startActivity(intent);
           }
        });

        btnLock = (ImageButton)findViewById(R.id.btnLock);
        btnLock.setOnClickListener(btnLockHandler);
    }

    View.OnClickListener btnLockHandler = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            btnLock.setBackgroundResource(R.mipmap.ic_lock_open);
        }
    };
}
