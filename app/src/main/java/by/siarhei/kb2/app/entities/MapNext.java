package by.siarhei.kb2.app.entities;

import by.siarhei.kb2.app.R;
import by.siarhei.kb2.app.models.MapPoint;

public class MapNext extends EntityImpl {

    public MapNext(MapPoint point) {
        super(point);
    }

    @Override
    public int getID() {
        return R.drawable.map;
    }
}
