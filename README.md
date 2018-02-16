# Android Annotations (Kotlin-Databinding) demo

Three years ago this repository was made to show how to use Android Annotations with Android Studio.
Now it has been turned around to show how to use it with Kotlin along with Databinding.

I made this new branch because like others I also had some issues to make this work around.

This demo is using `kotlinOpen`, so as you remember Android-Annotations generates subclasses of your
Android-Annotations signature classes. So this library avoids having you to write `open` in those classes
to work in Kotlin. You don't have to use `kotlinOpen` if you don't want to

I also made this demo welcoming `Gradle variants` and extending suffixes to your apk.

It's been more than three years since I discovered [Android-Annotations](http://androidannotations.org/) and is one of my favorite
Android libraries. I am so grateful for those who have contributed and keep it running.

## Running into compiling errors when using Dependency injection?
Try:

`./gradlew clean`  
`./gradlew build --stacktrace`

You can read from your terminal in more detail what's wrong.
