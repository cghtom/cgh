package com.cgh.rest.service;

import java.util.List;

import com.cgh.pojo.TbContent;

public interface ContentService {

	List<TbContent> getContentList(long contentCid);
}
