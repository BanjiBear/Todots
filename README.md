The files are not well-organized and complete (e.g. gradle files) but source code are all included
Updates will be done soon and completely

# Todots
Todots gives you the comfort you deserve and serves as a smart assistant which can keep all your tasks organized, so you can focus on doing the tasks rather than planning what to do. As students we realized what issues we faced with deadlines, not knowing how to start working on projects. We understand that tasks aren’t binary, they need more than just add/delete. That’s why we invented the Todos Task Life Stages: 
1.Planned 2. Started 3. 50% 4. Done 

Todots is developed using cleient and server architechture, it allows users to assign 3 priority levels: #1, #2, #3, 1 being the most important. Apart from the user setting the priority of the work to be done by themself, the applications alters the priority according to the workload it senses or the time left for the particular assignment. Todots hopes to improve the overall user experience and work better with tasks.

# Installation
Todots is still in its development phase. The APP can be installed and deployed using Android phones while connected with wired to the computer
Select Developer options, and then enable USB debugging (if applicable).
Set up your system to detect your device.
    For Chrome OS and macOS, no additional configuration is required.
    For Ubuntu Linux, there are two things that need to be set up correctly: each user that wants to use adb needs to be in the plugdev group, and the system needs to have udev rules installed that cover the device.
    For Windows, Install a USB driver for ADB (if applicable)
When you are set up and plugged-in over USB, you can click Run in Android Studio to build and run your app on the device.
For other approaches, please refer to: https://developer.android.com/studio/run/device

# Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.

# License
MIT

# To-Do
The current APP allows client to do the following functions:
          Connect to the server
          Register or login
          Add Tasks, set Deadline and Priority

The server manages the database with client information

Things to do:
    Able to change Priority according to the time left
    Able to checks the workload according to Task name
