package com.cgh.service;

import com.cgh.common.pojo.EUDataGridResult;
import com.cgh.common.pojo.TaotaoResult;
import com.cgh.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int rows);
	TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
