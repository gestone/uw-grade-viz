package com.models.query;

import java.util.List;

public class Query {

    private Action action;

    private Query(Action action, List<Class> classes) {
        this.action = action;
    }

}
