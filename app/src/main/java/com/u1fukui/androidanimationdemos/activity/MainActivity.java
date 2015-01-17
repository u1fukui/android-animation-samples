package com.u1fukui.androidanimationdemos.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.u1fukui.androidanimationdemos.DemoItem;
import com.u1fukui.androidanimationdemos.DemoItemListAdapter;
import com.u1fukui.androidanimationdemos.R;
import com.u1fukui.androidanimationdemos.activity.propertyanim.InterpolatorActivity;
import com.u1fukui.androidanimationdemos.activity.propertyanim.LayoutTransitionActivity;
import com.u1fukui.androidanimationdemos.activity.propertyanim.ObjectAnimatorActivity;
import com.u1fukui.androidanimationdemos.activity.propertyanim.ValueAnimatorActivity;
import com.u1fukui.androidanimationdemos.activity.propertyanim.ViewPropertyAnimatorActivity;
import com.u1fukui.androidanimationdemos.activity.transition.ActivityTransitionTrainingActivity;
import com.u1fukui.androidanimationdemos.activity.transition.FragmentTransitionActivity;
import com.u1fukui.androidanimationdemos.activity.viewanim.AllViewAnimationActivity;
import com.u1fukui.androidanimationdemos.activity.viewanim.AnimationSetActivity;
import com.u1fukui.androidanimationdemos.activity.viewanim.RotateAnimationActivity;
import com.u1fukui.androidanimationdemos.activity.viewanim.TransitionAnimationFirstActivity;
import com.u1fukui.androidanimationdemos.activity.viewanim.TranslateAnimationActivity;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity
        implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(createListAdapter());
        listView.setOnItemClickListener(this);
    }

    private DemoItemListAdapter createListAdapter() {
        ArrayList<DemoItem> itemList = new ArrayList<DemoItem>();
        itemList.add(new DemoItem(AllViewAnimationActivity.class, "AlphaAnimation"));
        itemList.add(new DemoItem(RotateAnimationActivity.class, "RotateAnimation"));
        itemList.add(new DemoItem(AnimationSetActivity.class, "AnimationSet"));
        itemList.add(new DemoItem(TransitionAnimationFirstActivity.class, "Transition"));
        itemList.add(new DemoItem(TranslateAnimationActivity.class, "TranslateAnimation"));
        itemList.add(new DemoItem(ValueAnimatorActivity.class, "ValueAnimator"));
        itemList.add(new DemoItem(ObjectAnimatorActivity.class, "ObjectAnimator"));
        itemList.add(new DemoItem(InterpolatorActivity.class, "Interpolator"));
        itemList.add(new DemoItem(ViewPropertyAnimatorActivity.class, "ViewPropertyAnimator"));
        itemList.add(new DemoItem(LayoutTransitionActivity.class, "LayoutTransition"));
        itemList.add(new DemoItem(ActivityTransitionTrainingActivity.class, "ActivityTransition"));
        itemList.add(new DemoItem(FragmentTransitionActivity.class, "FragmentTransition"));
        return new DemoItemListAdapter(this, itemList);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        DemoItem item = (DemoItem) parent.getItemAtPosition(position);
        if (item != null) {
            Intent intent = new Intent(this, item.getActivityClass());
            startActivity(intent);
        }
    }
}
