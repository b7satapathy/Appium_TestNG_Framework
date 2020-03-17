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



## Important tasks before setting up project

### 1- Download and setup 

	java jdk 8
	eclipse IDE
	Git Bash
	Microsoft .Net Framework 4.5.1 or above
	Node
	
### 2- Appium Installation

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

If Android studio is already installed, Android SDK Manager comes bundled with it

Open Android Studio, Go to tools and select SDK Manager,
Change Android SDK location to C:\android_sdk folder

### Make sure latest version of following files are downloaded using SDK Manager.

1) Android SDK Build Tools
2) Android SDK Command line Tools
3) Android Emulator
4) Android SDK Platform tools
5) Intel x86 Emulator Accelator (HAXM installer)
6) Build Tools

### In new downloads of Android Studio, SDK Tools is missing in SDK Manager

So in this case we have to download previous version of SDK Manager with SDK Tools

1) Download SDK Manager 

google this -> installer_r24.4.1-windows.exe
or open following URL
https://dl.google.com/android/installer_r24.4.1-windows.exe?utm_source=androiddevtools.cn&utm_medium=website

2) Install the file ( in a separate folder not in C:\android_sdk folder) 
3) Now SDK Manager window will open, Check Only Build Tools and download the file, uncheck everything else except Build Tools
4) Copy the Tools folder and paste it inside C:\android_sdk folder
5) Now Build Tools will show in SDK Manager of Android Studio (Update it)
6) Now uninstall Sdk Build tools from control panel

### Set Up Environment Variable

Create ANDROID_HOME  -> C:\android_sdk

Inside Path add following location
1) C:\android_sdk\tools
2) C:\android_sdk\tools\bin
3) C:\android_sdk\build-tools
4) C:\android_sdk\platform-tools
5) C:\android_sdk\cmdline-tools\latest\bin
6) C:\android_sdk\cmdline-tools\latest\lib
7) C:\android_sdk\emulator
8) C:\android_sdk

	
## Verify installation has done correctly

1) Connect a device through USB or open an emulator device
    
   Open Terminal and type
   
###   > adb devices
   
   This should show the connected device ID   
   
2) 	Open Terminal and type
   
###   > uiautomatorviewer
	
  This is used To open UiAutomatorViewer to spy/ locate android UI elements
	
    If this does not work, go to this path and run the batch file

	C:\androidSdk(local android sdk folder)\tools\bin\uiautomatorviewer.bat
	
## Steps to setup project in your local system:

1- create a folder with any name and right click inside it and select Git bash here

	>git init
	
	>git clone <repo_url>

## Eclipse Setup

1) Import the folder into Eclipse
2) Install TestNg
   https://marketplace.eclipse.org/content/testng-eclipse
3) Right click on the project and Select Convert to TestNG

### Inside CreateSession class Change this paths as per your local system

### main.js path

	C:\Users\userName(your local system name)\AppData\Roaming\npm\node_modules\appium\build\lib

### node.exe path

	C:\Program Files (x86)\nodejs

### Update the path of debug apk 
    
## Eclipse Setup

1) Import the folder
2) Install TestNg
    for version 6.14.3
    https://dl.bintray.com/testng-team/testng-eclipse-release/updatesites/6.14.3.201902250526/
3) Right click on the project and Select Convert to TestNG


### to link your eclipse project to git repo

1- eclipse-> window -> showview -> other -> git -> git repositories -> open

2- Select ->  add an existing local git repository to the view

3- Click on the browse button and navigate to the directory that contains 
   the project source code
   
4- Click the Search button, Click OK

5- Right-click on the project in the Package Explorer

6- Go to Team

### To know appPackage and appActivity

Open the Test App in your Test Device, open Terminal and check the device is connected

###	>adb devices

[ Here List of devices attached will show, now check app activity and app package name

###	>adb shell

###	>dumpsys window windows | grep -E ‘mCurrentFocus’

Example : in.android.test/in.android.test.HomeActivity

            appPackage/appActivity
            

### To Read Toast message

	1.Need to add Tess4J dependency to maven project.
	
	2.Need to add libtesseract304.dll to the System Variables.
	
	3.Need to add liblept172.dll to the System Variables.
	
	4.create one folder tessdata within your maven project. 
	
	This tessdata will contain “eng.traineddata” for reading english text. 
	
## Other FAQ's

### 1- Error related to your SSH Key While cloning the repository, Go through this blog

https://www.genuinecoder.com/how-to-fix-permission-denied-publickey-issue-in-gitlab/
	
