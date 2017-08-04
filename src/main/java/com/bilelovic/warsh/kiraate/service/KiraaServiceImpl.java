package com.bilelovic.warsh.kiraate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bilelovic.warsh.kiraate.domain.Kiraa;
import com.bilelovic.warsh.kiraate.repository.KiraaRepository;

@Service
public class KiraaServiceImpl implements KiraaService {

	@Autowired
	private KiraaRepository repository;
	
	
	@Override
	public List<Kiraa> listAll() {
		return repository.findAll();
	}

	@Override
	public Kiraa getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Kiraa saveOrUpdate(Kiraa kiraa) {
		repository.save(kiraa);	
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
