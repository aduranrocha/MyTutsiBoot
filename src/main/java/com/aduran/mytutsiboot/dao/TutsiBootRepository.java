package com.aduran.mytutsiboot.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.aduran.mytutsiboot.model.TutsiBoot;

@Repository
public interface TutsiBootRepository extends MongoRepository <TutsiBoot,String>{

}
