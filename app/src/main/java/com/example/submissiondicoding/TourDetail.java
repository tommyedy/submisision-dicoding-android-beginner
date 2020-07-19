package com.example.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class TourDetail extends AppCompatActivity {

    private static String title, Caption;
    private static int image;
    private TextView headingSatu, caption;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_detail);

        title   = getIntent().getExtras().getString("title","");
        Caption = getIntent().getExtras().getString("caption","");
        image   = getIntent().getExtras().getInt("image",0);

        headingSatu = findViewById(R.id.headingSatu_id);
        caption = findViewById(R.id.caption_id);
        imageView = findViewById(R.id.imgView_id);

        headingSatu.setText(title);
        caption.setText(Caption);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            caption.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }else{
            caption.setText(Caption);
        }

        imageView.setImageResource(image);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
