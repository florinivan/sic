package com.phimes.sic.business.service;
import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

	public interface IService <T, ID extends Serializable> {
	
	@Transactional	
	public T saveOrUpdate(T t); 
	@Transactional
	public void delete (T t);
	
	public T get(ID id );
	
	public List<T> findAll();
	
	

}
