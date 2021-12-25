package au.com.onaction

object OnAction {
    private var onActionListener: OnActionListener? = null
    private var onActionHashMap : HashMap<String, OnActionListener?> = HashMap<String, OnActionListener?> ()

    fun addOnAction(onActionType:String, onActionWithListener: OnActionListener?) {
        onActionListener = onActionWithListener
        onActionHashMap[onActionType] = onActionListener
    }
    interface OnActionListener {
        fun onAction(it: Any)
    }
    fun doAction(type: String, it: Any) {
        (onActionHashMap[type] as OnActionListener).onAction(it)
    }
}