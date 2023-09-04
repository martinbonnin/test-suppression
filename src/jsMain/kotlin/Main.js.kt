import kotlin.js.Promise

public actual typealias ZDeferred<T> = Promise<T>


actual inline fun <T, S> ZDeferred<T>.then(noinline thenFn: (T) -> S): ZDeferred<S> {
    TODO("Not yet implemented")
}