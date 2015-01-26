package com.u1fukui.androiddemos.activity.ui;

import com.u1fukui.androiddemos.DemoItem;
import com.u1fukui.androiddemos.DemoItemListAdapter;
import com.u1fukui.androiddemos.activity.BaseListActivity;
import com.u1fukui.androiddemos.activity.ui.tab.PagerTabStripActivity;
import com.u1fukui.androiddemos.activity.ui.tab.SlidingTabLayoutActivity;

import java.util.ArrayList;

public class UiListActivity extends BaseListActivity {

    @Override
    protected DemoItemListAdapter createListAdapter() {
        ArrayList<DemoItem> itemList = new ArrayList<DemoItem>();
        itemList.add(new DemoItem(PagerTabStripActivity.class, "PagerTabStrip"));
        itemList.add(new DemoItem(SlidingTabLayoutActivity.class, "SlidingTabLayout"));
        return new DemoItemListAdapter(this, itemList);
    }
}
