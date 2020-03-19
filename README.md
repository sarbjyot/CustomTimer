Here the custom library for timer with color theme change.

Add the below code in project.gradle file:-

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
 Now Add dependency in app.gradle file:-

	dependencies {
	        implementation 'com.github.sarbjyot:customtimer:Tag'
	}
  
  Thanks
