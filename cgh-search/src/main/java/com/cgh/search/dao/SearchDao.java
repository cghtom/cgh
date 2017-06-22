package com.cgh.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.cgh.search.pojo.SearchResult;

public interface SearchDao {

	SearchResult search(SolrQuery query) throws Exception;
}
