package com.cgh.order.service;

import java.util.List;

import com.cgh.common.pojo.TaotaoResult;
import com.cgh.pojo.TbOrder;
import com.cgh.pojo.TbOrderItem;
import com.cgh.pojo.TbOrderShipping;

public interface OrderService {

	TaotaoResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping);
}
