package com.yc.mdemos.mydemos.wannengxialashuaxin.demo;

import com.dinuscxj.refresh.IDragDistanceConverter;

public class DragDistanceConverterEg implements IDragDistanceConverter {

    @Override
    public float convert(float scrollDistance, float refreshDistance) {
        return scrollDistance * 0.5f;
    }
}
