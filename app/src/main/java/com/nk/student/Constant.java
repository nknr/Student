package com.nk.student;

import java.util.ArrayList;
import java.util.List;

public class Constant {

    public static List<ContentValue> getActivityList(){
        List<ContentValue> contentValueList = new ArrayList<>();
        contentValueList.add(new ContentValue("MainActivity",MainActivity.class));
        contentValueList.add(new ContentValue("A Activity",AActivity.class));
        contentValueList.add(new ContentValue("B Activity",BActivity.class));
        contentValueList.add(new ContentValue("C Activity",CActivity.class));

        return contentValueList;
    }
}
