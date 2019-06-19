# Framework Overview

	Language : Java (jdk version : 1.8)

	Automation Tool : Appium	

	Build Repository: Maven

	Testing Framewotk: TestNG

	Framework Model: POM

	Reporting: Extent Reports
	
## This is an Appium TestNG Hybrid Framework based on Page Object Pattern. I am using Selendroid (http://selendroid.io/) test apk as my Test App. 

### Below are the screenshots of the selendroid test app

![1Capture](https://user-images.githubusercontent.com/41640976/59082631-b247a580-8911-11e9-9147-49ebbd03399f.JPG)

*************************************************

![2Capture](https://user-images.githubusercontent.com/41640976/59083103-9a712100-8913-11e9-9e66-d34d229adf7e.JPG)

*************************************************

![3Capture](https://user-images.githubusercontent.com/41640976/59083125-aa890080-8913-11e9-8046-4e4123587aeb.JPG)

*************************************************

![4Capture](https://user-images.githubusercontent.com/41640976/59083138-ba084980-8913-11e9-9de3-8b0c29a9c5fb.JPG)

*************************************************

![5Capture](https://user-images.githubusercontent.com/41640976/59083145-c7bdcf00-8913-11e9-8119-e4ccc072c1c9.JPG)

**************************************************

![6Capture](https://user-images.githubusercontent.com/41640976/59094331-850bef00-8933-11e9-95c0-9fcfe6eb10c6.JPG)

**************************************************

### Eclipse IDE

![10Capture](https://user-images.githubusercontent.com/41640976/59094360-994fec00-8933-11e9-81c5-aee1514e823d.JPG)


### Emulator Used While Testing

![11Capture](https://user-images.githubusercontent.com/41640976/59094407-b1277000-8933-11e9-9349-a341b48742e6.JPG)


### UI Automator Viewer [for spying the locators]

![12Capture](https://user-images.githubusercontent.com/41640976/59094470-d2885c00-8933-11e9-922f-beffa261d4b7.JPG)





# Important tasks before setting up project

### 1- Download and setup 

	java jdk 8
	eclipse IDE
	Git Bash
	Microsoft .Net Framework 4.5.1 or above (if not installed)
	Node  (if not installed)
	

### 2- Appium

1- Install Appium through node command prompt

	>npm install -g appium
	
2- To start appium from Command Prompt

	>appium
	
3- To stop appium from running from Command prompt

	>CTRL+C
	
	>Y

4- To uninstall Appium from system

	>npm uninstall -g appium
	
### 3- Android SDK Manager

If android studio is already anstalled, Android SDK Manager comes bundled with it

Else download Android SDK Manager from the following link

	https://dl.google.com/android/installer_r24.4.1-windows.exe?utm_source=androiddevtools.cn&utm_medium=website
	
Or google this 

	installer_r24.4.1-windows.exe	
	
### 4- To lunch android sdk manager

	>android
	
### 5- To lunch AVD manager

	>android avd
	
### 6- To open UiAutomatorViewer to spy/ locate android UI elements

	>uiautomatorviewer
	
If this does not work, go to this path and run the batch file

	C:\androidSdk(local android sdk folder)\tools\bin\uiautomatorviewer.bat
	
# Steps to setup project in your local system:

1- create a folder with any name and right click inside it and select Git bash here

	>git init
	
	>git remote add origin <repository URL>
	
	>git pull origin master
	
3- Inside CreateSession class Change this paths as per your local system

main.js path

	C:\Users\userName(your local system name)\AppData\Roaming\npm\node_modules\appium\build\lib

node.exe path

	C:\Program Files (x86)\nodejs
	
    

# to link your eclipse project to git repo

1- eclipse-> window -> showview -> other -> git -> git repositories -> open

2- Select ->  add an existing local git repository to the view

3- Click on the browse button and navigate to the directory that contains 
   the project source code
   
4- Click the Search button, Click OK

5- Right-click on the project in the Package Explorer

6- Go to Team

### To know appPackage and appActivity

open the app, open cmd

	>adb devices

List of devices attached

a49cxx123xxx    device    [example]


	>adb shell

	>dumpsys window windows | grep -E ‘mCurrentFocus’

in.android.appName/in.android.appName.HomeActivity

appPackage ____________ appActivity

## To Read Toast message [Not implemented yet]

	1.Need to add Tess4J dependency to maven project.
	
	2.Need to add libtesseract304.dll to the System Variables.
	
	3.Need to add liblept172.dll to the System Variables.
	
	4.create one folder tessdata within your maven project. 
	
	This tessdata will contain “eng.traineddata” for reading english text. 
	

	