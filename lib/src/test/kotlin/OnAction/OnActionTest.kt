package OnAction

import kotlin.test.Test
import kotlin.test.assertTrue

class OnActionTest {
    @Test fun onAction() {
        val ONE_ACTION = "ONE_ACTION"
        val MSG_TXT = "NEW TEXT"

        OnAction.addOnAction(ONE_ACTION, object : OnAction.OnActionListener {
            override fun onAction(it: Any) {
                assertTrue(it == "")
            }
        })
        // OnAction.doAction(ONE_ACTION, MSG_TXT)
    }
}