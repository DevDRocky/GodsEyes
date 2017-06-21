package nobehind.noback.godseyes;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class SelectedVideoDetail extends AppCompatActivity {

    public final static String VIDEO_URL = "http://sites.google.com/site/ubiaccessmobile/sample_video.mp4";
    public final static int URL = 1;
    public final static int SDCARD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_video_detail);

        final VideoView vView = (VideoView)findViewById(R.id.vdvSelectedCam);

        vView.setVideoURI(Uri.parse(VIDEO_URL));

        final MediaController mCtrl = new MediaController(this);
        vView.setMediaController(mCtrl);

        vView.start();

        vView.postDelayed(new Runnable() {
            @Override
            public void run() {
                mCtrl.show(0);
                vView.pause();
            }
        }, 100);
    }
}
