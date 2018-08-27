package com.phimes.sic.api.service;
import java.io.Serializable;
import java.util.List;

	public interface IService <T, ID extends Serializable> {
	

	public T saveOrUpdate(T t); 
	
	public void delete (T t);
	
	public T get(ID id );
	
	public List<T> findAll();
	
	

}
