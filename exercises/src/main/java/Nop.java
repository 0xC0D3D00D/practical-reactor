import java.util.function.BiFunction;
import java.util.function.Function;

public interface Nop<V1,V2,R> {
    static <V1,V2> void nop(V1 v1, V2 v2) {
    }

    static <V1, V2, R> BiFunction<V1, V2, R> nop(R r) {
        return (v1,v2) -> r;
    }
}
