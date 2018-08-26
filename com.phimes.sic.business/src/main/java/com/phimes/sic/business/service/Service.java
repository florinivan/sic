package com.phimes.sic.business.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public abstract class Service<T, ID extends Serializable> implements IService<T, ID> {

	protected abstract CrudRepository<T, ID> getCrudRep();

	public T saveOrUpdate(T t) {
		return getCrudRep().save(t);

	}

	public void delete(T t) {
		getCrudRep().delete(t);
	}

	public T get(ID id) {
		return getCrudRep().findOne(id);

	}

	public List<T> findAll() {
		Iterable<T> iterable = getCrudRep().findAll();
		List<T> dest = new ArrayList<>();
		iterable.forEach(dest::add);
		return dest;
	}
}
