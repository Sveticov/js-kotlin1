import kotlinx.browser.document
import kotlinx.html.js.onClickFunction
import kotlinx.html.onClick
import react.dom.*

import react.dom.render
var any_text = "random"
val listTest = listOf<String>("TR", "gh", "VC", "SD", "NM")
fun main() {
    render(document.getElementById("root")) {
        h1 {
            +"Hello, React+Kotlin/JS"
        }
        ul {
            for (n in listTest) {
                li { +"test $n" }
            }
        }

        button {
            +"My Button"

            attrs.onClickFunction = {
                any_text = chengAnyValue()
                println(any_text)
               
            }
        }
        p{
            +" $any_text"
        }
    }
}

fun chengAnyValue(): String {
    return "some text"
}