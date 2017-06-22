package com.cgh.service;

import java.util.List;

import com.cgh.common.pojo.EUTreeNode;

public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
