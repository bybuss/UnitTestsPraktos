package bob.colbaskin.unittesting.data

const val MAX_NO_OF_WORDS = 10
const val SCORE_INCREASE = 20

val allWords: Set<String> =
    setOf(
        "авто",
        "танец",
        "гитара",
        "каньон",
        "велосипед",
        "компьютеры",
        "путешествие",
        "путеводитель",
        "исследование",
        "многогранность"
    )

private val wordLengthMap: Map<Int, String> = allWords.associateBy({ it.length }, { it })

internal fun getUnscrambledWord(scrambledWord: String) = wordLengthMap[scrambledWord.length] ?: ""