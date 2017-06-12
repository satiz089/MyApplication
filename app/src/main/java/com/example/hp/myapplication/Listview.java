package com.example.hp.myapplication;

/**
 * Created by hp on 5/20/2017.
 */
import java.util.ArrayList;
import java.util.HashMap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

public class Listview extends Activity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    ListView lv;
    Context context;
    private SliderLayout mDemoSlider;
    Button select_video,select_image,select_milestone,video_button;
    LinearLayout selected_video,selected_image,selected_milestone,select_video_new,select_image_new,select_milestone_new;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.housesmall,R.drawable.hannibalsmall,R.drawable.housesmall,R.drawable.hannibalsmall,R.drawable.housesmall,R.drawable.hannibalsmall,R.drawable.housesmall,R.drawable.hannibalsmall,R.drawable.housesmall};
    public static String [] prgmNameList={"EMPTINESS FT.JUSTIN TIBLEKAR","I'M FALLING LOVE WITH YOU","EMPTINESS FT.JUSTIN TIBLEKAR","I'M FALLING LOVE WITH YOU","EMPTINESS FT.JUSTIN TIBLEKAR","I'M FALLING LOVE WITH YOU","EMPTINESS FT.JUSTIN TIBLEKAR","I'M FALLING LOVE WITH YOU","EMPTINESS FT.JUSTIN TIBLEKAR"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        select_video = (Button)findViewById(R.id.video_button);
        select_image = (Button)findViewById(R.id.image_button);
        select_milestone = (Button)findViewById(R.id.milestone_button);


        selected_video = (LinearLayout)findViewById(R.id.selected_video);
        selected_image = (LinearLayout)findViewById(R.id.selected_image);
        selected_milestone = (LinearLayout)findViewById(R.id.selected_milestone);

        select_video_new = (LinearLayout)findViewById(R.id.select_video);
        select_image_new = (LinearLayout)findViewById(R.id.select_image);
        select_milestone_new = (LinearLayout)findViewById(R.id.select_milestone);



        select_video_new.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                selected_video.setVisibility(View.VISIBLE);
                select_video_new.setVisibility(View.INVISIBLE);
                select_milestone_new.setVisibility(View.VISIBLE);
                select_image_new.setVisibility(View.VISIBLE);
                selected_milestone.setVisibility(View.INVISIBLE);
                selected_image.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();

            }
        });


 select_image_new.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                selected_image.setVisibility(View.VISIBLE);
                select_image_new.setVisibility(View.INVISIBLE);
                select_milestone_new.setVisibility(View.VISIBLE);
                select_video_new.setVisibility(View.VISIBLE);
                selected_video.setVisibility(View.INVISIBLE);
                selected_milestone.setVisibility(View.INVISIBLE);


                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();

            }
        });


 select_milestone_new.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                selected_milestone.setVisibility(View.VISIBLE);
                select_milestone_new.setVisibility(View.INVISIBLE);
                select_image_new.setVisibility(View.VISIBLE);
                select_video_new.setVisibility(View.VISIBLE);
                selected_image.setVisibility(View.INVISIBLE);
                selected_video.setVisibility(View.INVISIBLE);


                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();

            }
        });


  select_video.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                selected_video.setVisibility(View.VISIBLE);
                select_video_new.setVisibility(View.INVISIBLE);
                select_milestone_new.setVisibility(View.VISIBLE);
                select_image_new.setVisibility(View.VISIBLE);
                selected_milestone.setVisibility(View.INVISIBLE);
                selected_image.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();

            }
        });


 select_image.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                selected_image.setVisibility(View.VISIBLE);
                select_image_new.setVisibility(View.INVISIBLE);
                select_milestone_new.setVisibility(View.VISIBLE);
                select_video_new.setVisibility(View.VISIBLE);
                selected_video.setVisibility(View.INVISIBLE);
                selected_milestone.setVisibility(View.INVISIBLE);


                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();

            }
        });


 select_milestone.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                selected_milestone.setVisibility(View.VISIBLE);
                select_milestone_new.setVisibility(View.INVISIBLE);
                select_image_new.setVisibility(View.VISIBLE);
                select_video_new.setVisibility(View.VISIBLE);
                selected_image.setVisibility(View.INVISIBLE);
                selected_video.setVisibility(View.INVISIBLE);


                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_LONG).show();

            }
        });



        mDemoSlider = (SliderLayout)findViewById(R.id.slider);

        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("Hannibal", "http://static2.hypable.com/wp-content/uploads/2013/12/hannibal-season-2-release-date.jpg");
        url_maps.put("Big Bang Theory", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
        url_maps.put("House of Cards", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
        url_maps.put("Game of Thrones", "http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Hannibal",R.drawable.hannibal);
        //file_maps.put("Big Bang Theory",R.drawable.bigbang);
        file_maps.put("House of Cards",R.drawable.house);
        file_maps.put("Game of Thrones", R.drawable.game_of_thrones);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(400000);
        mDemoSlider.addOnPageChangeListener(this);
        ListView l = (ListView)findViewById(R.id.transformers);
        l.setAdapter(new TransformerAdapter(this));
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mDemoSlider.setPresetTransformer(((TextView) view).getText().toString());
                Toast.makeText(Listview.this, ((TextView) view).getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));

    }



    @Override
    protected void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this, slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_custom_indicator:
                mDemoSlider.setCustomIndicator((PagerIndicator) findViewById(R.id.custom_indicator));
                break;
            case R.id.action_custom_child_animation:
                mDemoSlider.setCustomAnimation(new ChildAnimationExample());
                break;
            case R.id.action_restore_default:
                mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
                mDemoSlider.setCustomAnimation(new DescriptionAnimation());
                break;
            case R.id.action_github:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/daimajia/AndroidImageSlider"));
                startActivity(browserIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}