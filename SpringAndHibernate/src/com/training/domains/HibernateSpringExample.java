package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Doctor;
import com.training.iface.MyDAO;

public class HibernateSpringExample extends HibernateDaoSupport implements MyDAO<Doctor>{

	
	@Override
	public Serializable add(Doctor doc) {
		
		Serializable key = getHibernateTemplate().save(doc);
		return key;
	}

	@Override
	public Doctor find(Serializable obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Doctor obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Serializable obj) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
