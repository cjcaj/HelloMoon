package com.cjcaj.android.HelloMoon;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by carloca on 3/11/14.
 */
public class HelloMoonFragment extends Fragment {
    private AudioPlayer mPlayer = new AudioPlayer();
    private Button mPlayButton;
    private Button mStopButton;
    private Button mPauseButton;
    private VideoView mVideoView;
    private MediaController mMediaController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);

        mVideoView = (VideoView) v.findViewById(R.id.hellomoon_videoView);
        mMediaController = new MediaController(getActivity());
        Uri resourceUri = Uri.parse("android.resource://com.cjcaj.android.HelloMoon/raw/apollo_17_stroll");
        mVideoView.setVideoURI(resourceUri);
        mVideoView.setMediaController(mMediaController);
        mVideoView.start();
        return v;
    }
}
