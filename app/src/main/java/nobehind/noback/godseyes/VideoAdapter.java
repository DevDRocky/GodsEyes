package nobehind.noback.godseyes;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by rock on 2017-06-19.
 */

public class VideoAdapter extends BaseAdapter {
    private final Context mContext;
    private final cctvVideo[] cctvs;

    public VideoAdapter(Context context, cctvVideo[] cctvs){
        this.mContext = context;
        this.cctvs = cctvs;
    }

    @Override
    public int getCount()
    {
        return cctvs.length;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(position));
        return dummyTextView;
    }
}
