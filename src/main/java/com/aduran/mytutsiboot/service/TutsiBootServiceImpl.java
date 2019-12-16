package com.aduran.mytutsiboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aduran.mytutsiboot.dao.TutsiBootRepository;
import com.aduran.mytutsiboot.model.TutsiBoot;

@Service
public class TutsiBootServiceImpl implements TutsiBootService {
	@Autowired
	private TutsiBootRepository repository;
	
	@Override
	public TutsiBoot createTutsiBoot(TutsiBoot myTutsiBoot) {
		return repository.insert(myTutsiBoot);
	}

	@Override
	public List<TutsiBoot> getAllBoot() {
		return repository.findAll();
	}

	@Override
	public TutsiBoot getById(String idBoot) {
		return repository.findById(idBoot).get();
	}

	@Override
	public TutsiBoot updateTutsiBoot(TutsiBoot myTutsiBoot) {
		TutsiBoot boot = getById(myTutsiBoot.getIdBoot());
		boot.setNameBoot(myTutsiBoot.getNameBoot());
		boot.setColorBoot(myTutsiBoot.getColorBoot());
		boot.setSizeBoot(myTutsiBoot.getSizeBoot());
		boot.setWeigth(myTutsiBoot.getWeigth());
		boot.setArticles(myTutsiBoot.getArticles());
		return repository.save(boot);
	}

	@Override
	public void deleteTutsiBoot(String idBoot) {
		repository.deleteById(idBoot);

	}

}
