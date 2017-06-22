package com.cgh.portal.service;

import com.cgh.portal.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, int page);
}
