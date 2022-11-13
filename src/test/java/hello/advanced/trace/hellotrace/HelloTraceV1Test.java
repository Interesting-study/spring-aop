package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTraceV1Test {

    @Test
    void begin_end() throws Exception {
        //given
        HelloTraceV1 trace = new HelloTraceV1();

        //when
        TraceStatus status = trace.begin("hello");

        //then
        trace.end(status);

    }


    @Test
    void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.exception(status, new IllegalStateException());
    }
}