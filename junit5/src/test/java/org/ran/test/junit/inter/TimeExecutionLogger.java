package org.ran.test.junit.inter;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ran.test.junit.materiel.extension.TimingExtension;

@Tag("timed")
@ExtendWith(TimingExtension.class)
public interface TimeExecutionLogger {

}
