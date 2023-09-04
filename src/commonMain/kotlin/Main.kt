public expect class ZDeferred<T>

public expect inline fun <T, S> ZDeferred<T>.then(noinline thenFn: (T) -> S): ZDeferred<S>