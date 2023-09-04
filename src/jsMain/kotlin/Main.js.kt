import kotlin.js.Promise as Promise1

@Suppress("ACTUAL_TYPE_ALIAS_TO_CLASS_WITH_DECLARATION_SITE_VARIANCE", "ACTUAL_WITHOUT_EXPECT")
public actual typealias ZDeferred<T> = Promise1<T>

@Suppress("EXTENSION_SHADOWED_BY_MEMBER")
actual inline fun <T, S> ZDeferred<T>.then(noinline thenFn: (T) -> S): ZDeferred<S> {
    TODO("Not yet implemented")
}