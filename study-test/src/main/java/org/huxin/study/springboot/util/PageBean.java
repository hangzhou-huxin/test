package org.huxin.study.springboot.util;

import java.util.List;

public class PageBean<T> {
	
	public PageBean(List<T> list ,Long totalCount){
		this.list = list ;
		this.totalCount = totalCount ;
	}
	
	public PageBean(){
		
	}
	
	private List<T> list ;
	
	private Long totalCount ;
	
	//private Integer pageNo ;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
