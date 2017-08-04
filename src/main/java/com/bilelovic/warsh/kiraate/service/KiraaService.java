package com.bilelovic.warsh.kiraate.service;

import java.util.List;

import com.bilelovic.warsh.kiraate.domain.Kiraa;

public interface KiraaService {

	List<Kiraa> listAll();

	Kiraa getById(String id);

	Kiraa saveOrUpdate(Kiraa product);

    void delete(String id);

}
