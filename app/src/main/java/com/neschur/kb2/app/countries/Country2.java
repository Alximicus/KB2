package com.neschur.kb2.app.countries;

import com.neschur.kb2.app.models.ObjID;

public class Country2 extends Country {
	
	void gw_c2_capitan(int cid)
	{
	/*    world.capitans[cid].army[0].armid=a_peasant;
	    world.capitans[cid].army[0].count=10;
	    world.capitans[cid].army[1].armid=a_elf;
	    world.capitans[cid].army[1].count=5;
	    world.capitans[cid].army[2].armid=0;
	    world.capitans[cid].army[3].armid=0;
	    world.capitans[cid].army[4].armid=0;*/
	}
	
	void army()
	{
	    /*gint8 v=0+51+10;
	    gint8 x;
	    gint8 y;
	    while(v<0+51+10){
	        x=rand()%65;
	        y=rand()%65;
	            if((map[x][y].obj==0)&&(map[x][y].land==l_land)){
	                map[x][y].obj=o_army;
	                map[x][y].addid=v;
	                v++;
	            }
	    }*/
	}

	public Country2()
	{
	    river(40);
	    river(50);
	    river(30);
	    //water(7);
	    landscape(7, ObjID.l_water);
	    landscape(12,ObjID.l_forest);
	    landscape(31,ObjID.l_stone);
	    //cities();
//	    castels(gw_c2_capitan);
	    //goldchest();
	    army();
	}

}
