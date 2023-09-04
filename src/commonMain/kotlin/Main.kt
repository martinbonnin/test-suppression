public expect class ZDeferred<T>


@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
public expect inline fun <T, S> ZDeferred<T>.then(noinline thenFn: (T) -> S): ZDeferred<S>