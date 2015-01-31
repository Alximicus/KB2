package com.neschur.kb2.app.entities;

import com.neschur.kb2.app.R;
import com.neschur.kb2.app.countries.Country;
import com.neschur.kb2.app.models.MapPoint;

public class Nave extends Entity {
    public Nave(MapPoint point) {
        super(point);
    }

    @Override
    public int getID() {
        return R.drawable.nave;
    }

    public boolean move(int x, int y) {
        move(x, y, null);
        return true;
    }

    public void move(int x, int y, Country country) {
        point.setEntity(null);
        point = country.getMapPoint(x, y);
        point.setEntity(this);
    }
}
