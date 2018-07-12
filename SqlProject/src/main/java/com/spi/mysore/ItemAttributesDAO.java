package com.spi.mysore;

public interface ItemAttributesDAO {
	
public void createItem(ItemAttributes ia);
	
public ItemAttributes getByItemId(int itemId);
}
