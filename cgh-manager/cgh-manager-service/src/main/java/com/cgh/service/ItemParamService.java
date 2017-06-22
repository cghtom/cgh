package com.cgh.service;

import com.cgh.common.pojo.TaotaoResult;
import com.cgh.pojo.TbItemParam;

public interface ItemParamService {

	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
