package com.aduran.mytutsiboot.service;

import java.util.List;

import com.aduran.mytutsiboot.model.TutsiBoot;

public interface TutsiBootService {
// Define the operations
	TutsiBoot createTutsiBoot(TutsiBoot myTustsiBoot);
	List<TutsiBoot> getAllBoot();
	TutsiBoot getById(String idBoot);
	TutsiBoot updateTutsiBoot(TutsiBoot myTutsiBoot);
	void deleteTutsiBoot(String idBoot);
}
