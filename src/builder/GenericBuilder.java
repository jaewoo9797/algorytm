package builder;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class GenericBuilder<T> {
    private final Supplier<T> supplier;

    private GenericBuilder(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public static <T> GenericBuilder<T> of(Supplier<T> supplier) {
        return new GenericBuilder<>(supplier);
    }

    public <P> GenericBuilder<T> with(BiConsumer<T, P> consumer, P value) {
        return new GenericBuilder<>(() -> {
            T object = supplier.get();
            consumer.accept(object, value);
            return object;
        });
    }

    public T build() {
        return supplier.get();
    }

    public static void main(String[] args) {
        var genericPost = GenericBuilder.of(GenericPost::new)
                .with(GenericPost::setName, "name")
                .with(GenericPost::setAge, 18)
                .build();

    }
}
