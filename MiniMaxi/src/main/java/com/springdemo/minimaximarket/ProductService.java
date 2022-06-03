package com.springdemo.minimaximarket;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ProductService {
	@Autowired
	private ProductRepository repo;

	public List<Proizvod> listAll() {
		return repo.findAll();
	}

	public void save(Proizvod proizvod) {
		repo.save(proizvod);
	}

	public Proizvod get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

}
