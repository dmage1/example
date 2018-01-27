package com.examples.spring;

import org.springframework.stereotype.Service;

/**
 * Implementation of above DataModelService interface.
 */
@Service("ml")
public class MachineLearningService implements DataModelService {

    @Override
    public boolean isValid(String input) {
        return true;
    }

}