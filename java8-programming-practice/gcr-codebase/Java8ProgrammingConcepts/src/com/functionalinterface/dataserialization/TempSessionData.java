package com.functionalinterface.dataserialization;

import java.io.Serializable;

class TempSessionData implements Serializable {
    private String sessionId;

    public TempSessionData(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "TempSessionData{sessionId='" + sessionId + "'}";
    }
}

