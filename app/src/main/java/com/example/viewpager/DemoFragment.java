package com.example.viewpager;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends Fragment {
    private TextView textView;
    private int[] imageTextIds ={R.id.textViewInImageOne,R.id.textViewInImageTwo,R.id.textViewInImageThree,
            R.id.textViewInImageFour,R.id.textViewInImageFive,R.id.textViewInImageSix,R.id.textViewInImageSeven};
    private int imageViewIds[] ={R.id.circleImageOne,R.id.circleImageTwo,R.id.circleImageThree,R.id.circleImageFour,
            R.id.circleImageFive,R.id.circleImageSix,R.id.circleImageSeven};
    private ImageView[] imageViewArrray;

    public DemoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);

        init(view);
        textView = view.findViewById(R.id.textViewIdFragmentDemo);
        int position = getArguments().getInt("message",1);
        textView.setText(String.valueOf(position));
        int y = (position-1) %7 ;
        imageViewArrray[y].setImageResource(R.drawable.replace);
        return view;
    }

    void init(View view)
    {
        imageViewArrray = new ImageView[]{view.findViewById(R.id.circleImageOne),
                view.findViewById(R.id.circleImageTwo),
                view.findViewById(R.id.circleImageThree),
                view.findViewById(R.id.circleImageFour),
                view.findViewById(R.id.circleImageFive),
                view.findViewById(R.id.circleImageSix),
                view.findViewById(R.id.circleImageSeven)};
    }


}
