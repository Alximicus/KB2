package com.neschur.kb2.app.objs;

import com.neschur.kb2.app.R;
import com.neschur.kb2.app.countries.Country;

public class Magican extends Obj{

	public Magican(Country country, int x, int y) {
		super(country, x, y);
	}

	@Override
	public int getID() {
		return R.drawable.magican;
	}

	@Override
	public int action() {
//		ScreenController.pushMenus(new MagicanMenu());
//		delete();
		return 0;
	}
}