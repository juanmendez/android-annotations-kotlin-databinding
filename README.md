# android-annotation-studio-demo
This is a small proof demo using JayWay's approach to run Android Annotations in Android Studio 1.0.X
For comparison I made two branches one having the original project and then the master one using Android Annotations.

1. In Android Studio import this project
2. Go to "Build" and click "Rebuild Project"
3. Debug it!

All the changes that took place are here
1. download the source code from https://github.com/excilys/androidannotations/wiki/Download
2. copy the jar file ( currently androidannotations-api-3.2.jar ) and at the root of your project create a libs folder. paste the jar file there.
3. Modify the gradle's app file. see the article ( http://www.jayway.com/2014/12/19/androidannotations-setup-android-studio )
4. As usual in Android Annotations modify your manifest activity declarations having underscore as suffix.
5. Go to "Build" and click "Rebuild Project"
