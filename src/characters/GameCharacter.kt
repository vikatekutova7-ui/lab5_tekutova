package characters

import kotlin.coroutines.CoroutineContext

open class GameCharacter (
    val name: String,
    val hp: Int = 0,
    val element: String = "Нейтральный"

    )