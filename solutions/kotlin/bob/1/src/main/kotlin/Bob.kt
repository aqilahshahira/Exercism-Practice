object Bob {
    fun hey(input: String): String {
        var answer = ""
        var trimmedInput = input.trim()
        var question = trimmedInput.endsWith("?")
        var yelling = trimmedInput == input.uppercase() && input.any { it.isLetter() }

        if (question && yelling) {
            answer += "Calm down, I know what I'm doing!"
        }
        else if (question) {
            answer += "Sure."
        }
        else if (yelling) {
            answer += "Whoa, chill out!"
        }
        else if (trimmedInput.isEmpty()) {
            answer += "Fine. Be that way!"
        }
        else {
            answer += "Whatever."
        }
        return answer
    }
}
