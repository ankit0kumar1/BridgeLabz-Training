package com.eventease;

import java.time.LocalDate;

public interface ISchedulable {

    void schedule();

    void reschedule(LocalDate newDate);

    void cancel();
}
