package com.ediancha.edcbusiness.entity;

import java.util.List;

/**
 * Created by dengmingzhi on 16/6/14.
 */
public class BaseLvEntity<T extends Data> extends Entity {
    public List<T> data;
}
