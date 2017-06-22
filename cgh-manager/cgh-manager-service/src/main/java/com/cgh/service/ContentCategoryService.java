package com.cgh.service;

import java.util.List;

import com.cgh.common.pojo.EUTreeNode;
import com.cgh.common.pojo.TaotaoResult;

public interface ContentCategoryService {

	List<EUTreeNode> getCategoryList(long parentId);
	TaotaoResult insertContentCategory(long parentId, String name);
}
