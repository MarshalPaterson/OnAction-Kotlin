[![](https://jitpack.io/v/MarshalPaterson/OnAction.svg)](https://jitpack.io/#MarshalPaterson/OnAction) [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/Naereen/StrapDown.js/graphs/commit-activity) [![PyPI license](https://img.shields.io/pypi/l/ansicolortags.svg)](https://pypi.python.org/pypi/ansicolortags/) 	![Kotlin](https://img.shields.io/badge/kotlin-%230095D5.svg?style=for-the-badge&logo=kotlin&logoColor=white)  

# OnAction
Android Library using Kotlin with the Observer Pattern. OnAction is a lightweight implementation that helps the over engineering on a app. Just want to get your API calls data to the UI the easiest way possible, OnAction is for you.

Step 1. Add the JitPack repository to your build file
```
repositories {
    maven { url 'https://jitpack.io' }
}
```
Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.MarshalPaterson:OnAction:1.6.8'
}
```
First setup OnAction Type and Listener
```
// Constant Action type
val ONE_ACTION = "ONE_ACTION"

// Add Listener OnAction to the Action type
OnAction.addOnAction(ONE_ACTION, object : OnAction.OnActionListener {
    override fun onAction(it: Any) {
        // Do something with 'it' which is the data returning from the action
    }
})
```
Trigger OnAction to all the Listeners sending data.
```
// This OnAction doAction sends 'New Text' for the type 'ONE_ACTION'
OnAction.doAction(ONE_ACTION, "NEW TEXT")
```
Sending data, to easy, plan and simply.

For a App example please find it at https://github.com/MarshalPaterson/OnActionExample

## Contributor

[![Marshal Paterson](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://github.com/MarshalPaterson)
