# CommonUtils

Android Common Utilities function collections.

### **Requirements**

1. Inside AndroidManifest.xml (IMPORTANT)

```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

2. Gradle Dependencies

   build.gradle (root)

```groovy
repositories {
  	maven { url 'https://jitpack.io' }
}
```

​	build.gradle (app)

```groovy
dependencies {
	compile 'com.github.User:Repo:Tag'
}
```

### **Helper Function Lists**

1. Check Network Status (Internet Status):

   ```java
   Utils.isNetworkAvailable(context);
   ```

   Returns a Boolean value True if Network is Enabled, Else False.

2. Check GPS Status

   ```java
   Utils.isGPSEnabled(context)
   ```

   Returns a Boolean value True if GPS is Enabled, Else False.

3. Show Toast (Short Toast)

   ```java
   Utils.showToast(context, message);
   ```

   Shows a short Toast

4. Show Long Toast

   ```java
   Utils.showLongToast(context, message);
   ```

   Shows a Long Toast

##### More Helper Functions are to be added ...