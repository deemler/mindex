package com.mindex.challenge.dao;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by DEmler on 5/20/2018.
 */
@Repository
public interface CompensationRepository extends MongoRepository<Compensation, String> {
	Compensation findCompensationByEmployee(Employee employee);
}
