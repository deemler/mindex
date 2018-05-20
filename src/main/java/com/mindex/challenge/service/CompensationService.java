package com.mindex.challenge.service;

import com.mindex.challenge.data.Compensation;

/**
 * Created by DEmler on 5/20/2018.
 */
public interface CompensationService {
	Compensation create(Compensation compensation);
	Compensation read(String id);
}
