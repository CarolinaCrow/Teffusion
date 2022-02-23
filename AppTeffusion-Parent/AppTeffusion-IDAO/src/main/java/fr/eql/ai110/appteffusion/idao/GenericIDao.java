package fr.eql.ai110.appteffusion.idao;

import java.util.List;

public interface GenericIDao<T> {
	
	T add(T t);
	boolean delete(T t);
	T update(T t);
	T getById(int id);
	List<T> getAll();
}
