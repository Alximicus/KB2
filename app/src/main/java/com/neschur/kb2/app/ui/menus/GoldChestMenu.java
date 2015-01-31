package com.neschur.kb2.app.ui.menus;

import com.neschur.kb2.app.I18n;
import com.neschur.kb2.app.controllers.GameController;
import com.neschur.kb2.app.entities.Entity;
import com.neschur.kb2.app.entities.GoldChest;

public class GoldChestMenu extends Menu {
    final int COUNT = 2;
    private GoldChest chest;

    public GoldChestMenu(Entity entity, GameController gameController) {
        super(gameController);
        this.chest = (GoldChest) entity;
    }

    public String getItemDescription(int i) {
        return I18n.translate("entity_menus_goldchest_item" + (i + 1));
    }

    @Override
    public boolean select(int i) {
        switch (i) {
            case 0:
                player.changeMoney(+chest.getGold());
            case 1:
                player.changeAuthority(+chest.getAuthority());
        }
        chest.destroy();
        return true;
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}
