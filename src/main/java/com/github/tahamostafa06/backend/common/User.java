package com.github.tahamostafa06.backend.common;

import com.github.tahamostafa06.backend.common.database.Record;

public abstract class User implements Record {
    protected String role;
    protected String username;
}
